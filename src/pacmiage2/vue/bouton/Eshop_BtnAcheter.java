/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.bouton;

import pacmiage2.vue.menu.FenetrePrincipale;
import pacmiage2.modele.Objet;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pacmiage2.vue.eshop.Eshop_AfficheConfirmAcheter;

/**
 * Bouton pour sélectionner un objet à acheter
 *
 * @author Maëlle
 */
public class Eshop_BtnAcheter extends JButton {

    public Eshop_BtnAcheter(Objet it, FenetrePrincipale eshopFenetre) {
        this.setAction(new Eshop_AfficheConfirmAcheter(it, eshopFenetre));
        ImageIcon icon = new ImageIcon("./src/ressources/image/eshop/Caddy.png");
        this.setIcon(icon);
        this.setBackground(Color.black);
        this.setBorderPainted(false);

    }
    
    public void initButton(){
        
    }

}
