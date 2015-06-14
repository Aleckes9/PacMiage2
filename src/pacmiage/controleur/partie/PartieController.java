/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.controleur.partie;

import pacmiage.listener.PacMiageController;
import pacmiage.modele.ControleurTemps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import pacmiage.vue.partie.PartieAffichageScore;
import pacmiage.vue.partie.PartieAffichageTemps;
import pacmiage.vue.partie.PartieAffichageImageFondu;
import pacmiage.modele.Fantome;
import pacmiage.modele.JoueurInfo;
import pacmiage.vue.partie.PartieAffichageMap;
import pacmiage.modele.Objet;
import pacmiage.modele.ObjetPartie;
import pacmiage.modele.PacMiage;
import pacmiage.utiles.Configuration;
import pacmiage.utiles.SauvegardeFichier;
import pacmiage.vue.partie.PartieAffichageObjetBonus;

/**
 * Controleur de la partie PacMiage, gère la mise à jour et l'affichage des différents éléments de la partie.
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PartieController extends BasicGame {

    private boolean gameOver;
    private int multiplicateur;
    private boolean collision;
    private boolean fantomeMove;
    private int niveau;
    private AppGameContainer game;
    private GameContainer container;
    private Music background;

    private final String cheminCarte;
    private ControleurTemps tempsBonus;

    private final PartieAffichageMap map;
    private PartieAffichageScore score;
    private final PartieAffichageTemps temps;
    private PartieAffichageImageFondu imageVeracite;

    private final PacMiage player;
    private final java.util.Map<Integer, ObjetPartie> grainesMap;
    private final List<Fantome> listFantome;
    private final ControleurTemps timer;
    private PartieAffichageObjetBonus[] affichageBonus;

    private final ControleurQuestion ctrlQuestion;

    /**
     * Constructeur de PartieController 
     * @param unNiveau
     * @param unCheminCarte
     * @throws SlickException
     */
    public PartieController(int unNiveau, String unCheminCarte) throws SlickException {
        super("PacMiage");

        multiplicateur = 1;
        collision = true;
        fantomeMove = true;
        gameOver = false;
        niveau = unNiveau;
        cheminCarte = unCheminCarte;

        map = new PartieAffichageMap();

        player = new PacMiage(map, Configuration.getInstance().recupererValeur("pacNormal"));
        grainesMap = new HashMap<>();
        listFantome = new ArrayList<>();

        score = new PartieAffichageScore();
        temps = new PartieAffichageTemps();

        timer = new ControleurTemps(120);
        affichageBonus = new PartieAffichageObjetBonus[4];
        ctrlQuestion = new ControleurQuestion();

        ctrlQuestion.initQuestion();
    }

    /**
     *
     * @return
     */
    public PacMiage getPlayer() {
        return player;
    }

    /**
     *
     * @return
     */
    public List<Fantome> getListFantome() {
        return listFantome;
    }

    /**
     *
     * @param container
     * @throws SlickException
     */
    @Override
    public void init(GameContainer container) throws SlickException {
        container.setForceExit(false);
        this.container = container;
        this.map.init(cheminCarte);
        int idDepartFant = 0;
        List<Integer> idObjetsBonus = new ArrayList<>();
        for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {

            if ("graine".equals(map.getObjectType(objectID))) {  
                grainesMap.put(objectID, new ObjetPartie(map.getObjectX(objectID), map.getObjectY(objectID), Configuration.getInstance().recupererValeur("graine")));
            }
            if ("objet".equals(map.getObjectType(objectID))) {
                idObjetsBonus.add(objectID);
            }
            if ("originePac".equals(map.getObjectType(objectID))) {
                this.player.init(map.getObjectX(objectID), map.getObjectY(objectID));
            }
            if ("origineFantome".equals(map.getObjectType(objectID))) {
                Fantome fantome = new Fantome(map, Configuration.getInstance().recupererValeur("carteFantome" + niveau));
                listFantome.add(fantome);
                fantome.initAnimation();
                fantome.initEtat(map.getObjectX(objectID), map.getObjectY(objectID));

            }
            if ("score".equals(map.getObjectType(objectID))) {
                score.initPos(map.getObjectX(objectID), map.getObjectY(objectID));
            }
            if ("departFantome".equals(map.getObjectType(objectID))) {
                idDepartFant = objectID;
            }
            if ("temps".equals(map.getObjectType(objectID))) {
                temps.initPosAffichageTemps(map.getObjectX(objectID), map.getObjectY(objectID));
            }
        }

        for (Fantome fantome : listFantome) {
            fantome.initDepart(map.getObjectX(idDepartFant), map.getObjectY(idDepartFant));
        }

        int compteurobjet = 0;
        for (Objet objetBonus : JoueurInfo.getInstance().getObjetDispo()) {
            if (objetBonus != null) {
                affichageBonus[compteurobjet] = new PartieAffichageObjetBonus(objetBonus, map.getObjectX(idObjetsBonus.get(compteurobjet)), map.getObjectY(idObjetsBonus.get(compteurobjet)));
                compteurobjet++;
            } else {
                affichageBonus[compteurobjet] = null;
            }

        }

        PacMiageController controller = new PacMiageController(this.player, this);
        container.getInput().addKeyListener(controller);
        background = new Music(Configuration.getInstance().recupererValeur("musique" + niveau));
        background.setVolume(0.5f);
        background.loop();
        this.timer.start();
    }

    /**
     *
     * @return
     */
    public ControleurTemps getTimer() {
        return timer;
    }

    /**
     *
     * @param container
     * @param g
     * @throws SlickException
     */
    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {

        if (!gameOver) {

            renderGame(container, g);

        } else {
            this.imageVeracite.render(g, container);
        }

    }

    /**
     *
     * @param container
     * @param g
     * @throws SlickException
     */
    public void renderGame(GameContainer container, Graphics g) throws SlickException {
        if (!grainesMap.isEmpty()) {
            this.map.renderBackground();
            for (Integer graine : grainesMap.keySet()) {
                grainesMap.get(graine).renderObjetPartie(g);
            }
            this.player.render(g);

            for (Fantome fantome : listFantome) {
                fantome.render(g);
            }
            this.score.render(g);
            this.temps.renderAffichageTemps(g);

            for (PartieAffichageObjetBonus bonus : this.affichageBonus) {
                if (bonus != null) {
                    bonus.renderObjetPartie(g);
                }
            }

            if (this.imageVeracite != null) {
                this.imageVeracite.render(g, container);
            }
        }
    }

    /**
     * Méthode update 
     * @param container
     * @param delta
     * @throws SlickException
     */
    @Override
    public void update(GameContainer container, int delta) throws SlickException {

        if (!gameOver) {

            this.temps.setTemps(this.timer.getTempsRestant());

            if (this.imageVeracite != null) {
                for (Fantome fantomevit : listFantome) {
                    fantomevit.setVitesse(2);
                }

                if (this.imageVeracite.isInvisible()) {
                    this.imageVeracite = null;
                    for (Fantome fantomevit : listFantome) {
                        fantomevit.setVitesse(2);
                    }
                }
            }

            int graineRemove = -1;

            for (Integer uneGraine : grainesMap.keySet()) {
                ObjetPartie graine = grainesMap.get(uneGraine);
                if (graine != null) {
                    if (player.estEnCollisionObjet(graine.getXObjetPartie(), graine.getYObjetPartie())) {
                        graineRemove = uneGraine;
                    }
                }
            }

            if (graineRemove != -1) {
                grainesMap.remove(graineRemove);
                this.score.setFutureScore(this.score.getFutureScore() + 10 * multiplicateur);
                if (grainesMap.isEmpty()) {
                    boolean choix = ouvertureQuestion();
                    JoueurInfo.getInstance().setRecord(score.getFutureScore());
                    JoueurInfo.getInstance().ajouterGraines(score.getFutureScore());
                    if(choix){
                        container.exit();
                    }
                }
            }

            this.player.updatePac();
            for (Fantome fantome : listFantome) {
                if (collision) {
                    if (fantome.estEnCollisionCible(this.player.getCenterX(), this.player.getCenterY())) {
                        ouvertureQuestion();
                        fantome.resetPos();
                    }
                } else {
                    if (tempsBonus.getTempsRestant() == 0) {
                        player.setImagePac(Configuration.getInstance().recupererValeur("pacNormal"));
                        collision = true;
                    }
                }

                fantome.updateFantome(this.player.getX(), this.player.getY());
            }

            if (timer.getTempsRestant() == 0) {
                JoueurInfo.getInstance().setRecord(score.getFutureScore());
                JoueurInfo.getInstance().ajouterGraines(score.getFutureScore());
                SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));
                imageVeracite = new PartieAffichageImageFondu(new Image(Configuration.getInstance().recupererValeur("gameOver")));
                gameOver = true;

            }
        } else {
            if (this.imageVeracite.isInvisible()) {
                container.exit();
            }
        }

        if (tempsBonus != null && tempsBonus.getTempsRestant() == 0) {
            for (Fantome fantome : listFantome) {
                fantome.setVitesse(2);
            }
            player.setVitesse(2);
        }

    }

    private boolean ouvertureQuestion() throws SlickException {
        timer.stop();
        container.pause();
        this.game.setFullscreen(false);
        ctrlQuestion.afficherQuestion(niveau);
        while (ctrlQuestion.getFenetre().isVisible()) {
            container.sleep(100);
        }

        this.game.setFullscreen(true);

        container.resume();

        boolean choix = ctrlQuestion.getFenetre().isChoix();

        if (choix) {
            imageVeracite = new PartieAffichageImageFondu(new Image(Configuration.getInstance().recupererValeur("repValide")));
            this.score.setFutureScore(this.score.getFutureScore() + 100);

        } else {
            imageVeracite = new PartieAffichageImageFondu(new Image(Configuration.getInstance().recupererValeur("repFausse")));
            timer.setTempsRestant(timer.getTempsRestant() - 10);
        }
        container.sleep(2000);
        timer.start();
        return choix;
    }

    /**
     *
     * @return
     */
    public GameContainer getContainer() {
        return container;
    }

    /**
     *
     * @return
     */
    public Music getBackground() {
        return background;
    }

    /**
     *
     * @return
     */
    public AppGameContainer getGame() {
        return game;
    }

    /**
     *
     * @param game
     */
    public void setGame(AppGameContainer game) {
        this.game = game;
    }

    /**
     *
     * @return
     */
    public PartieAffichageObjetBonus[] getAffichageBonus() {
        return affichageBonus;
    }

    /**
     *
     * @param affichageBonus
     */
    public void setAffichageBonus(PartieAffichageObjetBonus[] affichageBonus) {
        this.affichageBonus = affichageBonus;
    }

    /**
     *
     * @param multiplicateur
     */
    public void setMultiplicateur(int multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    /**
     *
     * @return
     */
    public PartieAffichageImageFondu getImageVeracite() {
        return imageVeracite;
    }

    /**
     *
     * @param imageVeracite
     */
    public void setImageVeracite(PartieAffichageImageFondu imageVeracite) {
        this.imageVeracite = imageVeracite;
    }

    /**
     *
     * @return
     */
    public boolean isCollision() {
        return collision;
    }

    /**
     *
     * @param collision
     */
    public void setCollision(boolean collision) {
        this.collision = collision;
    }

    /**
     *
     * @return
     */
    public ControleurTemps getTempsBonus() {
        return tempsBonus;
    }

    /**
     *
     * @param tempsBonus
     */
    public void setTempsBonus(ControleurTemps tempsBonus) {
        this.tempsBonus = tempsBonus;
    }

    /**
     *
     * @return
     */
    public boolean isFantomeMove() {
        return fantomeMove;
    }

    /**
     *
     * @param fantomeMove
     */
    public void setFantomeMove(boolean fantomeMove) {
        this.fantomeMove = fantomeMove;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public PartieAffichageScore getScore() {
        return score;
    }

    public void setScore(PartieAffichageScore score) {
        this.score = score;
    }
    
    
    

}
