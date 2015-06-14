package pacmiage.utiles.objetBonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.utiles.Configuration;

/**
 *
 * @author Maëlle
 */
public class ObjetPink implements Bonus {

    /**
     *
     */
    public ObjetPink() {

    }

    /**
     *
     * @param partie
     */
    @Override
    public void executerBonus(PartieController partie) {
        partie.getPlayer().setImagePac(Configuration.getInstance().recupererValeur("pacRose"));
    }

}
