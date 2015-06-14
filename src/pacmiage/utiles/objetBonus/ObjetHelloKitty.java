package pacmiage.utiles.objetBonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.utiles.Configuration;

/**
 *
 * @author Maëlle
 */
public class ObjetHelloKitty implements Bonus {

    /**
     *
     * @param partie
     */
    @Override
    public void executerBonus(PartieController partie) {
        partie.getPlayer().setImagePac(Configuration.getInstance().recupererValeur("helloK"));
    }
    
}
