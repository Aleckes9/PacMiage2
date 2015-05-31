/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Bouton pour sélectionner un objet à acheter
 *
 * @author Maëlle
 */
public class Eshop_BtnAcheter extends JButton {

    public Eshop_BtnAcheter(Objet it, JoueurInfo j,JFrame eshopFenetre) {
        this.setAction(new Eshop_AfficheConfirmAcheter(it, j,eshopFenetre));
        ImageIcon icon = new ImageIcon("./src/ressources/image/eshop/Caddy.png");
        this.setIcon(icon);
     this.setBackground(Color.black);
        this.setBorderPainted(false);
       
    }

}
