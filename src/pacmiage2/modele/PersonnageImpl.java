package pacmiage2.modele;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import pacmiage2.vue.partie.Partie_AffichageMap;

/**
 *
 * @author Aleckes9
 */
public class PersonnageImpl implements Personnage {

    protected String image;
    protected final Animation[] animations = new Animation[8];
    protected float x, y;
    protected int direction = 0;
    protected int futurDirection = 0;

    protected boolean moving = false;

    protected boolean onStair = false;
    protected int vitesse = 2;

    protected final Partie_AffichageMap map;

    public PersonnageImpl(Partie_AffichageMap map, String cheminImage) {
        this.map = map;
        image = cheminImage;
    }

    public void initAnimation() throws SlickException {
        SpriteSheet spriteSheet = new SpriteSheet(image, 32, 32);
        this.animations[0] = loadAnimation(spriteSheet, 0, 1, 0);
        this.animations[1] = loadAnimation(spriteSheet, 0, 1, 1);
        this.animations[2] = loadAnimation(spriteSheet, 0, 1, 2);
        this.animations[3] = loadAnimation(spriteSheet, 0, 1, 3);
        this.animations[4] = loadAnimation(spriteSheet, 1, 6, 0);
        this.animations[5] = loadAnimation(spriteSheet, 1, 6, 1);
        this.animations[6] = loadAnimation(spriteSheet, 1, 6, 2);
        this.animations[7] = loadAnimation(spriteSheet, 1, 6, 3);
    }

    private Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y) {
        Animation animation = new Animation();
        for (int x = startX; x < endX; x++) {
            animation.addFrame(spriteSheet.getSprite(x, y), 100);
        }
        return animation;
    }

    public void setImagePac(String image) {
        this.image = image;
        try {
            initAnimation();
        } catch (SlickException ex) {
            Logger.getLogger(PacMiage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void render(Graphics g) throws SlickException {
        g.drawAnimation(animations[direction + (moving ? 4 : 0)], x, y);

    }

    public void init(int posX, int pasY) throws SlickException {
        x = posX;
        y = pasY;
        initAnimation();
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public boolean estEnCollisionMur(float xObjet, float yObjet) {
        return this.map.isCollision(xObjet + 1, yObjet + 1)
                || this.map.isCollision(xObjet + 31, yObjet + 1)
                || this.map.isCollision(xObjet + 1, yObjet + 31)
                || this.map.isCollision(xObjet + 31, yObjet + 31);
    }

    public float getFuturX(int delta, int direction) {
        float futurX = this.x;
        switch (direction) {
            case 1:
                futurX = this.x - 2 * delta;
                break;
            case 0:
                futurX = this.x + 2 * delta;
                break;
        }
        return futurX;
    }

    public float getFuturY(int delta, int direction) {
        float futurY = this.y;
        switch (direction) {
            case 2:
                futurY = this.y - 2 * delta;
                break;
            case 3:
                futurY = this.y + 2 * delta;
                break;
        }
        return futurY;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getCenterX() {
        return x + 16;
    }

    public float getCenterY() {
        return y + 16;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isOnStair() {
        return onStair;
    }

    public void setOnStair(boolean onStair) {
        this.onStair = onStair;
    }

    public int getFuturDirection() {
        return futurDirection;
    }

    public void setFuturDirection(int futurDirection) {
        this.futurDirection = futurDirection;
    }

}
