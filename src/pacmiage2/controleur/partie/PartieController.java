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
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import pacmiage2.vue.partie.Partie_AffichageScore;
import pacmiage2.vue.partie.Partie_AffichageTemps;
import pacmiage2.vue.partie.Partie_AffichageImageFondu;
import pacmiage2.modele.Fantome;
import pacmiage2.modele.Graine;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.vue.partie.Partie_AffichageMap;
import pacmiage2.modele.Objet;
import pacmiage2.modele.PacMiage;
import pacmiage2.utiles.Configuration;
import pacmiage2.utiles.SauvegardeFichier;
import pacmiage2.vue.partie.Partie_AffichageObjetBonus;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PartieController extends BasicGame {

    private boolean gameOver;
    private int multiplicateur;
    private boolean collision;
    private boolean fantomeMove;
    private final int niveau;
    private AppGameContainer game;
    private GameContainer container;
    private Sound son;
    private Music background;

    private final String cheminCarte;
    private ControleurTemps tempsBonus;

    private final Partie_AffichageMap map;
    private final Partie_AffichageScore score;
    private final Partie_AffichageTemps temps;
    private Partie_AffichageImageFondu imageVeracite;

    private final PacMiage player;
    private final java.util.Map<Integer, Graine> grainesMap;
    private final List<Fantome> listFantome;
    private final ControleurTemps timer;
    private Partie_AffichageObjetBonus[] affichageBonus;
    
    private final ControleurQuestion ctrlQuestion;
    
    

    public PartieController(int unNiveau, String unCheminCarte) throws SlickException {
        super("PacMiage");
        
        multiplicateur = 1;
        collision = true;
        fantomeMove = true;
        gameOver = false;
        niveau = unNiveau;
        cheminCarte = unCheminCarte;
        
        map = new Partie_AffichageMap();
        
        player = new PacMiage(map);
        grainesMap = new HashMap<>();
        listFantome = new ArrayList<>();
        
        score = new Partie_AffichageScore();
        temps = new Partie_AffichageTemps();
        
        timer = new ControleurTemps(50);
        affichageBonus = new Partie_AffichageObjetBonus[4];
        ctrlQuestion = new ControleurQuestion();
        
        ctrlQuestion.init();
    }

    public PacMiage getPlayer() {
        return player;
    }

    public List<Fantome> getListFantome() {
        return listFantome;
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        container.setForceExit(false);
        this.container = container;
        this.map.init(cheminCarte);
        int idDepartFant = 0;
        List<Integer> idObjetsBonus = new ArrayList<>();
        for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {

            if ("graine".equals(map.getObjectType(objectID))) {
                grainesMap.put(objectID, new Graine(map.getObjectX(objectID), map.getObjectY(objectID)));
            }
            if ("objet".equals(map.getObjectType(objectID))) {
                idObjetsBonus.add(objectID);
            }
            if ("originePac".equals(map.getObjectType(objectID))) {
                this.player.init(map.getObjectX(objectID), map.getObjectY(objectID));
            }
            if ("origineFantome".equals(map.getObjectType(objectID))) {
                Fantome fantome = new Fantome(map);
                listFantome.add(fantome);
                fantome.init(niveau);
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

        int compteurobjet = 0;
        for (Objet objetBonus : JoueurInfo.getInstance().getObjetDispo()) {
            if (objetBonus != null) {
                affichageBonus[compteurobjet] = new Partie_AffichageObjetBonus(objetBonus, map.getObjectX(idObjetsBonus.get(compteurobjet)), map.getObjectY(idObjetsBonus.get(compteurobjet)));
                compteurobjet++;
            } else {
                affichageBonus[compteurobjet] = null;
            }

        }

        PacMiageController controller = new PacMiageController(this.player, this);
        container.getInput().addKeyListener(controller);
        background = new Music(Configuration.getInstance().recupererValeur("musique" + String.valueOf(niveau)));
        background.setVolume(0.5f);
        background.loop();
        son = new Sound("./src/ressources/musique/0218.ogg");
        this.timer.start();
    }

    public ControleurTemps getTimer() {
        return timer;
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {

        if (!gameOver) {

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

                for (Partie_AffichageObjetBonus bonus : this.affichageBonus) {
                    if (bonus != null) {
                        bonus.render(g);
                    }
                }

                if (this.imageVeracite != null) {
                    this.imageVeracite.render(g, container);
                }
            }

        } else {
            this.imageVeracite.render(g, container);
        }

    }

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
                this.score.setFutureScore(this.score.getFutureScore() + 10 * multiplicateur);
//            son.play();
                if (grainesMap.isEmpty()) {
                    ouvertureQuestion();
                    JoueurInfo.getInstance().setRecord(score.getFutureScore());
                    JoueurInfo.getInstance().ajouterGraines(score.getFutureScore());
                    gameOver = true;
                }
            }

            this.player.update(delta);
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

                fantome.update(this.player.getX(), this.player.getY());
            }

            if (timer.getTempsRestant() == 0) {
                JoueurInfo.getInstance().setRecord(score.getFutureScore());
                JoueurInfo.getInstance().ajouterGraines(score.getFutureScore());
                try {
                    SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));

                } catch (IOException ex) {
                    Logger.getLogger(PartieController.class.getName()).log(Level.SEVERE, null, ex);
                }
                imageVeracite = new Partie_AffichageImageFondu(new Image(Configuration.getInstance().recupererValeur("gameOver")));
                gameOver = true;

            }
        } else {
            if (this.imageVeracite.isInvisible()) {
                container.exit();
            }
        }

        if (tempsBonus != null && tempsBonus.getTempsRestant() == 0) {
            for (Fantome fantome : listFantome) {
                fantome.setVitesse(4);
            }
            player.setVitesse(2);
        }

    }

    private void ouvertureQuestion() throws SlickException {
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
            imageVeracite = new Partie_AffichageImageFondu(new Image(Configuration.getInstance().recupererValeur("repValide")));
            this.score.setFutureScore(this.score.getFutureScore() + 100);

        } else {
            imageVeracite = new Partie_AffichageImageFondu(new Image(Configuration.getInstance().recupererValeur("repFausse")));
            timer.setTempsRestant(timer.getTempsRestant() - 10);
        }
        container.sleep(2000);
        timer.start();
    }

    public GameContainer getContainer() {
        return container;
    }

    public Music getBackground() {
        return background;
    }

    public AppGameContainer getGame() {
        return game;
    }

    public void setGame(AppGameContainer game) {
        this.game = game;
    }

    public Partie_AffichageObjetBonus[] getAffichageBonus() {
        return affichageBonus;
    }

    public void setAffichageBonus(Partie_AffichageObjetBonus[] affichageBonus) {
        this.affichageBonus = affichageBonus;
    }

    public void setMultiplicateur(int multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    public Partie_AffichageImageFondu getImageVeracite() {
        return imageVeracite;
    }

    public void setImageVeracite(Partie_AffichageImageFondu imageVeracite) {
        this.imageVeracite = imageVeracite;
    }

    public Sound getSon() {
        return son;
    }

    public void setSon(Sound son) {
        this.son = son;
    }

    public boolean isCollision() {
        return collision;
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }

    public ControleurTemps getTempsBonus() {
        return tempsBonus;
    }

    public void setTempsBonus(ControleurTemps tempsBonus) {
        this.tempsBonus = tempsBonus;
    }

    public boolean isFantomeMove() {
        return fantomeMove;
    }

    public void setFantomeMove(boolean fantomeMove) {
        this.fantomeMove = fantomeMove;
    }

}
