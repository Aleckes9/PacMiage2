package pacmiage2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static pacmiage2.Eshop_AfficheEshop.hauteur;
import static pacmiage2.Eshop_AfficheEshop.largeur;

/**
 *
 * @author Maëlle
 */
public class AfficheMenuPartie implements ActionListener{

    JFrame f = new JFrame();
PartieController partie;
    public AfficheMenuPartie(PartieController partie) throws IOException  {
       this.partie=partie;
        JPanel j = new JPanel();
        JPanel boutons = new JPanel();
        JButton son = new JButton();
        JButton choixObjet = new JButton();
        JButton quitter = new JButton();
          JButton reprendre = new JButton();
                 f.setLocationRelativeTo(null);
                   f.setUndecorated(true);
       f.setBounds(largeur / 3, hauteur / 4, 4 * largeur / 11, hauteur / 2);
        f.setVisible(true);
        f.setContentPane(j);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBackground(java.awt.Color.black);
        boutons.setBackground(java.awt.Color.black);
     
        son.setText("Son on/off");
        son.setName("son");

        configButton(son);
 
        choixObjet.setText("Choisir un objet");
         choixObjet.setName("choixObjet");
        configButton(choixObjet);
        quitter.setText("Retour menu");
        
           quitter.setName("quitter");
           
        configButton(quitter);
        
        reprendre.setText("Continuer la partie");
         reprendre.setName("reprendre");
        configButton(reprendre);
        
        boutons.setLayout(new GridLayout(4, 0));
        j.add(boutons);

        boutons.add(son);
        boutons.add(choixObjet);
        boutons.add(quitter);
         boutons.add(reprendre);
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
        JButton tp = (JButton) ae.getSource();
        Session.getInstance();
        switch (tp.getName()) {
            case "son":
               new ActionSon(partie.getBackground());
                break;
            case "choixObjet":
                new ActionChoixObjet(partie);
                break;
            case "quitter":
               new RetourMenu(partie.getJoueur(),f);
                break;
            case "reprendre":
                new FermerLaFenetre(f);
                
                break;
                
        }
    }    }





        
        


 

