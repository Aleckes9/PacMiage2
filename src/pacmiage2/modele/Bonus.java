package pacmiage2.modele;

import java.io.Serializable;
import pacmiage2.controleur.partie.PartieController;

/**
 *
 * @author Aleckes9
 */
public interface Bonus extends Serializable{
    
    void executerBonus(PartieController partie);
}
