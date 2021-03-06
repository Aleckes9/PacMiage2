/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.bouton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import pacmiage.listener.RetourMenu;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.utiles.Session;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Bouton pour revenir au bouton menu
 */
public class BtnRetourMenu extends JButton {

    /**
     * Constructeur de la classe BtnRetourMenu
     * @param f la fenêtre principale
     */
    public BtnRetourMenu(FenetrePrincipale f) {
        this.setAction(new RetourMenu(f));
        this.setFont(new Font("Kristen ITC", Font.PLAIN, 25));
        this.setText(Session.getInstance().recupererValeur("retour"));
        this.setBackground(Color.black);
        this.setBorderPainted(false);
        this.setForeground(Color.white);

    }

}
