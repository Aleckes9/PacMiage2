package pacmiage.modele;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public interface Personnage {

    /**
     *
     * @throws SlickException
     */
    void initAnimation() throws SlickException;

    /**
     *
     * @param spriteSheet
     * @param startX
     * @param endX
     * @param y
     * @return
     */
    Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y);

    /**
     *
     * @param image
     */
    void setImagePac(String image);

    /**
     *
     * @param g
     * @throws SlickException
     */
    void render(Graphics g) throws SlickException;

    /**
     *
     * @param posX
     * @param pasY
     * @throws SlickException
     */
    void init(int posX, int pasY) throws SlickException;

    /**
     *
     * @param vitesse
     */
    void setVitesse(int vitesse);

    /**
     *
     * @param xObjet
     * @param yObjet
     * @return
     */
    boolean estEnCollisionMur(float xObjet, float yObjet);

    /**
     *
     * @param delta
     * @param direction
     * @return
     */
    float getFuturX(int delta, int direction);

    /**
     *
     * @param delta
     * @param direction
     * @return
     */
    float getFuturY(int delta, int direction);

    /**
     *
     * @return
     */
    float getX();

    /**
     *
     * @param x
     */
    void setX(int x);

    /**
     *
     * @return
     */
    float getCenterX();

    /**
     *
     * @return
     */
    float getCenterY();

    /**
     *
     * @return
     */
    float getY();

    /**
     *
     * @param y
     */
    void setY(int y);

    /**
     *
     * @return
     */
    int getDirection();

    /**
     *
     * @param direction
     */
    void setDirection(int direction);

    /**
     *
     * @return
     */
    boolean isMoving();

    /**
     *
     * @param moving
     */
    void setMoving(boolean moving);

    /**
     *
     * @return
     */
    boolean isOnStair();

    /**
     *
     * @param onStair
     */
    void setOnStair(boolean onStair);

    /**
     *
     * @return
     */
    int getFuturDirection();

    /**
     *
     * @param futurDirection
     */
    void setFuturDirection(int futurDirection);

}
