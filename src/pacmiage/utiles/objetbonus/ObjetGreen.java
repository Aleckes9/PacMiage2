package pacmiage.utiles.objetbonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.utiles.Configuration;

/**
 *
 * @author Maëlle
 */
public class ObjetGreen implements Bonus {
    
    /**
     *
     */
    public ObjetGreen() {
        
    }
    
    /**
     *
     * @param partie
     */
    @Override
    public void executerBonus(PartieController partie) {
        partie.getPlayer().setImagePac(Configuration.getInstance().recupererValeur("pacVert"));
    }
    
}
