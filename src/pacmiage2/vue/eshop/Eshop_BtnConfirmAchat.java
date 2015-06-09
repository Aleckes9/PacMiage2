/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.eshop;

import pacmiage2.controleur.eshop.Eshop_Action_Achat;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.modele.Objet;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import pacmiage2.utiles.Session;

/**
 * Bouton pour confirmer l'achat d'un objet
 *
 * @author Maëlle
 */
public class Eshop_BtnConfirmAchat extends JButton {

    public Eshop_BtnConfirmAchat(JoueurInfo j, Objet it,JFrame confirmFenetre,FenetrePrincipale eshopFenetre) {
        this.setAction(new Eshop_Action_Achat(j, it,confirmFenetre,eshopFenetre));
        this.setText(Session.getInstance().recupererValeur("oui"));
        this.setFont(new Font(null, 30, 30 ));
        this.setBorderPainted(false);
        this.setForeground(Color.white);
        this.setBackground(Color.black);
    }

}
