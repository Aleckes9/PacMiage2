/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Maëlle
 */

public class Eshop_Liaison_avec_Menu {
    public static    Sauvegarde save;
   public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException  {
      
       JoueurInfo joueur=new JoueurInfo();
       joueur.ajouterGraines(5000);
      save=new Sauvegarde();
      joueur= save.lectureFichier();
       

      new Eshop_AfficheEshop(joueur);
              
   }
}
