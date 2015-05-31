/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

/**
 *
 * @author Alexandre
 */
public class PacMiageController implements KeyListener {

    private PacMiage player;
    private JoueurInfo joueur;
PartieController partie;
    public PacMiageController(PacMiage player, PartieController partie) {
        this.player = player;
        this.partie=partie;
    }

    @Override
    public void setInput(Input input) {
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
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
               
                break;
            case Input.KEY_2:
                
                break;
            case Input.KEY_3:
                
                break;
            case Input.KEY_4:
                
                break;
            case Input.KEY_ESCAPE:
                System.exit(0);
                break;
        
        case Input.KEY_ENTER:
        {
            try {
                new AfficheMenuPartie(partie);
            } catch (IOException ex) {
                Logger.getLogger(PacMiageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                    break;
        }
         this.player.setMoving(true);
    }

    @Override
    public void keyReleased(int key, char c) {
        this.player.setMoving(true);
    }

}
