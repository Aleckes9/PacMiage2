package pacmiage2.utiles.objetBonus;

import pacmiage2.controleur.partie.PartieController;
import pacmiage2.modele.Bonus;
import pacmiage2.modele.Fantome;

/**
 *
 * @author Maëlle
 */
public class ObjetSlow implements Bonus {
    private  PartieController partie;

    public ObjetSlow(){
    
     
}

    @Override
    public void executerBonus(PartieController partie) {
this.partie=partie;
       for(Fantome f:partie.getListFantome()){
         f.setVitesse(1);
     }
     int stop=partie.getTimer().getTemps()-20;
     while(partie.getTimer().getTemps()!=stop){
        
     }
       for(Fantome f:partie.getListFantome()){
              f.setVitesse(2);
       }    }
}
