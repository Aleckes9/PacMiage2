package pacmiage.utiles.objetBonus;

import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;

/**
 *
 * @author Maëlle
 */
public class ObjetClock implements Bonus {

    /**
     *
     */
    public ObjetClock() {

    }

    /**
     *
     * @param partie
     */
    @Override
    public void executerBonus(PartieController partie) {
        partie.getTimer().setTempsRestant(partie.getTimer().getTempsRestant()+20);
    }

}
