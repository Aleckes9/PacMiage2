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
import org.newdawn.slick.Sound;

/**
 *
 * @author Alexandre
 */
public class PartieController extends BasicGame {

    private JoueurInfo joueur;
    private GameContainer container;
    private Map map;
    private PacMiage player;
    private java.util.Map<Integer, Graine> grainesMap;
    private List<Fantome> listFantome;
    private AffichageScore score;
    private AffichageTemps temps;
    private AffichageValidationReponse imageVeracite;
    private Sound son;
    private Music background;
    private int niveau;
    private Objet[] listBonus;
    private int nbQuestions;
    private int nbQuestionsCorrect;
    private ControlerTemps timer;
 public Music getBackground() {
        return background;
    }

    public JoueurInfo getJoueur() {
        return joueur;
    }
    public PartieController(int niveau) throws SlickException {

        super("PacMiage");
        map = new Map();
        player = new PacMiage(map);
        grainesMap = new HashMap<Integer, Graine>();
        listFantome = new ArrayList<Fantome>();
        for (int i = 0; i < 5; i++) {
            listFantome.add(new Fantome(map));
        }
        score = new AffichageScore();
        temps = new AffichageTemps();
        this.niveau = niveau;
        timer = new ControlerTemps(120);

    }

    @Override
    public void init(GameContainer container) throws SlickException {

        this.container = container;
        this.map.init();
        int compteurOrgFant = 0;
        for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {

            if ("graine".equals(map.getObjectType(objectID))) {
                String nomObjet = map.getObjectName(objectID);
                grainesMap.put(objectID, new Graine(nomObjet, map.getObjectX(objectID), map.getObjectY(objectID)));
            }
            if ("originePac".equals(map.getObjectType(objectID))) {
                this.player.init(map.getObjectX(objectID), map.getObjectY(objectID));
            }
            if ("origineFantome".equals(map.getObjectType(objectID))) {
                if (compteurOrgFant < listFantome.size()) {
                    Fantome fantome = listFantome.get(compteurOrgFant);
                    fantome.init();
                    fantome.initEtat(map.getObjectX(objectID), map.getObjectY(objectID));
                    compteurOrgFant++;
                }
            }
            if ("score".equals(map.getObjectType(objectID))) {
                score.initPos(map.getObjectX(objectID), map.getObjectY(objectID));
            }
            if ("departFantome".equals(map.getObjectType(objectID))) {
                for (Fantome fantome : listFantome) {
                    fantome.initDepart(map.getObjectX(objectID), map.getObjectY(objectID));
                }
            }
            if ("temps".equals(map.getObjectType(objectID))) {
                    temps.initPos(map.getObjectX(objectID), map.getObjectY(objectID));
            }
        }

        PacMiageController controller = new PacMiageController(this.player,this);
        container.getInput().addKeyListener(controller);
        background = new Music("./src/ressources/musique/bruno.ogg");
        background.setVolume(0.5f);
        background.loop();
        son = new Sound("./src/ressources/musique/0218.ogg");

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
            son.play();
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

    }

    private void ouvertureQuestion() throws SlickException {
        nbQuestions++;
        container.pause();
        ControlerQuestion ctrlQuestion = new ControlerQuestion(niveau);
        while (ctrlQuestion.getFenetre().isVisible()) {
            container.sleep(100);
        }
        container.resume();
        container.sleep(100);
        boolean choix = ctrlQuestion.getFenetre().isChoix();
        imageVeracite = new AffichageValidationReponse(choix);
        if (choix) {
            this.score.setFutureScore(this.score.getFutureScore() + 100);
            nbQuestionsCorrect++;
        }else{
            //this.score.setFutureScore(this.score.getFutureScore() - 100);
        }

    }

}
