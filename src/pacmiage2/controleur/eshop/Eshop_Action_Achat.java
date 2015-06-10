/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.controleur.eshop;

import pacmiage2.modele.JoueurInfo;
import pacmiage2.vue.eshop.Eshop_AfficheEshop;
import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.modele.Objet;
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

/**
 * Achat confirmFenetre'un objet
 *
 * @author Maëlle
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
        String picture = "./src/ressources/image/eshop/ghost.png";
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
                new Eshop_AfficheEshop(eshopFenetre);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Eshop_Action_Achat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Eshop_Action_Achat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Eshop_Action_Achat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JDialog f = new JDialog();

        JPanel p = new JPanel();
        p.setBackground(Color.black);
        f.setBounds(FenetrePrincipale.getTailleEcran().width / 3, FenetrePrincipale.getTailleEcran().height / 4, 4 * FenetrePrincipale.getTailleEcran().width / 11, FenetrePrincipale.getTailleEcran().height / 2);
        ImageIcon icon = new ImageIcon(picture);
        JLabel image = new JLabel(icon);
        JLabel texte = new JLabel();
        texte.setText(message);
        texte.setForeground(Color.white);
        texte.setFont(new Font(null, 30, 30));

        p.setLayout(new BorderLayout());
        p.add(texte, BorderLayout.NORTH);
        p.add(image);
        f.add(p);
        f.setVisible(true);
    }

}
