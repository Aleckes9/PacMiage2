/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue;

import pacmiage2.modele.JoueurInfo;
import java.awt.Color;
import javax.swing.JButton;
import pacmiage2.controleur.RetourMenu;
import pacmiage2.modele.Fenetre;
import pacmiage2.utiles.Session;

/**
 *
 * @author Maëlle
 */
public class BtnRetourMenu extends JButton{

    public BtnRetourMenu( JoueurInfo j,Fenetre f) {
this.setAction(new RetourMenu(j,f));
        this.setText(Session.getInstance().recupererValeur("retour"));
     this.setBackground(Color.black);
        this.setBorderPainted(false);
        this.setForeground(Color.white);
       
    }
    
        
    
}
