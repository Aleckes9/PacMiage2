/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static pacmiage2.Eshop_AfficheEshop.hauteur;
import static pacmiage2.Eshop_AfficheEshop.largeur;

/**
 * Ouvre un message de confirmation pour l'achat d'un objet
 *
 * @author Maëlle
 */
public class Eshop_AfficheConfirmAcheter extends AbstractAction {

    Objet it;
    JoueurInfo j;

    public Eshop_AfficheConfirmAcheter(Objet it, JoueurInfo j) {
        this.it = it;
        this.j = j;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JDialog f = new JDialog();
        JPanel g = new JPanel();
        g.setBackground(Color.black);
        f.setBounds(0, 0, largeur, hauteur);
        JLabel texte = new JLabel();
        AfficheBarreInformation barreDuHaut = new AfficheBarreInformation(f, j);

        // g.add(barreDuHaut.getBarreDuHaut());
        new Eshop_AfficheObjet(g, it, 150 * hauteur / 768);
        texte.setText("Voulez-vous acheter cet objet?");
        texte.setForeground(Color.white);
        texte.setFont(new Font(null, 30 * largeur / 1360, 30 * hauteur / 768));
        Eshop_BtnConfirmAchat oui = new Eshop_BtnConfirmAchat(j, it);
        Eshop_BtnRetourEshop non = new Eshop_BtnRetourEshop(f);
        g.add(texte);
        g.add(oui);
        g.add(non);

        texte.setBounds(largeur / 3, hauteur / 2, 600 * largeur / 1360, 100 * hauteur / 768);
        oui.setBounds(2 * largeur / 5, 2 * hauteur / 3, 80 * largeur / 1360, 50 * hauteur / 768);
        non.setBounds(largeur / 2, 2 * hauteur / 3, 80 * largeur / 1360, 50 * hauteur / 768);
        g.setLayout(new BorderLayout());
        f.add(barreDuHaut.getBarreDuHaut());
        f.add(g);

        f.setVisible(true);
    }

}
