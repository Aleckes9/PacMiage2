package pacmiage.utiles.objetBonus;

import pacmiage.modele.ControleurTemps;
import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.modele.Fantome;

/**
 *
 * @author Maëlle
 */
public class ObjetSlow implements Bonus {

    /**
     *
     */
    public ObjetSlow() {

    }

    /**
     *
     * @param partie
     */
    @Override
    public void executerBonus(PartieController partie) {
        for (Fantome f : partie.getListFantome()) {
            f.setVitesse(1);
        }
        
        ControleurTemps timer = new ControleurTemps(20);
        partie.setTempsBonus(timer);
        timer.start();

    }
}
