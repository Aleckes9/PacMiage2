/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.listener;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;
import pacmiage.controleur.partie.PartieController;
import pacmiage.vue.partie.PartieAffichageMenuPartie;
import pacmiage.modele.JoueurInfo;
import pacmiage.modele.PacMiage;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant d'écouter chacune des actions possibles lors d'une partie
 */
public class PacMiageListener implements KeyListener {

    private final PacMiage player;
    private final PartieController partie;

    /**
     * Constructeur de la classe PacMiageListener
     * @param player est un joueur jouant à la partie
     * @param partie la partie en cours jouée par l'utilisateur
     */
    public PacMiageListener(PacMiage player, PartieController partie) {
        this.player = player;
        this.partie = partie;
    }

    @Override
    public void setInput(Input input) {
        //Ne fait rien car cette méthode n'est pas utilisée
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    @Override
    public void inputEnded() {
        //Ne fait rien car cette méthode n'est pas utilisée
    }

    @Override
    public void inputStarted() {
        //Ne fait rien car cette méthode n'est pas utilisée
    }

    /**
     * Méthode associant une touche à une action
     * @param key la touche appuyée par l'utilisateur
     * @param c le caractère associé à la touche
     */
    @Override
    public void keyPressed(int key, char c) {
        switch (key) {
            case Input.KEY_RIGHT:
                this.player.setFuturDirection(0);
                break;
            case Input.KEY_LEFT:
                this.player.setFuturDirection(1);
                break;
            case Input.KEY_UP:
                this.player.setFuturDirection(2);
                break;
            case Input.KEY_DOWN:
                this.player.setFuturDirection(3);
                break;
            case Input.KEY_1:
                executionBonus(0);
                break;
            case Input.KEY_2:
                executionBonus(1);
                break;
            case Input.KEY_3:
                executionBonus(2);
                break;
            case Input.KEY_4:
                executionBonus(3);
                break;
            case Input.KEY_ESCAPE:
                System.exit(0);
                break;
            case Input.KEY_ENTER:
                caseEnter();
                break;
            default:
                break;
        }

        this.player.setMoving(true);
    }

    /**
     * Méthode permettant de confirmer qu'une touche a été activé
     * @param key la tocuhe activée
     * @param c le caractère associé à la touche
     */
    @Override
    public void keyReleased(int key, char c) {
        this.player.setMoving(true);
    }

    /**
     * Méthode permettant d'activer un bonus et de le retirer de la liste des bonus utilisables
     * @param choix est le bonus choisi par l'utilisateur
     */
    private void executionBonus(int choix) {
        if (partie.getAffichageBonus()[choix] != null) {
            partie.getAffichageBonus()[choix].getObjet().getBonus().executerBonus(partie);
            JoueurInfo.getInstance().retirerObjet(partie.getAffichageBonus()[choix].getObjet());
            partie.getAffichageBonus()[choix] = null;

        }
    }

    /**
     * Méthode permettant de mettre le jeu en pause lorsque l'on clique sur le bouton Enter
     */
    private void caseEnter() {
        try {

            partie.getContainer().pause();
            partie.getTimer().stop();
            partie.getGame().setFullscreen(false);
            PartieAffichageMenuPartie affMenu = new PartieAffichageMenuPartie(partie);

            while (affMenu.getFenetre().isVisible()) {
                partie.getContainer().sleep(50);
            }
            partie.getGame().setFullscreen(true);
            partie.getContainer().resume();
            partie.getTimer().start();

        } catch (IOException | SlickException ex) {
            Logger.getLogger(PacMiageListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
