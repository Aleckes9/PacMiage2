package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;
import pacmiage2.modele.Fantome;

/**
 *
 * @author Maëlle
 */
public class ObjetSlow implements Bonus {


    public ObjetSlow() {

    }

    @Override
    public void executerBonus(PartieController partie) {
        for (Fantome f : partie.getListFantome()) {
            f.setVitesse(1);
        }

    }
}
