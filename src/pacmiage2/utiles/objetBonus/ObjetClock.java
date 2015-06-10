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
        int temps = partie.getAffichageTemps().getTemps();
        partie.getAffichageTemps().setTemps(temps + 20);
    }

}
