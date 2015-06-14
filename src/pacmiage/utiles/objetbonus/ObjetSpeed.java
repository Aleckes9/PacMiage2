package pacmiage.utiles.objetbonus;

import pacmiage.modele.ControleurTemps;
import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de générer l'objet bonus speed
 */
public class ObjetSpeed implements Bonus {

    /**
     * Constructeur de la classe ObjetSpeed
     */
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
