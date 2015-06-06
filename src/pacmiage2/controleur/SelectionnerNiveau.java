/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.controleur;

import pacmiage2.modele.JoueurInfo;
import pacmiage2.modele.Fenetre;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import pacmiage2.utiles.Session;

/**
 *
 * @author Axel
 */
public class SelectionnerNiveau implements ActionListener {
    
    private JoueurInfo joueur;
    private Properties properties;
    private Fenetre fenetre;

    public SelectionnerNiveau(Properties properties, JoueurInfo joueur, Fenetre f) {
        this.joueur = joueur;
        this.properties = properties;
        this.fenetre = f;
        
        JPanel j = new JPanel();
        JPanel niveaux = new JPanel();
        JLabel titre = new JLabel(Session.getInstance().recupererValeur("niveaux"), JLabel.CENTER);
        BorderLayout disposition = new BorderLayout();
        j.setLayout(disposition);

        f.setVisible(true);
        f.setContentPane(j);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        j.setBackground(Color.black);
        niveaux.setBackground(Color.black);
        niveaux.setLayout(new BoxLayout(niveaux, BoxLayout.X_AXIS));
        Font f1 = new Font("Kristen ITC", Font.PLAIN, 50);

        titre.setFont(f1);
        titre.setForeground(Color.white);

        for (int i = 1; i <= 5; i++) {

            final JButton level = new JButton();

            level.setText(String.valueOf(i));
            level.setForeground(Color.white);
            level.setBackground(Color.black);
            level.setBorderPainted(false);
            level.setFocusPainted(false);
            level.setFont(f1);
            level.setCursor(new Cursor(Cursor.HAND_CURSOR));
            level.addActionListener((ActionListener) this);

            level.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    level.setBackground(Color.YELLOW);
                    level.setForeground(Color.black);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    level.setBackground(Color.BLACK);
                    level.setForeground(Color.white);
                }
            });
            niveaux.add(level);

            j.add((niveaux), BorderLayout.CENTER);
        }

        j.add((titre), BorderLayout.NORTH);

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
                    executerPartie(1, properties.getProperty("carte1"));
                    break;
                case "2":
                    executerPartie(2, properties.getProperty("carte2"));
                    break;
                case "3":
                    executerPartie(3, properties.getProperty("carte3"));
                    break;
                case "4":
                    executerPartie(4, properties.getProperty("carte4"));
                    break;
                case "5":
                    executerPartie(5, properties.getProperty("carte5"));
                    break;
            }
        } catch (SlickException ex) {
            Logger.getLogger(SelectionnerNiveau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void executerPartie(int niveau, String cheminCarte) throws SlickException {
        fenetre.dispose();
        AppGameContainer game = new AppGameContainer(new PartieController(niveau, this.joueur, cheminCarte), 1024, 768, false);
        //game.setShowFPS(false);
        game.setTargetFrameRate(30);
        game.setMusicOn(true);
        game.setMusicVolume(0.5f);
        game.start();
        

    }

}
