package pacmiage.utiles.objetbonus;

import pacmiage.modele.ControleurTemps;
import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.modele.Fantome;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de générer l'objet bonus freezer
 */
public class ObjetFreezer implements Bonus {

    /**
     * Constructeur de la classe ObjetFreezer
     */
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
