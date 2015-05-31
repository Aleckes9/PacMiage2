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
public class BtnRetourMenu extends JButton{

    public BtnRetourMenu( JoueurInfo j) {

  this.setAction(new RetourMenu(j));
        this.setText(Session.getInstance().recupererValeur("retour"));
     this.setBackground(Color.black);
        this.setBorderPainted(false);
        this.setForeground(Color.white);
       
    }
    
        
    
}
