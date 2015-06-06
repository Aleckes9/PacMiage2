package pacmiage2.utiles;

import pacmiage2.controleur.PartieController;

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
