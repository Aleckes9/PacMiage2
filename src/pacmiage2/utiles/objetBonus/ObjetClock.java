package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.PartieController;

/**
 *
 * @author Maëlle
 */
public class ObjetClock {

    public ObjetClock(PartieController partie) {
        int temps=partie.getAffichageTemps().getTemps();
        partie.getAffichageTemps().setTemps(temps+20);
    }
    
}
