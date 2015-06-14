package pacmiage2.vue.menu;

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

public class CarteIcon implements Icon {

    private BufferedImage image;

    public CarteIcon(String chemin) throws IOException {

            image = ImageIO.read(new File(chemin));

    }

    public BufferedImage getImage() {
        return image;
    }

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
