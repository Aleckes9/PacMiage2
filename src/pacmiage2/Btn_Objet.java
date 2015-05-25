/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 *
 * @author Maëlle
 */
class Btn_Objet extends JButton {

    public Btn_Objet(Objet it, JoueurInfo j,JDialog eshopFenetre) {
       
  this.setAction(new Action_Btn_Objet(it, j,j.isJeuEnCours(),eshopFenetre));
        ImageIcon icon = new ImageIcon(it.getImage());
        this.setIcon(icon);
     this.setBackground(Color.black);
        this.setBorderPainted(false);
       
        }
    
    
}
