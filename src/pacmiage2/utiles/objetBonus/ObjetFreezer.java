package pacmiage2.utiles.objetBonus;

import java.util.List;
import pacmiage2.controleur.partie.PartieController;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacmiage2.modele.Fantome;

/**
 *
 * @author Maëlle
 */
public class ObjetFreezer{
    PartieController partie;

    public ObjetFreezer(PartieController partie) {
    this.partie=partie;
       for(Fantome f:partie.getListFantome()){
         f.setMoving(false);
     }
     int stop=partie.getTimer().getTemps()-20;
     while(partie.getTimer().getTemps()!=stop){
        
     }
       for(Fantome f:partie.getListFantome()){
              f.setMoving(true);
       }
    }
       

  
 
    
}
