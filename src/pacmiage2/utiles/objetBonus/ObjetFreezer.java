package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.ControleurTemps;
import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;

import pacmiage2.modele.Fantome;

/**
 *
 * @author Maëlle
 */
public class ObjetFreezer implements Bonus {


    public ObjetFreezer() {

    }

    @Override
    public void executerBonus(PartieController partie) {
        for (Fantome f : partie.getListFantome()) {
            f.setMoving(false);
        }
        ControleurTemps timer = new ControleurTemps(20);
        partie.setTempsBonus(timer);
        timer.start();

    }

}
