/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

/**
 *
 * @author Alexandre
 */
public class JoueurController implements KeyListener {

    private Joueur player;

    public JoueurController(Joueur player) {
        this.player = player;
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
                this.player.setDirection(0);
                this.player.setMoving(true);
                break;
            case Input.KEY_LEFT:
                this.player.setDirection(1);
                this.player.setMoving(true);
                break;
            case Input.KEY_UP:
                this.player.setDirection(2);
                this.player.setMoving(true);
                break;
            case Input.KEY_DOWN:
                this.player.setDirection(3);
                this.player.setMoving(true);
                break;
        }
    }

    @Override
    public void keyReleased(int key, char c) {
        this.player.setMoving(true);
    }

}
