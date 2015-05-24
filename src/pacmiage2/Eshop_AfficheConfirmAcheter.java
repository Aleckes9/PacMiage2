/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
        f.setBackground(Color.black);
        JPanel g = new JPanel();
        g.setBackground(Color.black);
        f.setBounds(0, 0, largeur, hauteur);
        JLabel texte = new JLabel();
        AfficheBarreInformation barreDuHaut = new AfficheBarreInformation(f, j);
JPanel d=new JPanel();

        new Eshop_AfficheObjet(d, it,j,false);
        texte.setText("Voulez-vous acheter cet objet?");
        texte.setForeground(Color.white);
        texte.setFont(new Font(null, 40, 40 ));
        Eshop_BtnConfirmAchat oui = new Eshop_BtnConfirmAchat(j, it);
        Eshop_BtnRetourEshop non = new Eshop_BtnRetourEshop(f);
        g.add(texte);
            JPanel bt=new JPanel();
        bt.add(oui);
        bt.add(non);

bt.setBackground(Color.black);     
JPanel vide=new JPanel();
vide.setBackground(Color.black);
        GridLayout layout = new GridLayout(5, 0);
     
       f.setBackground(Color.yellow);
        f.setLayout(layout);
        
        f.add(barreDuHaut.getBarreDuHaut());
    
        f.add(d);
       f.add(vide);
        f.add(g);
        f.add(bt);
 
        f.setVisible(true);
    }

}
