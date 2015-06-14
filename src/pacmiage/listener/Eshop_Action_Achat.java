/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.listener;

import pacmiage.modele.JoueurInfo;
import pacmiage.vue.eshop.Eshop_AfficheEshop;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage.utiles.Configuration;

/**
 * Achat confirmFenetre'un objet
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Eshop_Action_Achat extends AbstractAction {

    private Objet it;
    private String message;
    private FenetrePrincipale eshopFenetre;

    public Eshop_Action_Achat(Objet it, FenetrePrincipale eshopFenetre) {
        this.it = it;
        this.eshopFenetre = eshopFenetre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JoueurInfo joueur = JoueurInfo.getInstance();
        String picture = Configuration.getInstance().recupererValeur("objetGhost");
        if (joueur.getNbObjet() >= 4) {
            message = "Vous avez trop d'objets";
        } else if (joueur.getGraines() < it.getPrix()) {
            message = "Vous n'avez pas assez de graines";
        } else {
            joueur.retirerGraines(it.getPrix());
            joueur.ajouterObjet(it);
            message = "Cet objet a été ajouté à votre liste";
            picture = it.getImage();
            eshopFenetre.dispose();
            try {
                Eshop_AfficheEshop eshop_AfficheEshop = new Eshop_AfficheEshop(eshopFenetre);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Eshop_Action_Achat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        JDialog fenetre = new JDialog();
               fenetre.setAlwaysOnTop(true);
        JPanel p = new JPanel();
        p.setBackground(Color.black);
        fenetre.setBounds(FenetrePrincipale.getTailleEcran().width / 3, FenetrePrincipale.getTailleEcran().height / 4, 4 * FenetrePrincipale.getTailleEcran().width / 11, FenetrePrincipale.getTailleEcran().height / 2);
        ImageIcon icon = new ImageIcon(picture);
        JLabel image = new JLabel(icon);
        JLabel texte = new JLabel();
        texte.setText(message);
        texte.setForeground(Color.white);
        texte.setFont(new Font(null, 30, 30));

        p.setLayout(new BorderLayout());
        p.add(texte, BorderLayout.NORTH);
        p.add(image);
        fenetre.add(p);
        fenetre.setVisible(true);
    }

}
