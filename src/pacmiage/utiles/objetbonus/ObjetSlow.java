package pacmiage.utiles.objetbonus;

import pacmiage.modele.ControleurTemps;
import pacmiage.controleur.partie.PartieController;
import pacmiage.modele.Bonus;
import pacmiage.modele.Fantome;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de générer l'objet bonus slow
 */
public class ObjetSlow implements Bonus {

    /**
     * Constructeur de la classe ObjetSlow
     */
    public ObjetSlow() {

    }

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
