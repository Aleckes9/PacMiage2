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
import pacmiage2.utiles.Session;


/**
 *
 * @author Maëlle
 */
public final class Partie_AffichageMenuPartie implements ActionListener {

    private final JFrame fenetre = new JFrame();
    private final PartieController partie;
    private final JPanel j = new JPanel();
    private final JPanel boutons = new JPanel();
    private final JButton son = new JButton();
    private final JButton quitter = new JButton();
    private final JButton reprendre = new JButton();

    public Partie_AffichageMenuPartie(PartieController partie) throws IOException {
        partie.getContainer().pause();
        this.partie = partie;
        initFenetre();
        initButton();
        fenetre.revalidate();
        fenetre.repaint();

    }
    
     public void initFenetre() {
        fenetre.setLocationRelativeTo(null);
        fenetre.setUndecorated(true);
        fenetre.setBounds(0, 0,partie.getGame().getScreenWidth() , partie.getGame().getScreenHeight());
        fenetre.setVisible(true);
        fenetre.setContentPane(j);
        fenetre.setAlwaysOnTop(true);
        fenetre.toFront();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     
     public void initButton() {
        j.setBackground(java.awt.Color.black);
        boutons.setBackground(java.awt.Color.black);

        son.setText(Session.getInstance().recupererValeur("son"));
        son.setName("son");
        configButton(son);

        quitter.setText(Session.getInstance().recupererValeur("retour"));
        quitter.setName("quitter");
        configButton(quitter);

        reprendre.setText(Session.getInstance().recupererValeur("continuer"));
        reprendre.setName("reprendre");
        configButton(reprendre);

        boutons.setLayout(new GridLayout(4, 0));
        j.add(boutons);

        boutons.add(son);
        boutons.add(quitter);
        boutons.add(reprendre);
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
            case "quitter":
                partie.getContainer().exit();
                this.fenetre.dispose();
                
                break;
                
                case "retour":
                partie.getContainer().exit();
                
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
