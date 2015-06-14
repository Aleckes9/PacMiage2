package pacmiage.utiles.objetbonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.utiles.Configuration;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de générer l'objet bonus red
 */
public class ObjetRed implements Bonus {

    /**
     * Constructeur de la classe ObjetRed
     */
    public ObjetRed() {
        
    }

    @Override
    public void executerBonus(PartieController partie) {
partie.getPlayer().setImagePac(Configuration.getInstance().recupererValeur("pacRouge"));
    }
    
    
}
