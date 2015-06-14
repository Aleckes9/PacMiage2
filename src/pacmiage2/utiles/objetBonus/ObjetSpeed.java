package pacmiage2.utiles.objetBonus;

import pacmiage2.modele.ControleurTemps;
import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;

/**
 *
 * @author Maëlle
 */
public class ObjetSpeed implements Bonus {

    public ObjetSpeed() {

    }

    @Override
    public void executerBonus(PartieController partie) {
        partie.getPlayer().setVitesse(4);
        ControleurTemps timer = new ControleurTemps(20);
        partie.setTempsBonus(timer);
        timer.start();
    }
}
