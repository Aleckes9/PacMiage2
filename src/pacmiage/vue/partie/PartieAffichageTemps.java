package pacmiage.vue.partie;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PartieAffichageTemps {

    private float x, y;
    private int temps;

    /**
     *
     */
    public PartieAffichageTemps() {
    }

    /**
     *
     * @param g
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
     *
     * @param xPos
     * @param yPos
     */
    public void initPosAffichageTemps(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }

    /**
     *
     * @return
     */
    public int getTemps() {
        return temps;
    }

    /**
     *
     * @param temps
     */
    public void setTemps(int temps) {
        this.temps = temps;
    }

}
