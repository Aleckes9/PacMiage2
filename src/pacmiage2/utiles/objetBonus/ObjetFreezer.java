package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;

import pacmiage2.modele.Fantome;

/**
 *
 * @author Maëlle
 */
public class ObjetFreezer implements Bonus{
    PartieController partie;

    public ObjetFreezer() {

    }

    @Override
    public void executerBonus(PartieController partie) {
    this.partie=partie;
       for(Fantome f:partie.getListFantome()){
         f.setMoving(false);
     }  
    
    }
       

  
 
    
}
