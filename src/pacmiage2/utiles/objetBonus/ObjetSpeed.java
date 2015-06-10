package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;
import pacmiage2.modele.Fantome;
import pacmiage2.modele.PacMiage;

/**
 *
 * @author Maëlle
 */
public class ObjetSpeed implements Bonus{

    public ObjetSpeed(){
    

       }

    @Override
    public void executerBonus(PartieController partie) {

     PacMiage p=partie.getPlayer();
     p.setVitesse(4);
             int stop=partie.getTimer().getTemps()-20;
     while(partie.getTimer().getTemps()!=stop){
        
     }
        p.setVitesse(2);    }
}

