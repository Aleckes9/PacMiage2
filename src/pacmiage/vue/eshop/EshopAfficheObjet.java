/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.eshop;

import pacmiage.vue.bouton.EshopBtnAcheter;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Affiche un objet donné avec son nom, son image, sa description et son prix
 */
public final class EshopAfficheObjet {
    
    private final Objet objet;
    private final JPanel panel;
    private final boolean affBtnAchat;
    private final FenetrePrincipale eshopFenetre;

    /**
     * Constructeur de la classe EshopAfficheObjet
     * @param panel le panel
     * @param objet l'objet
     * @param affBtnAchat le bouton d'achat
     * @param eshopFenetre la fenêtre de l'eshop
     */
    public EshopAfficheObjet(JPanel panel, Objet objet, boolean affBtnAchat, FenetrePrincipale eshopFenetre) {
        this.objet = objet;
        this.panel = panel;
        this.affBtnAchat = affBtnAchat;
        this.eshopFenetre = eshopFenetre;
        initAffObjet();
    }
    
    /**
     * Méthode permettant d'initialiser Affichage d'un objet
     */
    public void initAffObjet(){
        JLabel nom = new JLabel(objet.getNom());
        nom.setForeground(Color.white);
        nom.setFont(new Font(null, 40, 40));
        JLabel prix = new JLabel("" + objet.getPrix());
        prix.setForeground(Color.white);
        prix.setFont(new Font(null, 10, 40));
        JLabel description = new JLabel(objet.getDescription());
        description.setForeground(Color.white);
        description.setFont(new Font(null, 20, 20));
        ImageIcon icon = new ImageIcon(objet.getImage());
        JLabel image = new JLabel(icon);

        JLabel j = new JLabel();

        GridLayout layout1 = new GridLayout(2, 0);

        layout1.setHgap(10);
        layout1.setVgap(5);
        j.setLayout(layout1);
        j.add(nom, BorderLayout.NORTH);
        j.add(description, BorderLayout.CENTER);

        JLabel k = new JLabel();

        GridLayout layout2 = new GridLayout(0, 2);

        layout1.setHgap(10);
        layout1.setVgap(5);
        k.setLayout(layout2);
        k.add(prix);
        if (affBtnAchat) {
            k.add(new EshopBtnAcheter(objet, eshopFenetre));
        }

        GridLayout layout = new GridLayout(1, 0);

        panel.setLayout(layout);

        panel.add(image);

        panel.add(j);
        panel.add(k);

        panel.setBackground(Color.black);
    }


}
