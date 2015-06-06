package pacmiage2.utiles;

import pacmiage2.controleur.PartieController;
import pacmiage2.modele.Fantome;
import pacmiage2.modele.PacMiage;

/**
 *
 * @author Maëlle
 */
public class ObjetSpeed{
    private  PartieController partie;

    public ObjetSpeed(PartieController partie){
    
     this.partie=partie;
     PacMiage p=partie.getPlayer();
     p.setVitesse(4);
             int stop=partie.getTimer().getTemps()-20;
     while(partie.getTimer().getTemps()!=stop){
        
     }
        p.setVitesse(2);
       }
}

