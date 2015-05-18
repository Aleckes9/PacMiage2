/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *Affichage de l'eshop
 * @author Maëlle
 */
public class Eshop_AfficheEshop {

    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int hauteur = (int) tailleEcran.getHeight();
    static int largeur = (int) tailleEcran.getWidth();

  //  public Eshop_AfficheEshop(JoueurInfo joueur) {
  
 public static void main(String[] args){
  JoueurInfo joueur=new JoueurInfo();
        /**
         * On définit les propriétés de la fenêtre
         */
        JDialog f = new JDialog();
        f.setBounds(0, 0, largeur, hauteur);
        JPanel g = new JPanel();
   g.setPreferredSize(new Dimension(largeur,2500));
        g.setBackground(Color.black);
     

        /**
         * On affiche les objets
         */
        LecteurObjet lecteur = new LecteurObjet();
        Objet objet[] = lecteur.getObjet();
        JButton acheter[] = new JButton[objet.length];
        ImageIcon separation = new ImageIcon("./eshop/separation.png");
        JLabel separ[] = new JLabel[objet.length];
        int bound = 150;
        for (int n = 0; n < objet.length; n++) {
            new Eshop_AfficheObjet(g, objet[n], bound);
            acheter[n] = new Eshop_BtnAcheter(objet[n],joueur);
            separ[n] = new JLabel(separation);
            g.add(separ[n]);
            g.add(acheter[n]);
            acheter[n].setBounds(5 * largeur / 6, bound, 65, 50);
            separ[n].setBounds(0, bound - 50, largeur, 50);

            bound += 200;

        }
        /**
         * Onajoute la barre du haut contenant les informations joueurs
         */
        g.setPreferredSize(new Dimension(largeur,bound));
    g.setLayout(new BorderLayout());
        AfficheBarreInformation barre = new AfficheBarreInformation(f,joueur);
          //g.add(barre.getBarreDuHaut(), BorderLayout.NORTH);
          JScrollPane scroll=new JScrollPane(g);
   
     scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
   
 

     
       f.add(scroll);
       f.add(barre.getBarreDuHaut(), BorderLayout.NORTH);
  
        f.setVisible(true);

    }
}
