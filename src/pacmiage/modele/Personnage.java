package pacmiage.modele;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Interface du Personnage
 */
public interface Personnage {

    /**
     * Méthode permettant d'initialiser le chargement les différentes animations
     * @throws SlickException
     */
    void initAnimation() throws SlickException;

    /**
     * méthode permettant de charger les animations d'un sprite
     * @param spriteSheet le sprite
     * @param startX la position du sprite au début de l'animation
     * @param endX la position du sprite à la fin 
     * @param y la position de l'ordonnée de l'animation
     * @return
     */
    Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y);

    /**
     * Méthode permettant de setter l'image du Pac-Man
     * @param image
     */
    void setImagePac(String image);

    /**
     * Méthode permettant d'afficher le rendu d'une animation
     * @param g
     * @throws SlickException
     */
    void render(Graphics g) throws SlickException;

    /**
     * Méthode permettant d'initialiser la position d'un objet ou personnage
     * @param posX la position de l'abscisse
     * @param pasY la position de l'ordonnée
     * @throws SlickException
     */
    void init(int posX, int pasY) throws SlickException;

    /**
     * Méthode permettant de setter la vitesse d'une animation
     * @param vitesse
     */
    void setVitesse(int vitesse);

    /**
     * Méthode retournant un booléen indiquant si le personnage est entré en collision avec un mur
     * @param xObjet position de l'abscisse du personnage
     * @param yObjet position de l'ordonnée du personnage
     * @return
     */
    boolean estEnCollisionMur(float xObjet, float yObjet);

    /**
     * Méthode renvoyant la future position en abscisse
     * @param delta
     * @param direction, la direction du personnage
     * @return la future position en abscisse
     */
    float getFuturX(int delta, int direction);

    /**
     * Méthode renvoyant la future position en ordonnée
     * @param delta
     * @param direction, la direction du personnage
     * @return la future position en ordonnée
     */
    float getFuturY(int delta, int direction);

    /**
     * Méthode renvoyant l'abscisse
     * @return x l'abscisse
     */
    float getX();

    /**
     * Méthode permettant de setter l'abscisse
     * @param x
     */
    void setX(int x);

    /**
     * Méthode renvoyant le centre de l'abscisse
     * @return le centre de l'abscisse
     */
    float getCenterX();

    /**
     * Méthode renvoyant le centre de l'ordonnée
     * @return le centre de l'ordonnée
     */
    float getCenterY();

    /**
     * Méthode renvoyant l'ordonnée
     * @return l'ordonnée
     */
    float getY();

    /**
     * Méthode permettant de setter l'ordonnée
     * @param y
     */
    void setY(int y);

    /**
     * Méthode renvoyant la direction
     * @return la direction prise par le personnage
     */
    int getDirection();

    /**
     * Méthode permettant de setter la direction du personnage
     * @param direction
     */
    void setDirection(int direction);

    /**
     * Méthode renvoyant un booléen indiquant si le personnage est en mouvement ou non
     * @return true si le personnage est en mouvement, sinon false
     */
    boolean isMoving();

    /**
     * Méthode settant l'action de mouvement
     * @param moving
     */
    void setMoving(boolean moving);

    /**
     * Méthode renvoyant la future direction
     * @return la future direction
     */
    int getFuturDirection();

    /**
     * méthode permettant de setter la future direction
     * @param futurDirection
     */
    void setFuturDirection(int futurDirection);

}
