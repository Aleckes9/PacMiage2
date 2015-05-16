/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *Bouton pour sélectionner un objet à acheter
 * @author Maëlle
 */
public class Eshop_BtnAcheter extends JButton{

    public Eshop_BtnAcheter(Objet it,JoueurInfo j)  {
     this.setAction(new Eshop_AfficheConfirmAcheter(it,j));
     ImageIcon icon = new ImageIcon("./eshop/Caddy.png"); 
     this.setIcon(icon);
      
    }
     
}
