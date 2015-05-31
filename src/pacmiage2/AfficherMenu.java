/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Axel Nini
 */
public class AfficherMenu implements ActionListener {

    Fenetre f = new Fenetre();

    public AfficherMenu() throws IOException {
        JPanel j = new JPanel();
        JPanel boutons = new JPanel();
        JButton nouvellepartie = new JButton();
        JButton store = new JButton();
        JButton scores = new JButton();
        JLabel logo = new JLabel(new ImageIcon(".\\src\\ressources\\image\\logo\\logo.png"));
        JButton changerLangue = new JButton(new ImageIcon("./src/ressources/image/drapeau/enfr.png"));

        f.setVisible(true);
        f.setContentPane(j);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBackground(Color.black);
        boutons.setBackground(Color.black);
        boutons.setLayout(new BoxLayout(boutons, BoxLayout.PAGE_AXIS));


        changerLangue.setBackground(Color.black);
        changerLangue.setBorderPainted(false);
        changerLangue.setFocusPainted(false);
        changerLangue.setCursor(new Cursor(Cursor.HAND_CURSOR));
        changerLangue.setDisabledIcon(changerLangue.getIcon());
        changerLangue.addActionListener((ActionListener) this);
        changerLangue.setName("langue");

        nouvellepartie.setText(Session.getInstance().recupererValeur("nouvelle"));
        
        nouvellepartie.setName("nouvelle");
        configButton(nouvellepartie);

        store.setText(Session.getInstance().recupererValeur("store"));
        store.setName("store");
        configButton(store);

        scores.setText(Session.getInstance().recupererValeur("score"));
        scores.setName("scores");
        configButton(scores);

        j.setLayout(new GridLayout(3, 0));
        j.add(logo);
        j.add(boutons);

        boutons.add(nouvellepartie);
        boutons.add(store);
        boutons.add(scores);

        j.add(changerLangue);

        f.revalidate();
        f.repaint();

    }

    public void configButton(final JButton button) {
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setFont(new Font("Kristen ITC", Font.PLAIN, 44));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener((ActionListener) this);

        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.YELLOW);
                button.setForeground(Color.black);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.BLACK);
                button.setForeground(Color.white);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            JButton tp = (JButton) ae.getSource();
            Session.getInstance();
            //todo refresh
            switch (tp.getName()) {
                case "nouvelle":
                    f.dispose();
                    new SelectionnerNiveau();
                    break;
                case "store":
                    //f.dispose();
                    JoueurInfo joueur=new JoueurInfo();
                    new Eshop_AfficheEshop(joueur);
                    break;
                case "score":
                    System.out.println("Les scores !!!! Whaou !!!!");
                    break;
                case "langue":
                    
                    if (Session.getInstance().getLocale().equals(Locale.FRENCH)) {
                        Session.getInstance().setLocale(Locale.ENGLISH);
                    }
                    else {
                        Session.getInstance().setLocale(Locale.FRENCH);
                    }
                    f.dispose();
                    new AfficherMenu();
                    break;
                    
            }
        } catch (IOException ex) {
            Logger.getLogger(AfficherMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
