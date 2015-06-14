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
 */
public class CarteIcon implements Icon {

    private BufferedImage image;

    /**
     *
     * @param chemin
     * @throws IOException
     */
    public CarteIcon(String chemin) throws IOException {

            image = ImageIO.read(new File(chemin));

    }

    /**
     *
     * @return
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

    @Override
    public int getIconWidth() {
        return image.getWidth();
    }

    @Override
    public int getIconHeight() {
        return image.getHeight();
    }

}
