package pacmiage2.utiles;

import pacmiage2.controleur.PartieController;
import pacmiage2.modele.Fantome;

/**
 *
 * @author Maëlle
 */
public class ObjetSlow {
    private  PartieController partie;

    public ObjetSlow(PartieController partie){
    
     this.partie=partie;
       for(Fantome f:partie.getListFantome()){
         f.setVitesse(1);
     }
     int stop=partie.getTimer().getTemps()-20;
     while(partie.getTimer().getTemps()!=stop){
        
     }
       for(Fantome f:partie.getListFantome()){
              f.setVitesse(2);
       }
}}
