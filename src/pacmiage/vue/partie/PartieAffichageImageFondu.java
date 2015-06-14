package pacmiage.vue.partie;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PartieAffichageImageFondu {

    private final Image img;

    /**
     *
     * @param img
     * @throws SlickException
     */
    public PartieAffichageImageFondu(Image img) throws SlickException {
        this.img = img;
    }

    /**
     *
     * @param g
     * @param container
     * @throws SlickException
     */
    public void render(Graphics g, GameContainer container) throws SlickException {
        g.drawImage(img, (container.getWidth() / 2) - 200, (container.getHeight() / 2) - 200);
        img.setAlpha(img.getAlpha() - 0.01f);
    }

    /**
     *
     * @return
     */
    public boolean isInvisible() {
        return img.getAlpha() < 0;
    }

}
