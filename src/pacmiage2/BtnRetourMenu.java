/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Maëlle
 */
public class BtnRetourMenu extends JButton{

    public BtnRetourMenu( JoueurInfo j,JFrame f) {

  this.setAction(new RetourMenu(j,f));
        this.setText(Session.getInstance().recupererValeur("retour"));
     this.setBackground(Color.black);
        this.setBorderPainted(false);
        this.setForeground(Color.white);
       
    }
    
        
    
}
