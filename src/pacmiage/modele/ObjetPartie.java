package pacmiage.modele;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe correspondant au modèle d'un objet
 */
public class ObjetPartie {

    protected int x,y;
    protected int width,height;
    protected Image image;

    /**
     * Constructeur de la classe ObjetPartie
     * @param x la position de l'objet en abscisse
     * @param y la position de l'objet en ordonnée
     * @param image le chemin du fichier contenant l'image
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
     * Méthode permettant le rendu de l'objet
     * @param g l'objet
     */
    public void renderObjetPartie(Graphics g) {
        g.drawImage(image, x, y);
    }


    /**
     * Méthode renvoyant l'abscisse de l'objet
     * @return l'abscisse de l'objet
     */
    public int getXObjetPartie() {
        return x;
    }

    /**
     * Méthode permettant de setter l'abscisse de l'objet
     * @param x l'abscisse de l'objet
     */
    public void setXObjetPartie(int x) {
        this.x = x;
    }

    /**
     * Méthode renvoyant l'ordonnée de l'objet
     * @return l'ordonnée de l'objet
     */
    public int getYObjetPartie() {
        return y;
    }

    /**
     * Méthode permettant de setter l'ordonéée de l'objet
     * @param y
     */
    public void setYObjetPartie(int y) {
        this.y = y;
    }

    /**
     * Méthode renvoyant l'ordonnée du milieu de l'objet
     * @return
     */
    public int getYMillieuObjetPartie() {
        return y + (height / 2);
    }

    /**
     * Méthode renvoyant l'abscisse du milieu de l'objet
     * @return
     */
    public int getXMillieuObjetPartie() {
        return x + (width / 2);
    }

}
