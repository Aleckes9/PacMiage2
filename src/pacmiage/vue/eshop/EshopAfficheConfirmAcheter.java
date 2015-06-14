/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.eshop;

import pacmiage.vue.bouton.EshopBtnConfirmAchat;
import pacmiage.vue.bouton.EshopBtnRetourEshop;
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
public class EshopAfficheConfirmAcheter extends AbstractAction {

    Objet it;
    FenetrePrincipale eshopFenetre;

    /**
     *
     * @param it
     * @param eshopFenetre
     */
    public EshopAfficheConfirmAcheter(Objet it, FenetrePrincipale eshopFenetre) {
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
        EshopAfficheObjet eshop_AfficheObjet = new EshopAfficheObjet(d, it, false, eshopFenetre);
        texte.setText(Session.getInstance().recupererValeur("confirmation"));

        texte.setForeground(Color.white);
        texte.setFont(new Font(null, 40, 40));
        EshopBtnConfirmAchat oui = new EshopBtnConfirmAchat(it, eshopFenetre);
        EshopBtnRetourEshop non = new EshopBtnRetourEshop(eshopFenetre);
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
