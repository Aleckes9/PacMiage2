package pacmiage.utiles.objetBonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;

/**
 *
 * @author Maëlle
 */
public class ObjetDoubleCoins implements Bonus {

    /**
     *
     * @param partie
     */
    @Override
    public void executerBonus(PartieController partie) {
        partie.setMultiplicateur(2);
    }
    
}
