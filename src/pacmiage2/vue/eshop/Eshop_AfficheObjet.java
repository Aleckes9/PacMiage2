/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.eshop;

import pacmiage2.vue.bouton.Eshop_BtnAcheter;
import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.modele.Objet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage2.modele.JoueurInfo;

/**
 * Affiche un objet donné avec son nom, son image, sa description et son prix
 *
 * @author Maëlle
 */
public class Eshop_AfficheObjet {

    public Eshop_AfficheObjet(JPanel f, Objet it, boolean b, FenetrePrincipale eshopFenetre) {

        /**
         * Paramètres de l'affichage du nom
         */
        JLabel nom = new JLabel(it.getNom());
        nom.setForeground(Color.white);
        nom.setFont(new Font(null, 40, 40));

        /**
         * Paramètres de l'affichage du prix
         */
        JLabel prix = new JLabel("" + it.getPrix());
        prix.setForeground(Color.white);
        prix.setFont(new Font(null, 10, 40));
        /**
         * Paramètres de l'affichage de la description
         */
        JLabel description = new JLabel(it.getDescription());
        description.setForeground(Color.white);
        description.setFont(new Font(null, 20, 20));

        /**
         * Paramètre de l'affichage de l'image
         */
        ImageIcon icon = new ImageIcon(it.getImage());
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
        if (b == true) {
            k.add(new Eshop_BtnAcheter(it, eshopFenetre));
        }
        /**
         * Ajout des éléments à la fenêtre
         */
        GridLayout layout = new GridLayout(1, 0);

        f.setLayout(layout);

        f.add(image);

        f.add(j);
        f.add(k);

        f.setBackground(Color.black);

    }
}
