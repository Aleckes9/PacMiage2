package pacmiage.utiles.objetbonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de générer l'objet bonus clock
 */
public class ObjetClock implements Bonus {

    /**
     * Constructeur de la classe ObjetClock
     */
    public ObjetClock() {

    }

    @Override
    public void executerBonus(PartieController partie) {
        partie.getTimer().setTempsRestant(partie.getTimer().getTempsRestant()+20);
    }

}
