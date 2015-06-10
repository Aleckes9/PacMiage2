/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.controleur.partie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import pacmiage2.vue.partie.Partie_AffichageScore;
import pacmiage2.vue.partie.Partie_AffichageTemps;
import pacmiage2.vue.partie.Partie_AffichageValidationReponse;
import pacmiage2.modele.Fantome;
import pacmiage2.modele.Graine;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.vue.partie.Partie_AffichageMap;
import pacmiage2.modele.Objet;
import pacmiage2.modele.PacMiage;
import pacmiage2.utiles.Configuration;
import pacmiage2.utiles.SauvegardeFichier;

/**
 *
 * @author Alexandre
 */
public class PartieController extends BasicGame {

    private JoueurInfo joueur;
    private GameContainer container;
    private Partie_AffichageMap map;
    private PacMiage player;
    private java.util.Map<Integer, Graine> grainesMap;
    private List<Fantome> listFantome;
    private Partie_AffichageScore score;
    private Partie_AffichageTemps temps;
    private Partie_AffichageValidationReponse imageVeracite;
    private Sound son;
    private Music background;
    private int niveau;
    private Objet[] listBonus;
    private int nbQuestions;
    private int nbQuestionsCorrect;
    private ControleurTemps timer;
    private String cheminCarte;
    private AppGameContainer game;
    

    public PartieController(int niveau, JoueurInfo joueur, String cheminCarte) throws SlickException {

        super("PacMiage");
        map = new Partie_AffichageMap();
        this.cheminCarte = cheminCarte;
        player = new PacMiage(map);
        grainesMap = new HashMap<Integer, Graine>();
        listFantome = new ArrayList<Fantome>();

        score = new Partie_AffichageScore();
        temps = new Partie_AffichageTemps();
        this.niveau = niveau;
        timer = new ControleurTemps(5);
        this.joueur = joueur;
    }

    public PacMiage getPlayer() {
        return player;
    }

    public List<Fantome> getListFantome() {
        return listFantome;
    }

    @Override
    public void init(GameContainer container) throws SlickException {

        this.container = container;
        this.map.init(cheminCarte);
        int idDepartFant = 0;
        for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {

            if ("graine".equals(map.getObjectType(objectID))) {
                String nomObjet = map.getObjectName(objectID);
                grainesMap.put(objectID, new Graine(nomObjet, map.getObjectX(objectID), map.getObjectY(objectID)));
            }
            if ("originePac".equals(map.getObjectType(objectID))) {
                this.player.init(map.getObjectX(objectID), map.getObjectY(objectID));
            }
            if ("origineFantome".equals(map.getObjectType(objectID))) {
                Fantome fantome = new Fantome(map);
                listFantome.add(fantome);
                fantome.init();
                fantome.initEtat(map.getObjectX(objectID), map.getObjectY(objectID));

            }
            if ("score".equals(map.getObjectType(objectID))) {
                score.initPos(map.getObjectX(objectID), map.getObjectY(objectID));
            }
            if ("departFantome".equals(map.getObjectType(objectID))) {
                idDepartFant = objectID;
            }
            if ("temps".equals(map.getObjectType(objectID))) {
                temps.initPos(map.getObjectX(objectID), map.getObjectY(objectID));
            }
        }

        for (Fantome fantome : listFantome) {
            fantome.initDepart(map.getObjectX(idDepartFant), map.getObjectY(idDepartFant));
        }

        PacMiageController controller = new PacMiageController(this.player, this, joueur);
        container.getInput().addKeyListener(controller);
//        background = new Music("./src/ressources/musique/bruno.ogg");
//        background.setVolume(0.5f);
//        background.loop();
//        son = new Sound("./src/ressources/musique/0218.ogg");

    }

    public ControleurTemps getTimer() {
        return timer;
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        
        if (!grainesMap.isEmpty()) {
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
            this.temps.render(g);
            if (this.imageVeracite != null) {
                this.imageVeracite.render(g, container);
            }
        } else {

        }

    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        this.temps.setTemps(this.timer.getTempsRestant());

        if (this.imageVeracite != null) {
            for (Fantome fantomevit : listFantome) {
                fantomevit.setVitesse(2);
            }

            if (this.imageVeracite.isInvisible()) {
                this.imageVeracite = null;
                for (Fantome fantomevit : listFantome) {
                    fantomevit.setVitesse(4);
                }
            }
        }

        int graineRemove = -1;

        for (Integer uneGraine : grainesMap.keySet()) {
            Graine graine = grainesMap.get(uneGraine);
            if (graine != null) {
                if (player.estEnCollisionObjet(graine.getX(), graine.getY())) {
                    graineRemove = uneGraine;
                }
            }
        }

        if (graineRemove != -1) {
            grainesMap.remove(graineRemove);
            this.score.setFutureScore(this.score.getFutureScore() + 10);
//            son.play();
            if (grainesMap.isEmpty()) {
                ouvertureQuestion();
            }
        }

        this.player.update(delta);
        for (Fantome fantome : listFantome) {
            if (fantome.estEnCollisionCible(this.player.getCenterX(), this.player.getCenterY())) {
                ouvertureQuestion();
                fantome.resetPos();
            }

            fantome.update(this.player.getX(), this.player.getY());
        }

        if (timer.getTempsRestant() == 0){
            JoueurInfo.getInstance().setRecord(score.getFutureScore());
            JoueurInfo.getInstance().ajouterGraines(score.getFutureScore());
            try {
                SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));
            } catch (IOException ex) {
                Logger.getLogger(PartieController.class.getName()).log(Level.SEVERE, null, ex);
            }
            container.setForceExit(false);
            container.exit();
            
        }
        
        
 
    }

    public Partie_AffichageTemps getAffichageTemps() {
        return temps;
    }

    private void ouvertureQuestion() throws SlickException {
        nbQuestions++;
        timer.stop();
        container.pause();
        ControleurQuestion ctrlQuestion = new ControleurQuestion(niveau);
        while (ctrlQuestion.getFenetre().isVisible()) {
            container.sleep(100);
        }
        container.resume();
        container.sleep(100);
        boolean choix = ctrlQuestion.getFenetre().isChoix();
        imageVeracite = new Partie_AffichageValidationReponse(choix);
        if (choix) {
            this.score.setFutureScore(this.score.getFutureScore() + 100);
            nbQuestionsCorrect++;
        } else {
            timer.setTempsRestant(timer.getTempsRestant()-10);
        }
        timer.start();
    }

    public GameContainer getContainer() {
        return container;
    }

    public Music getBackground() {
        return background;
    }

    public JoueurInfo getJoueur() {
        return joueur;
    }

    public AppGameContainer getGame() {
        return game;
    }

    public void setGame(AppGameContainer game) {
        this.game = game;
    }
    
    

}
