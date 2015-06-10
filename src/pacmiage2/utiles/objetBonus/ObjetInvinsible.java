package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.ControleurQuestion;
import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;
import pacmiage2.modele.PacMiage;

/**
 *
 * @author Maëlle
 */
public class ObjetInvinsible implements Bonus {
    private  PartieController partie;

    public ObjetInvinsible(){

    
}

    @Override
    public void executerBonus(PartieController partie) {
     this.partie=partie;
    
   
    
             int stop=partie.getTimer().getTemps()-20;
     while(partie.getTimer().getTemps()!=stop){
        
     }    }
}
