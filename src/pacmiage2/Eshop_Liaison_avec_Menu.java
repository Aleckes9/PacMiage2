/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

/**
 *
 * @author Maëlle
 */
public class Eshop_Liaison_avec_Menu {
   public static void main(String[] args)  {
       JoueurInfo joueur=new JoueurInfo();
       joueur.ajouterGraines(5000);
      new Eshop_AfficheEshop(joueur);
               }
}
