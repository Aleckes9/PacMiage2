/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.partie;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PartieAffichageScore {

    private float x, y;
    private int score;
    private int futureScore;

    /**
     *
     */
    public PartieAffichageScore() {
    }

    /**
     *
     * @param g
     * @throws SlickException
     */
    public void render(Graphics g) throws SlickException {

        if (score < futureScore) {
            score = score + 1;
        }

        String argentString = String.valueOf(score);
        float xx = x;
        float yy = y;
        for (int i = 0; i < argentString.length(); i++) {
            g.drawImage(new Image("./src/ressources/image/chiffre/" + argentString.charAt(i) + ".png"), xx, yy);
            xx = xx + 40;
        }

    }

    /**
     *
     * @param xPos
     * @param yPos
     */
    public void initPos(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }

    /**
     *
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     *
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     *
     * @return
     */
    public int getFutureScore() {
        return futureScore;
    }

    /**
     *
     * @param futureScore
     */
    public void setFutureScore(int futureScore) {
        this.futureScore = futureScore;
    }

}
