/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Affichage de l'eshop
 *
 * @author Maëlle
 */
public class Eshop_AfficheEshop {

 
 
    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int hauteur = (int) tailleEcran.getHeight();
    static int largeur = (int) tailleEcran.getWidth();

    //  public Eshop_AfficheEshop(JoueurInfo joueur) {
      public Eshop_AfficheEshop(JoueurInfo joueur) {
     
       
        /**
         * On définit les propriétés de la fenêtre
         */
        JFrame f = new JFrame();
        f.setBounds(0, 0, largeur, hauteur);
     f.setUndecorated(true);
        JPanel g = new JPanel();
        g.setPreferredSize(new Dimension(largeur, 2500));
        g.setBackground(Color.black);

        /**
         * On affiche les objets
         */
        LecteurObjet lecteur = new LecteurObjet();
        Objet objet[] = lecteur.getObjet();
    
        // ImageIcon separation = new ImageIcon("./eshop/separation.png");
   

             GridLayout layout = new GridLayout(objet.length,0);
   layout.setVgap(30);
      g.setLayout(layout);
        for (int n = 0; n < objet.length; n++) {
                 

     
        
            JPanel h=new JPanel();

            new Eshop_AfficheObjet(h,objet[n],joueur,true,f);
         g.add(h);
         
     


          

        }
        /**
         * Onajoute la barre du haut contenant les informations joueurs
         */
     
    
        AfficheBarreInformation barre = new AfficheBarreInformation(f, joueur);
      
        JScrollPane scroll = new JScrollPane(g);

        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        f.add(scroll);
        f.add(barre.getBarreDuHaut(), BorderLayout.NORTH);

        f.setVisible(true);

    }
}