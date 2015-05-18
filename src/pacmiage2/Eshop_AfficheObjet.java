/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static pacmiage2.Eshop_AfficheEshop.hauteur;
import static pacmiage2.Eshop_AfficheEshop.largeur;

/**
 * Affiche un objet donné avec son nom, son image, sa description et son prix
 *
 * @author Maëlle
 */
public class Eshop_AfficheObjet {

    public Eshop_AfficheObjet(JPanel f, Objet it, int bound) {

        /**
         * Paramètres de l'affichage du nom
         */
        JLabel nom = new JLabel(it.getNom());
        nom.setForeground(Color.white);
        nom.setFont(new Font(null, largeur * 40 / 1366, 40 * hauteur / 768));
        /**
         * Paramètres de l'affichage du prix
         */
        JLabel prix = new JLabel(""+it.getPrix());
        prix.setForeground(Color.white);
        prix.setFont(new Font(null, largeur * 40 / 1366, 40 * hauteur / 768));
        /**
         * Paramètres de l'affichage de la description
         */
        JLabel description = new JLabel(it.getDescription());
        description.setForeground(Color.white);
        description.setFont(new Font(null, largeur * 20 / 1366, 20 * hauteur / 768));
        /**
         * Paramètre de l'affichage de l'image
         */
        ImageIcon icon = new ImageIcon(it.getImage());
        JLabel image = new JLabel(icon);
 ImageIcon separation = new ImageIcon("./eshop/separation.png");
        JLabel separ = new JLabel(separation);
      
           
           
        /**
         * Ajout des éléments à la fenêtre
         */
        f.add(nom);
        f.add(prix);
        f.add(description);
        f.add(image);
 f.add(separ);
       /**
         * Paramétrage de la position des objets dans la fenêtre
         */
        image.setBounds(largeur * 50 / 1366, bound * hauteur / 768, largeur * 150 / 1366, 150 * hauteur / 768);
        description.setBounds(largeur / 4, bound + (20 * hauteur / 768), largeur, 100 * hauteur / 768);
        prix.setBounds(3 * largeur / 4, bound + (10 * hauteur / 768), largeur, 30 * hauteur / 768);
        nom.setBounds(2 * largeur / 5, bound, largeur / 2, 30 * hauteur / 768);
  separ.setBounds(0, bound - 50, largeur, 50);
    }

}
