package pacmiage2.controleur;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.newdawn.slick.Music;

/**
 *
 * @author Maëlle
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
