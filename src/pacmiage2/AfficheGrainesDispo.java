/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *Permet d'afficher le nombre de graines disponibles
 * @author Maëlle
 */
public class AfficheGrainesDispo {
private JLabel graine;
    public AfficheGrainesDispo() {
    graine=new JLabel();
    graine.setText("$$$$ .");
graine.setBackground(Color.black);
graine.setFont(new Font("Serif", Font.BOLD, 40));
graine.setForeground(Color.WHITE);

    }
/**
 * Renvoie le JLabel où s'affiche le nombre de graines disponibles
 * @return  le JLabel où s'affiche le nombre de graines disponibles
 */
    public JLabel getGraine() {
        return graine;
    }
    
}
