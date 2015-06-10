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

    private Objet bonus;
    private int x, y;
    private int width, height;
    private Image imageGraine;

    public Partie_AffichageObjetBonus(Objet bonus, int x, int y) throws SlickException {
        this.bonus = bonus;
        this.x = x;
        this.y = y;
        imageGraine = new Image(bonus.getMiniImage());
        width = imageGraine.getWidth();
        height = imageGraine.getHeight();
    }

    public Partie_AffichageObjetBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void init() throws SlickException {

    }

    public void render(Graphics g) {
        g.drawImage(imageGraine, x, y);
    }

    public void update(int delta) {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getYMillieu() {
        return y + (height / 2);
    }

    public int getXMillieu() {
        return x + (width / 2);
    }

    public Objet getBonus() {
        return bonus;
    }

    public void setBonus(Objet bonus) {
        this.bonus = bonus;
    }
    
    
}

