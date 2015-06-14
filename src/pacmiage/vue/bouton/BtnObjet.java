/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.bouton;

import pacmiage.listener.ActionBtnObjet;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class BtnObjet extends JButton {

    /**
     *
     * @param it
     * @param eshopFenetre
     */
    public BtnObjet(Objet it,FenetrePrincipale eshopFenetre) {
       
  this.setAction(new ActionBtnObjet(it,eshopFenetre));
        if(it!=null){
            ImageIcon icon = new ImageIcon(it.getMiniImage());
        this.setIcon(icon);
        }
     this.setBackground(Color.black);
        this.setBorderPainted(false);
       
        }
    
    
}
