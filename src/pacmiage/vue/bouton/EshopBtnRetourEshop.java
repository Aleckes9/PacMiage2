/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.bouton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import pacmiage.listener.BtnRetourEshop;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.utiles.Session;

/**
 * Bouton pour annuler un achat et revenir à l'eshop
 *
 * @author Maëlle
 */
public class EshopBtnRetourEshop extends JButton {

    /**
     *
     * @param f
     */
    public EshopBtnRetourEshop(FenetrePrincipale f) {
        this.setAction(new BtnRetourEshop(f));
        this.setText(Session.getInstance().recupererValeur("non"));
        this.setFont(new Font(null, 30, 30 ));
        this.setBorderPainted(false);
        this.setForeground(Color.white);
        this.setBackground(Color.black);
    }

}
