package pacmiage2;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class AffichageValidationReponse {

    private Image img;

    public AffichageValidationReponse(boolean veracite) throws SlickException {
        if(veracite){
            this.img = new Image("./src/ressources/image/questions/green_tick.png");
        }else{
            this.img = new Image("./src/ressources/image/questions/red_cross.png");
        }
    }

    public void render(Graphics g, GameContainer container) throws SlickException {
        g.drawImage(img, (container.getWidth()/2)-200, (container.getHeight()/2)-200);
        img.setAlpha(img.getAlpha()-0.02f);
    }
    
    public boolean isInvisible(){
        return img.getAlpha()<0;
    } 

}
