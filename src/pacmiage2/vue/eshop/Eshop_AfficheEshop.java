/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.eshop;

import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.modele.Objet;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.utiles.LecteurObjet;
import pacmiage2.vue.AfficheBarreInformation;

/**
 * Affichage de l'eshop
 *
 * @author Maëlle
 */
public class Eshop_AfficheEshop {

    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

    //  public Eshop_AfficheEshop(JoueurInfo joueur) {
    public Eshop_AfficheEshop(JoueurInfo joueur, FenetrePrincipale f) {
        f.initFenetre();
        /**
         * On définit les propriétés de la fenêtre
         */
        //JFrame f = new JFrame();
        BorderLayout bl = new BorderLayout();
        //f.setUndecorated(true);

        f.getJpanel().setLayout(bl);

        /**
         * On ajoute la barre du haut contenant les informations joueurs
         */
        AfficheBarreInformation barre = new AfficheBarreInformation(f, joueur);
        JScrollPane scroll = buildListObjet(joueur, f);
        f.add(scroll);
        f.add(barre.getBarreDuHaut(), BorderLayout.NORTH);
        
        
        //f.getContentPane().add(barre.getBarreDuHaut(), BorderLayout.NORTH);
        //f.getContentPane().add(scroll, BorderLayout.SOUTH);
        f.repaint();
        f.setVisible(true);

    }

    public JScrollPane buildListObjet(JoueurInfo joueur, FenetrePrincipale f) {

        JPanel jPanelObjet = new JPanel();
        jPanelObjet.setBackground(Color.black);
        jPanelObjet.setPreferredSize(new Dimension(f.getWidth(), 2500));
        /**
         * On affiche les objets
         */
        LecteurObjet lecteur = new LecteurObjet();
        Objet objet[] = lecteur.getObjet();

        // ImageIcon separation = new ImageIcon("./eshop/separation.png");
        GridLayout layout = new GridLayout(objet.length, 0);
        layout.setVgap(30);
        jPanelObjet.setLayout(layout);
        for (int n = 0; n < objet.length; n++) {

            JPanel h = new JPanel();

            new Eshop_AfficheObjet(h, objet[n], joueur, true, f);
            jPanelObjet.add(h);

        }

        JScrollPane scroll = new JScrollPane(jPanelObjet);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        return scroll;
    }

}
