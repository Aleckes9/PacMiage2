package pacmiage2.vue.partie;

import pacmiage2.controleur.partie.PartieController;
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
import pacmiage2.controleur.ActionChoixObjet;
import pacmiage2.utiles.Session;


/**
 *
 * @author Maëlle
 */
public class Partie_AfficheMenuPartie implements ActionListener {

    private JFrame fenetre = new JFrame();
    private PartieController partie;
    private JPanel j = new JPanel();
    private JPanel boutons = new JPanel();
    private JButton son = new JButton();
    private JButton choixObjet = new JButton();
    private JButton quitter = new JButton();
    private JButton reprendre = new JButton();

    public Partie_AfficheMenuPartie(PartieController partie) throws IOException {
        partie.getContainer().pause();
        this.partie = partie;

        fenetre.setLocationRelativeTo(null);
        fenetre.setUndecorated(true);
        fenetre.setBounds(partie.getContainer().getWidth() / 3, partie.getContainer().getHeight() / 4, 4 * partie.getContainer().getWidth() / 11, partie.getContainer().getHeight() / 2);
        fenetre.setVisible(true);
        fenetre.setContentPane(j);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        fenetre.revalidate();
        fenetre.repaint();

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
                if (partie.getBackground().getVolume() != 0) {
                    partie.getBackground().setVolume(0);
                } else {
                    partie.getBackground().setVolume(0.5f);
                }
                break;
            case "choixObjet":
                fenetre.dispose();
                new ActionChoixObjet(partie);

                break;
            case "quitter":
                //new RetourMenu(partie.getJoueur(), fenetre);
                break;
            case "reprendre":
                fenetre.dispose();

                break;

        }
    }

    public JFrame getFenetre() {
        return fenetre;
    }
    
    
    
}
