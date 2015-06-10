/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.bouton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import pacmiage2.controleur.RetourMenu;
import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.utiles.Session;

/**
 *
 * @author Maëlle
 */
public class Btn_RetourMenu extends JButton {

    public Btn_RetourMenu(FenetrePrincipale f) {
        this.setAction(new RetourMenu(f));
        this.setFont(new Font("Kristen ITC", Font.PLAIN, 25));
        this.setText(Session.getInstance().recupererValeur("retour"));
        this.setBackground(Color.black);
        this.setBorderPainted(false);
        this.setForeground(Color.white);

    }

}
