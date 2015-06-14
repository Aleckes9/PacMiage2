/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.eshop;

import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import pacmiage.utiles.LecteurObjet;

/**
 * Affichage de l'eshop
 *
 * @author Maëlle
 */
public final class Eshop_AfficheEshop {

    //  public Eshop_AfficheEshop(JoueurInfo joueur) {
    public Eshop_AfficheEshop(FenetrePrincipale f) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        f.dispose();
        f.initFenetre();
        //On définit les propriétés de la fenêtre
   
        //JFrame f = new JFrame();
        BorderLayout bl = new BorderLayout();
        //f.setUndecorated(true);

        f.getJpanel().setLayout(bl);

        //On ajoute la barre du haut contenant les informations joueurs
        JScrollPane scroll = buildListObjet(f);
        f.add(scroll);
        f.add(new AfficheBarreInformation(f), BorderLayout.NORTH);

        f.repaint();
        f.setVisible(true);

    }

    public JScrollPane buildListObjet(FenetrePrincipale f) {

        try {
            JPanel jPanelObjet = new JPanel();
            jPanelObjet.setBackground(Color.black);
            jPanelObjet.setPreferredSize(new Dimension(f.getWidth(), 2500));
            //On affiche les objets
            LecteurObjet lecteur = new LecteurObjet();
            Objet objet[] = lecteur.getObjet();
            
            // ImageIcon separation = new ImageIcon("./eshop/separation.png");
            GridLayout layout = new GridLayout(objet.length, 0);
            layout.setVgap(30);
            jPanelObjet.setLayout(layout);
            for (Objet objet1 : objet) {
                JPanel h = new JPanel();
                Eshop_AfficheObjet eshop_AfficheObjet = new Eshop_AfficheObjet(h, objet1, true, f);
                jPanelObjet.add(h);
            }
            
            JScrollPane scroll = new JScrollPane(jPanelObjet);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            return scroll;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Eshop_AfficheEshop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
