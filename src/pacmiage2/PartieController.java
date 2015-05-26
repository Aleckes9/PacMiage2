/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

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

        this.container = container;
        this.map.init();
        for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {
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
        Music background = new Music("./src/ressources/musique/bruno.ogg");
        background.loop();
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        // placement de camera (leçon 4)
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
            this.score.setArgent(this.score.getArgent()+1);
        }
        
        this.player.update(delta);
        for (Fantome fantome : listFantome) {
            fantome.update(delta);
        }
        
        
        // [...] mise à jour de la camera (leçon 4) 
    }

}
