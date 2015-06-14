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
 * 
 * Méthode permettant d'afficher le score au cours d'une partie
 */
public class PartieAffichageScore {

    private float x, y;
    private int score;
    private int futureScore;

    /**
     * Constructeur de la classe PartieAffichageScore
     */
    public PartieAffichageScore() {
    }

    /**
     * Méthode permettant d'afficher le rendu de l'affichage du score
     * @param g le rendu
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
     * Initialisation de la position 
     * @param xPos
     * @param yPos
     */
    public void initPos(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }

    /**
     * Méthode renvoyant le score
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     * Méthode permettant de setter le score
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Méthode renvoyant le futur score
     * @return
     */
    public int getFutureScore() {
        return futureScore;
    }

    /**
     * Méthode permettant de setter le score futur
     * @param futureScore
     */
    public void setFutureScore(int futureScore) {
        this.futureScore = futureScore;
    }

}
