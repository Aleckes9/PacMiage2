/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * Bouton pour confirmer l'achat d'un objet
 *
 * @author Maëlle
 */
public class Eshop_BtnConfirmAchat extends JButton {

    public Eshop_BtnConfirmAchat(JoueurInfo j, Objet it,JDialog confirmFenetre,JDialog eshopFenetre) {
        this.setAction(new Eshop_Action_Achat(j, it,confirmFenetre,eshopFenetre));
        this.setText("Oui");
        this.setFont(new Font(null, 30, 30 ));
        this.setBorderPainted(false);
        this.setForeground(Color.white);
        this.setBackground(Color.black);
    }

}
