package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;

/**
 *
 * @author Maëlle
 */
public class ObjetClock implements Bonus {

    public ObjetClock() {

    }

    @Override
    public void executerBonus(PartieController partie) {
        partie.getTimer().setTempsRestant(partie.getTimer().getTempsRestant()+20);
    }

}
