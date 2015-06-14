package pacmiage.modele;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class ObjetPartie {

    protected int x, y;
    protected int width, height;
    protected Image image;

    public ObjetPartie(int x, int y, String image) throws SlickException {
        this.x = x;
        this.y = y;
        this.image = new Image(image);
        this.width = this.image.getWidth();
        this.height = this.image.getHeight();
        
    }
    
    public void initObjetPartie() throws SlickException {

    }

    public void renderObjetPartie(Graphics g) {
        g.drawImage(image, x, y);
    }

    public void updateObjetPartie(int delta) {

    }

    public int getXObjetPartie() {
        return x;
    }

    public void setXObjetPartie(int x) {
        this.x = x;
    }

    public int getYObjetPartie() {
        return y;
    }

    public void setYObjetPartie(int y) {
        this.y = y;
    }

    public int getYMillieuObjetPartie() {
        return y + (height / 2);
    }

    public int getXMillieuObjetPartie() {
        return x + (width / 2);
    }

}
