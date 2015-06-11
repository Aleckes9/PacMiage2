package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.ControleurTemps;
import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;
import pacmiage2.utiles.Configuration;

/**
 *
 * @author Maëlle
 */
public class ObjetInvinsible implements Bonus {

    public ObjetInvinsible() {

    }

    @Override
    public void executerBonus(PartieController partie) {
        partie.setCollision(false);
        ControleurTemps timer = new ControleurTemps(20);
        partie.setTempsBonus(timer);
        timer.start();
        partie.getPlayer().setImagePac(Configuration.getInstance().recupererValeur("pacInvincible"));
    }
}
