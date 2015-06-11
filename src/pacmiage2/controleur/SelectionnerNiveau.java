/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.controleur;

import pacmiage2.modele.FenetrePrincipale;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.newdawn.slick.SlickException;
import pacmiage2.utiles.Session;
import pacmiage2.utiles.Configuration;
import pacmiage2.vue.bouton.Btn_RetourMenu;
import pacmiage2.vue.menu.CarteIcon;

/**
 *
 * @author Axel
 */
public class SelectionnerNiveau implements ActionListener {
    
    private FenetrePrincipale fenetre;

    public SelectionnerNiveau(FenetrePrincipale f) {
        this.fenetre = f;
        
        JPanel j = new JPanel();
        f.setJpanel(j);
        JPanel niveaux = new JPanel();
        JLabel titre = new JLabel(Session.getInstance().recupererValeur("niveaux"), JLabel.CENTER);
        titre.setPreferredSize(new Dimension(f.getWidth(), f.getHeight()/5));
        BorderLayout disposition = new BorderLayout();
        j.setLayout(disposition);

        f.setContentPane(j);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        j.setBackground(Color.black);
        niveaux.setBackground(Color.black);
        niveaux.setLayout(new BoxLayout(niveaux, BoxLayout.LINE_AXIS));
        Font f1 = new Font("Kristen ITC", Font.PLAIN, 50);

        titre.setFont(f1);
        titre.setForeground(Color.white);

        for (int i = 1; i <= 5; i++) {

            
            final CarteIcon carteLevel = new CarteIcon(Configuration.getInstance().recupererValeur("carteMini"+ String.valueOf(i)));
            final JButton level = new JButton(carteLevel);
            level.setText(String.valueOf(i));
            level.setForeground(Color.white);
            level.setBackground(Color.black);
            level.setBorderPainted(false);
            level.setFocusPainted(false);
            level.setFont(f1);
            
            level.setCursor(new Cursor(Cursor.HAND_CURSOR));
            level.addActionListener((ActionListener) this);
            level.setAlignmentX(Component.CENTER_ALIGNMENT);

            level.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    level.setForeground(Color.YELLOW);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {

                    level.setForeground(Color.white);
                }
            });
            

                //level.setPreferredSize(new Dimension(level.getImage().getWidth(), level.getImage().getHeight()*3));
            niveaux.add(level);


            j.add((niveaux), BorderLayout.CENTER);
            
        }

        j.add(titre, BorderLayout.NORTH);
        j.add(new Btn_RetourMenu(f), BorderLayout.SOUTH);
        
        f.revalidate();
        f.repaint();
        f.setVisible(false);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent plevel) {
        try {
            JButton tp = (JButton) plevel.getSource();

            switch (tp.getText()) {
                case "1":
                    fenetre.executerPartie(1, Configuration.getInstance().recupererValeur("carte1"));
                    break;
                case "2":
                    fenetre.executerPartie(2, Configuration.getInstance().recupererValeur("carte2"));
                    break;
                case "3":
                    fenetre.executerPartie(3, Configuration.getInstance().recupererValeur("carte3"));
                    break;
                case "4":
                    fenetre.executerPartie(4, Configuration.getInstance().recupererValeur("carte4"));
                    break;
                case "5":
                    fenetre.executerPartie(5, Configuration.getInstance().recupererValeur("carte5"));
                    break;
            }
        } catch (SlickException ex) {
            Logger.getLogger(SelectionnerNiveau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
