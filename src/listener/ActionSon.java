package listener;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.newdawn.slick.Music;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class ActionSon extends AbstractAction{

    Music musique;

    public ActionSon(Music musique) {
        this.musique = musique;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       musique.setVolume(0);
    }
    
    
    
}
