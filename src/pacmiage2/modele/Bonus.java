package pacmiage2.modele;

import java.io.Serializable;
import pacmiage2.controleur.partie.PartieController;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public interface Bonus extends Serializable{
    
    void executerBonus(PartieController partie);
}
