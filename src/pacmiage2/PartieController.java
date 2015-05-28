/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author Alexandre
 */
public class PartieController extends BasicGame {

    private GameContainer container;
    private Map map;
    private PacMiage player;
    private java.util.Map<Integer, Graine> grainesMap;
    private List<Fantome> listFantome;
    private AffichageScore score;
    private int compteurGC = 0;
    private float alpha = 1f;
    Image img;
    


    public PartieController() {

        super("Lesson 1 :: WindowGame");
        map = new Map();
        player = new PacMiage(map);
        grainesMap = new HashMap<Integer, Graine>();
        listFantome = new ArrayList<Fantome>();
        for (int i = 0; i < 5; i++) {
            listFantome.add(new Fantome(map));
        }
        score = new AffichageScore(map);
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        img = new Image("./src/ressources/image/questions/green_tick.png");
        this.container = container;
        this.map.init();
        //for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {
        for (int objectID = 0; objectID < 10; objectID++) {
            if ("graine".equals(map.getObjectType(objectID))) {
                String nomObjet = map.getObjectName(objectID);
                grainesMap.put(objectID, new Graine(nomObjet, map.getObjectX(objectID), map.getObjectY(objectID)));
            }
        }
        this.player.init();
        for (Fantome fantome : listFantome) {
            fantome.init();
        }

        PacMiageController controller = new PacMiageController(this.player);
        container.getInput().addKeyListener(controller);
        //Music background = new Music("./src/ressources/musique/bruno.ogg");
        //background.loop();
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        this.map.renderBackground();

        for (Integer graine : grainesMap.keySet()) {
            grainesMap.get(graine).render(g);
        }
        this.player.render(g);

        for (Fantome fantome : listFantome) {
            fantome.render(g);
        }
        this.map.renderForeground();
        this.score.render(g);
        
        g.drawImage(img, 200, 200);
        img.setAlpha(alpha);
        alpha = alpha - 0.1f;
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        // [...] test de trigger (leçon 6) 
        int graineRemove = -1;
        for (Integer uneGraine : grainesMap.keySet()) {
            Graine graine = grainesMap.get(uneGraine);
            if (graine != null) {

                if (player.estEnCollisionObjet(graine.getX(), graine.getY())) {
                    graineRemove = uneGraine;  
                }
            }
        }
        if(graineRemove != -1){
            grainesMap.remove(graineRemove);
            this.score.setArgent(this.score.getArgent()+1000);
            if(grainesMap.isEmpty()){
                
                container.pause();
                
                FenetreQuestion fenetre = null;
                try {
            //On crée une nouvelle instance de notre FenetreBoutons
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = factory.newDocumentBuilder();
            final Document document = builder.parse(new File("./src/ressources/questions/questions.xml"));
            Element racine = document.getDocumentElement();
            QuestionBuilder qBuilder = new QuestionBuilder(racine);
            fenetre = new FenetreQuestion(qBuilder.getQuestion(1));
            fenetre.setVisible(true);//On la rend visible

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FenetreQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(FenetreQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FenetreQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
                while(fenetre.isVisible()){
                    container.sleep(100);
                }

                
                container.resume();
            }
        }
        
        this.player.update(delta);
        for (Fantome fantome : listFantome) {
            fantome.update(delta);
        }
        
        if(this.compteurGC==4){
            System.gc();
            this.compteurGC = 0;
        }
        this.compteurGC++;
        
    }

}
