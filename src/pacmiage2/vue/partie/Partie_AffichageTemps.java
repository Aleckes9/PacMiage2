package pacmiage2.vue.partie;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class Partie_AffichageTemps {

    private float x, y;
    private int temps;

    public Partie_AffichageTemps() {
    }

    public void renderAffichageTemps(Graphics g) throws SlickException {

        String argentString = String.valueOf(temps);
        float xx = x;
        float yy = y;
        for (int i = 0; i < argentString.length(); i++) {
            g.drawImage(new Image("./src/ressources/image/chiffre/" + argentString.charAt(i) + ".png"), xx, yy);
            xx = xx + 40;
        }

    }

    public void initPosAffichageTemps(int xPos, int Ypos) {
        x = xPos;
        y = Ypos;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

}
