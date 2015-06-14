/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.listener;

import pacmiage.modele.JoueurInfo;
import pacmiage.vue.eshop.EshopAfficheEshop;
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
 * 
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant d'afficher le message résultant de la confirmation d'un achat
 */
public class EshopActionAchat extends AbstractAction {

    private Objet it;
    private String message;
    private FenetrePrincipale eshopFenetre;

    /**
     * Constructeur de la classe EshopActionAchat
     * @param it est un objet
     * @param eshopFenetre est la fenêtre de l'eshop
     */
    public EshopActionAchat(Objet it, FenetrePrincipale eshopFenetre) {
        this.it = it;
        this.eshopFenetre = eshopFenetre;
    }

    /**
     * Méthode permettant de renvoyer un message de validation ou infirmation d'achat lorsque l'utilisateur clique sur le bouton de confirmation d'achat
     * @param ae est un event indiquant qu'une action a lieue
     */
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
                EshopAfficheEshop eshopAfficheEshop = new EshopAfficheEshop(eshopFenetre);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(EshopActionAchat.class.getName()).log(Level.SEVERE, null, ex);
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
