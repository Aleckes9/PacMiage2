package pacmiage2.vue.partie;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import pacmiage2.modele.Objet;

/**
 *
 * @author Aleckes9
 */
public class Partie_AffichageObjetBonus {

    private Objet objet;
    private int x, y;
    private final int width, height;
    private final Image imageGraine;

    /**
     *
     * @param objet
     * @param x
     * @param y
     * @throws SlickException
     */
    public Partie_AffichageObjetBonus(Objet objet, int x, int y) throws SlickException {
        this.objet = objet;
        this.x = x;
        this.y = y;
        imageGraine = new Image(objet.getMiniImage());
        width = imageGraine.getWidth();
        height = imageGraine.getHeight();
    }

    /**
     *
     * @param g
     */
    public void render(Graphics g) {
        g.drawImage(imageGraine, x, y);
    }

    /**
     *
     * @param delta
     */
    public void update(int delta) {

    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @return
     */
    public int getYMillieu() {
        return y + (height / 2);
    }

    /**
     *
     * @return
     */
    public int getXMillieu() {
        return x + (width / 2);
    }

    /**
     *
     * @return
     */
    public Objet getObjet() {
        return objet;
    }

    /**
     *
     * @param objet
     */
    public void setBonus(Objet objet) {
        this.objet = objet;
    }

}
