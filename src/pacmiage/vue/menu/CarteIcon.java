package pacmiage.vue.menu;

/**
 *
 * @author Aleckes9
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant d'afficher l'icone de la carte
 */
public class CarteIcon implements Icon {

    private BufferedImage image;

    /**
     * Constructeur de la classe CarteIcon
     * @param chemin du fichier contenant l'image
     * @throws IOException
     */
    public CarteIcon(String chemin) throws IOException {

            image = ImageIO.read(new File(chemin));

    }

    /**
     * Méthode renvoyant l'image
     * @return une image
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * 
     * @param image
     */
    public void setImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawImage(image, 0, 0, null);
    }

    /**
     * Méthode renvoyant la largeur de l'icone
     * @return la largeur de l'icone
     */
    @Override
    public int getIconWidth() {
        return image.getWidth();
    }

    /**
     * Méthode renvoyant la longueur de l'icone
     * @return la longueur de l'icone
     */
    @Override
    public int getIconHeight() {
        return image.getHeight();
    }

}
