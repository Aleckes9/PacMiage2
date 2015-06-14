package pacmiage.modele;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class ObjetPartie {

    protected int x,y;
    protected int width,height;
    protected Image image;

    /**
     *
     * @param x
     * @param y
     * @param image
     * @throws SlickException
     */
    public ObjetPartie(int x, int y, String image) throws SlickException {
        this.x = x;
        this.y = y;
        this.image = new Image(image);
        this.width = this.image.getWidth();
        this.height = this.image.getHeight();

    }


    /**
     *
     * @param g
     */
    public void renderObjetPartie(Graphics g) {
        g.drawImage(image, x, y);
    }


    /**
     *
     * @return
     */
    public int getXObjetPartie() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setXObjetPartie(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getYObjetPartie() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setYObjetPartie(int y) {
        this.y = y;
    }

    /**
     *
     * @return
     */
    public int getYMillieuObjetPartie() {
        return y + (height / 2);
    }

    /**
     *
     * @return
     */
    public int getXMillieuObjetPartie() {
        return x + (width / 2);
    }

}
