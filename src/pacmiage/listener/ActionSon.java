package pacmiage.listener;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.newdawn.slick.Music;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de gérer l'activation ou la désactivation de la musique
 */
public class ActionSon extends AbstractAction{

    private final Music musique;

    /**
     * Constructeur de la classe ActionSon
     * @param musique, correspond à la musique du niveau
     */
    public ActionSon(Music musique) {
        this.musique = musique;
    }
    /**
     * Méthode permettant de désactiver le son
     * @param ae est un event indiquant qu'une action a lieue
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
       musique.setVolume(0);
    }
    
    
    
}
