package pacmiage.vue.partie;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant l'affichage de l'image fondue
 */
public class PartieAffichageImageFondu {

    private final Image img;

    /**
     * Constructeur de la classe PartieAffichageImageFondu
     * @param img l'image
     * @throws SlickException
     */
    public PartieAffichageImageFondu(Image img) throws SlickException {
        this.img = img;
    }

    /**
     * Méthode permettant d'afficher le rendu
     * @param g le rendu
     * @param container le conteneur
     * @throws SlickException
     */
    public void render(Graphics g, GameContainer container) throws SlickException {
        g.drawImage(img, (container.getWidth() / 2) - 200, (container.getHeight() / 2) - 200);
        img.setAlpha(img.getAlpha() - 0.01f);
    }

    /**
     * Méthode renvoyant un booléen indiquant si l'image fondue est invisible ou non
     * @return true si invisible, sinon false
     */
    public boolean isInvisible() {
        return img.getAlpha() < 0;
    }

}
