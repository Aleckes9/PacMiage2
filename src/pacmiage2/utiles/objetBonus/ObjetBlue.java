package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;

/**
 *
 * @author Maëlle
 */
public class ObjetBlue implements Bonus {

    public ObjetBlue() {
        
    }

    @Override
    public void executerBonus(PartieController partie) {
partie.getPlayer().setImagePac("");    }
    
}
