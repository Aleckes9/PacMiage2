package pacmiage.modele;

import java.io.Serializable;
import pacmiage.controleur.partie.PartieController;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Interface des Bonus
 */
public interface Bonus extends Serializable{
    
    /**
     * Méthode permettant d'exécuter un bonus
     * @param partie
     */
    void executerBonus(PartieController partie);
}
