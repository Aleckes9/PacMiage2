/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.bouton;

import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pacmiage.vue.eshop.EshopAfficheConfirmAcheter;

/**
 * Bouton pour sélectionner un objet à acheter
 *
 * @author Maëlle
 */
public class EshopBtnAcheter extends JButton {

    /**
     *
     * @param it
     * @param eshopFenetre
     */
    public EshopBtnAcheter(Objet it, FenetrePrincipale eshopFenetre) {
        this.setAction(new EshopAfficheConfirmAcheter(it, eshopFenetre));
        ImageIcon icon = new ImageIcon("./src/ressources/image/eshop/Caddy.png");
        this.setIcon(icon);
        this.setBackground(Color.black);
        this.setBorderPainted(false);

    }
    
    /**
     *
     */
    public void initButton(){
        
    }

}
