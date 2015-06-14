package pacmiage.utiles.objetbonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de générer l'objet bonus Double Coins
 */
public class ObjetDoubleCoins implements Bonus {

    @Override
    public void executerBonus(PartieController partie) {
        partie.setMultiplicateur(2);
    }
    
}
