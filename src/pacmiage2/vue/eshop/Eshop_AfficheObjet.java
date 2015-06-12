/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.eshop;

import pacmiage2.vue.bouton.Eshop_BtnAcheter;
import pacmiage2.vue.menu.FenetrePrincipale;
import pacmiage2.modele.Objet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Affiche un objet donné avec son nom, son image, sa description et son prix
 *
 * @author Maëlle
 */
public class Eshop_AfficheObjet {

    public Eshop_AfficheObjet(JPanel panel, Objet objet, boolean affBtnAchat, FenetrePrincipale eshopFenetre) {

        /**
         * Paramètres de l'affichage du nom
         */
        JLabel nom = new JLabel(objet.getNom());
        nom.setForeground(Color.white);
        nom.setFont(new Font(null, 40, 40));

        /**
         * Paramètres de l'affichage du prix
         */
        JLabel prix = new JLabel("" + objet.getPrix());
        prix.setForeground(Color.white);
        prix.setFont(new Font(null, 10, 40));
        /**
         * Paramètres de l'affichage de la description
         */
        JLabel description = new JLabel(objet.getDescription());
        description.setForeground(Color.white);
        description.setFont(new Font(null, 20, 20));

        /**
         * Paramètre de l'affichage de l'image
         */
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
        if (affBtnAchat == true) {
            k.add(new Eshop_BtnAcheter(objet, eshopFenetre));
        }
        /**
         * Ajout des éléments à la fenêtre
         */
        GridLayout layout = new GridLayout(1, 0);

        panel.setLayout(layout);

        panel.add(image);

        panel.add(j);
        panel.add(k);

        panel.setBackground(Color.black);

    }

    public void afficher() {

    }
}
