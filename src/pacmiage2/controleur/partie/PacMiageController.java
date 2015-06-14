/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.controleur.partie;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;
import pacmiage2.vue.partie.Partie_AffichageMenuPartie;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.modele.PacMiage;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PacMiageController implements KeyListener {

    private final PacMiage player;
    private final PartieController partie;

    public PacMiageController(PacMiage player, PartieController partie) {
        this.player = player;
        this.partie = partie;
    }

    @Override
    public void setInput(Input input) {
        //Ne fait rien car cette méthode n'est pas utilisée
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    /**
     *
     */
    @Override
    public void inputEnded() {
        //Ne fait rien car cette méthode n'est pas utilisée
    }

    /**
     *
     */
    @Override
    public void inputStarted() {
        //Ne fait rien car cette méthode n'est pas utilisée
    }

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

            case Input.KEY_ENTER: {
                CaseEnter();
            }
            break;
            default:
                break;
        }

        this.player.setMoving(true);
    }

    @Override
    public void keyReleased(int key, char c) {
        this.player.setMoving(true);
    }

    private void executionBonus(int choix) {
        if (partie.getAffichageBonus()[choix] != null) {
            partie.getAffichageBonus()[choix].getObjet().getBonus().executerBonus(partie);
            JoueurInfo.getInstance().retirerObjet(partie.getAffichageBonus()[choix].getObjet());
            partie.getAffichageBonus()[choix] = null;

        }
    }

    private void CaseEnter() {
        try {

            partie.getContainer().pause();
            partie.getTimer().stop();
            partie.getGame().setFullscreen(false);
            Partie_AffichageMenuPartie affMenu = new Partie_AffichageMenuPartie(partie);

            while (affMenu.getFenetre().isVisible()) {
                partie.getContainer().sleep(50);
            }
            partie.getGame().setFullscreen(true);
            partie.getContainer().resume();
            partie.getTimer().start();

        } catch (IOException | SlickException ex) {
            Logger.getLogger(PacMiageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
