package pacmiage.vue.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage.listener.SelectionNiveauListener;
import pacmiage.utiles.Session;
import pacmiage.utiles.Configuration;
import pacmiage.vue.bouton.Btn_RetourMenu;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public final class SelectionnerNiveau {

    private final FenetrePrincipale fenetre;
    private final JPanel jpanel = new JPanel();
    private final JPanel niveaux = new JPanel();

    public SelectionnerNiveau(FenetrePrincipale fenetre1) throws IOException {
        this.fenetre = fenetre1;
        initFenetre();
        initBoutons();
        fenetre.revalidate();
        fenetre.repaint();
        fenetre.setVisible(false);
        fenetre.setVisible(true);
    }

    public void initFenetre() {

        JLabel titre = new JLabel(Session.getInstance().recupererValeur("niveaux"), JLabel.CENTER);
        titre.setPreferredSize(new Dimension(fenetre.getWidth(), fenetre.getHeight() / 5));
        BorderLayout disposition = new BorderLayout();
        jpanel.setLayout(disposition);

        fenetre.setContentPane(jpanel);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jpanel.setBackground(Color.black);
        niveaux.setBackground(Color.black);
        niveaux.setLayout(new BoxLayout(niveaux, BoxLayout.LINE_AXIS));
        Font f1 = new Font("Kristen ITC", Font.PLAIN, 50);

        titre.setFont(f1);
        titre.setForeground(Color.white);

        jpanel.add(titre, BorderLayout.NORTH);
        jpanel.add(new Btn_RetourMenu(fenetre), BorderLayout.SOUTH);
    }

    public void initBoutons() throws IOException {
        Font f1 = new Font("Kristen ITC", Font.PLAIN, 50);
        for (int i = 1; i <= 5; i++) {

            final CarteIcon carteLevel = new CarteIcon(Configuration.getInstance().recupererValeur("carteMini" + String.valueOf(i)));
            final JButton level = new JButton(carteLevel);
            level.setText(String.valueOf(i));
            level.setForeground(Color.white);
            level.setBackground(Color.black);
            level.setBorderPainted(false);
            level.setFocusPainted(false);
            level.setFont(f1);

            level.setCursor(new Cursor(Cursor.HAND_CURSOR));
            level.addActionListener(new SelectionNiveauListener(fenetre));
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

            jpanel.add((niveaux), BorderLayout.CENTER);

        }

    }

}
