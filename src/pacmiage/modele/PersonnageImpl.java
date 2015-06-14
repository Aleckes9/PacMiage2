package pacmiage.modele;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import pacmiage.vue.partie.PartieAffichageMap;

/**
 *
 * @author Aleckes9
 */
public class PersonnageImpl implements Personnage {

    /**
     *
     */
    protected String image;

    /**
     *
     */
    protected final Animation[] animations = new Animation[8];
    protected float x,
            /**
             *
             */
            y;

    /**
     *
     */
    protected int direction = 0;

    /**
     *
     */
    protected int futurDirection = 0;

    /**
     *
     */
    protected boolean moving = false;

    /**
     *
     */
    protected boolean onStair = false;

    /**
     *
     */
    protected int vitesse = 2;

    /**
     *
     */
    protected final PartieAffichageMap map;

    /**
     *
     * @param map
     * @param cheminImage
     */
    public PersonnageImpl(PartieAffichageMap map, String cheminImage) {
        this.map = map;
        image = cheminImage;
    }

    /**
     *
     * @throws SlickException
     */
    @Override
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

    /**
     *
     * @param spriteSheet
     * @param startX
     * @param endX
     * @param y
     * @return
     */
    @Override
    public Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y) {
        Animation animation = new Animation();
        for (int x1 = startX; x1 < endX; x1++) {
            animation.addFrame(spriteSheet.getSprite(x1, y), 100);
        }
        return animation;
    }

    /**
     *
     * @param image
     */
    @Override
    public void setImagePac(String image) {
        this.image = image;
        try {
            initAnimation();
        } catch (SlickException ex) {
            Logger.getLogger(PacMiage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param g
     * @throws SlickException
     */
    @Override
    public void render(Graphics g) throws SlickException {
        g.drawAnimation(animations[direction + (moving ? 4 : 0)], x, y);

    }

    /**
     *
     * @param posX
     * @param pasY
     * @throws SlickException
     */
    @Override
    public void init(int posX, int pasY) throws SlickException {
        x = posX;
        y = pasY;
        initAnimation();
    }

    /**
     *
     * @param vitesse
     */
    @Override
    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    /**
     *
     * @param xObjet
     * @param yObjet
     * @return
     */
    @Override
    public boolean estEnCollisionMur(float xObjet, float yObjet) {
        return this.map.isCollision(xObjet + 1, yObjet + 1)
                || this.map.isCollision(xObjet + 31, yObjet + 1)
                || this.map.isCollision(xObjet + 1, yObjet + 31)
                || this.map.isCollision(xObjet + 31, yObjet + 31);
    }

    /**
     *
     * @param delta
     * @param direction
     * @return
     */
    @Override
    public float getFuturX(int delta, int direction) {
        float futurX = this.x;
        switch (direction) {
            case 1:
                futurX = this.x - 2 * delta;
                break;
            case 0:
                futurX = this.x + 2 * delta;
                break;
            default:
                break;
        }
        return futurX;
    }

    /**
     *
     * @param delta
     * @param direction
     * @return
     */
    @Override
    public float getFuturY(int delta, int direction) {
        float futurY = this.y;
        switch (direction) {
            case 2:
                futurY = this.y - 2 * delta;
                break;
            case 3:
                futurY = this.y + 2 * delta;
                break;
            default:
                break;
        }
        return futurY;
    }

    /**
     *
     * @return
     */
    @Override
    public float getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    @Override
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    @Override
    public float getCenterX() {
        return x + 16;
    }

    /**
     *
     * @return
     */
    @Override
    public float getCenterY() {
        return y + 16;
    }

    /**
     *
     * @return
     */
    @Override
    public float getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    @Override
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @return
     */
    @Override
    public int getDirection() {
        return direction;
    }

    /**
     *
     * @param direction
     */
    @Override
    public void setDirection(int direction) {
        this.direction = direction;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isMoving() {
        return moving;
    }

    /**
     *
     * @param moving
     */
    @Override
    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isOnStair() {
        return onStair;
    }

    /**
     *
     * @param onStair
     */
    @Override
    public void setOnStair(boolean onStair) {
        this.onStair = onStair;
    }

    /**
     *
     * @return
     */
    @Override
    public int getFuturDirection() {
        return futurDirection;
    }

    /**
     *
     * @param futurDirection
     */
    @Override
    public void setFuturDirection(int futurDirection) {
        this.futurDirection = futurDirection;
    }

}
