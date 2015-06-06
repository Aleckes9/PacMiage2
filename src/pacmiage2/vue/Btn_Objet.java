/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue;

import pacmiage2.controleur.Action_Btn_Objet;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.modele.Fenetre;
import pacmiage2.modele.Objet;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Maëlle
 */
public class Btn_Objet extends JButton {

    public Btn_Objet(Objet it, JoueurInfo j,Fenetre eshopFenetre) {
       
  this.setAction(new Action_Btn_Objet(it, j,j.isJeuEnCours(),eshopFenetre));
        if(it!=null){
            ImageIcon icon = new ImageIcon(it.getMiniImage());
        this.setIcon(icon);
        }
     this.setBackground(Color.black);
        this.setBorderPainted(false);
       
        }
    
    
}
