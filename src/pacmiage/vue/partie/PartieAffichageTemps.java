package pacmiage.vue.partie;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant d'afficher le temps
 */
public class PartieAffichageTemps {

    private float x, y;
    private int temps;

    /**
     * Constructeur de la classe PartieAffichageTemps
     */
    public PartieAffichageTemps() {
    }

    /**
     * Rendu de l'affichage du temps
     * @param g le rendu
     * @throws SlickException
     */
    public void renderAffichageTemps(Graphics g) throws SlickException {

        String argentString = String.valueOf(temps);
        float xx = x;
        float yy = y;
        for (int i = 0; i < argentString.length(); i++) {
            g.drawImage(new Image("./src/ressources/image/chiffre/" + argentString.charAt(i) + ".png"), xx, yy);
            xx = xx + 40;
        }

    }

    /**
     * Initialisation de la position de l'affichage du temps
     * @param xPos l'abscisse
     * @param yPos l'ordonnée
     */
    public void initPosAffichageTemps(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }

    /**
     * Méthode renvoyant le temps
     * @return le temps
     */
    public int getTemps() {
        return temps;
    }

    /**
     * Méthode permettant de setter le temps
     * @param temps
     */
    public void setTemps(int temps) {
        this.temps = temps;
    }

}
