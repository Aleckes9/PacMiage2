/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Axel
 */
public class SelectionnerNiveau implements ActionListener{
    
    public SelectionnerNiveau() {
        
        Fenetre f = new Fenetre();
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
            level.addActionListener((ActionListener)this);

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
        JButton tp = (JButton)plevel.getSource();
        
        switch(tp.getText())
        {
            case "1": System.out.println("On va au niveau 1");
            break;
            case "2": System.out.println("On va au niveau 2");
            break;
            case "3": System.out.println("On va au niveau 3");
            break;
            case "4": System.out.println("On va au niveau 4");
            break;
            case "5": System.out.println("On va au niveau 5");
            break;
        }
    }
}
