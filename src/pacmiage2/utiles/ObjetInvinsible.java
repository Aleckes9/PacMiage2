package pacmiage2.utiles;

import pacmiage2.controleur.ControleurQuestion;
import pacmiage2.controleur.PartieController;
import pacmiage2.modele.PacMiage;

/**
 *
 * @author Maëlle
 */
public class ObjetInvinsible {
    private  PartieController partie;

    public ObjetInvinsible(PartieController partie){
    
     this.partie=partie;
    
   
    
             int stop=partie.getTimer().getTemps()-20;
     while(partie.getTimer().getTemps()!=stop){
        
     }
      
    
}
}
