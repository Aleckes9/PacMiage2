/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.eshop;

import pacmiage.vue.bouton.Eshop_BtnConfirmAchat;
import pacmiage.vue.bouton.Eshop_BtnRetourEshop;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage.utiles.Session;

/**
 * Ouvre un message de confirmation pour l'achat d'un objet
 *
 * @author Maëlle
 */
public class Eshop_AfficheConfirmAcheter extends AbstractAction {

    Objet it;
    FenetrePrincipale eshopFenetre;

    public Eshop_AfficheConfirmAcheter(Objet it, FenetrePrincipale eshopFenetre) {
        this.it = it;
        this.eshopFenetre = eshopFenetre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        eshopFenetre.dispose();
        eshopFenetre.initFenetre();

        JPanel g = new JPanel();

        JLabel texte = new JLabel();
        JPanel d = new JPanel();
        g.setBackground(Color.BLACK);
        Eshop_AfficheObjet eshop_AfficheObjet = new Eshop_AfficheObjet(d, it, false, eshopFenetre);
        texte.setText(Session.getInstance().recupererValeur("confirmation"));

        texte.setForeground(Color.white);
        texte.setFont(new Font(null, 40, 40));
        Eshop_BtnConfirmAchat oui = new Eshop_BtnConfirmAchat(it, eshopFenetre);
        Eshop_BtnRetourEshop non = new Eshop_BtnRetourEshop(eshopFenetre);
        g.add(texte);
        JPanel bt = new JPanel();
        bt.add(oui);
        bt.add(non);

        bt.setBackground(Color.black);

        GridLayout layout = new GridLayout(4, 0);

        eshopFenetre.setBackground(Color.yellow);
        eshopFenetre.setLayout(layout);

        eshopFenetre.add(new AfficheBarreInformation(eshopFenetre));

        eshopFenetre.add(d);
        eshopFenetre.add(g);
        eshopFenetre.add(bt);

        eshopFenetre.setVisible(true);
    }

}
