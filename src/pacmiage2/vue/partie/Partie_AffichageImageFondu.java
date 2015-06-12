package pacmiage2.vue.partie;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Partie_AffichageImageFondu {

    private final Image img;

    public Partie_AffichageImageFondu(Image img) throws SlickException {
        this.img = img;
    }

    public void render(Graphics g, GameContainer container) throws SlickException {
        g.drawImage(img, (container.getWidth() / 2) - 200, (container.getHeight() / 2) - 200);
        img.setAlpha(img.getAlpha() - 0.01f);
    }

    public boolean isInvisible() {
        return img.getAlpha() < 0;
    }

}
