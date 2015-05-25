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

//        ImageIcon icon = new ImageIcon("./src/ressources/image/eshop/Caddy.png");
//        this.setIcon(icon);
        this.setText("Retour Menu");
     this.setBackground(Color.black);
        this.setBorderPainted(false);
        this.setForeground(Color.white);
       
    }
    
        
    
}
