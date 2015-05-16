/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;


import java.awt.Color;
import javax.swing.JButton;

/**
 *Bouton pour confirmer l'achat d'un objet
 * @author Maëlle
 */
public class Eshop_BtnConfirmAchat extends JButton{

    public Eshop_BtnConfirmAchat(JoueurInfo j,Objet it) {
    this.setAction(new Eshop_Action_ConfirmAchat(j,it));
       this.setText("Oui");
       this.setForeground(Color.white);
       this.setBackground(Color.black);
    }
    
}
