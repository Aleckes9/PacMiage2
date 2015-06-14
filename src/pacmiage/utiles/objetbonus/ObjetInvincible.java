package pacmiage.utiles.objetbonus;

import pacmiage.modele.ControleurTemps;
import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.utiles.Configuration;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de générer l'objet bonus invincible
 */
public class ObjetInvincible implements Bonus {

    /**
     * Constructeur de la classe Objet
     */
    public ObjetInvincible() {

    }

    /**
     *
     * @param partie
     */
    @Override
    public void executerBonus(PartieController partie) {
        partie.setCollision(false);
        ControleurTemps timer = new ControleurTemps(20);
        partie.setTempsBonus(timer);
        timer.start();
        partie.getPlayer().setImagePac(Configuration.getInstance().recupererValeur("pacInvincible"));
    }
}
