package pacmiage2.vue.menu;

import java.awt.BorderLayout;
import pacmiage2.modele.FenetrePrincipale;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage2.controleur.FenetreMenuListener;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.utiles.Session;

/**
 *
 * @author Axel Nini
 */
public final class FenetreMenu {

    private final FenetrePrincipale fenetre;

    private final JPanel jPanel = new JPanel();
    private final JPanel boutons = new JPanel();

    private final JLabel logo = new JLabel(new ImageIcon(".\\src\\ressources\\image\\logo\\logo.png"));
    private final JLabel record = new JLabel("Record : " + String.valueOf(JoueurInfo.getInstance().getRecord()));

    private final JButton nouvellepartie = new JButton();
    private final JButton store = new JButton();
    private final JButton quitter = new JButton();
    private final JButton changerLangue = new JButton(new ImageIcon("./src/ressources/image/drapeau/enfr.png"));

    public FenetreMenu(FenetrePrincipale uneFenetre) throws IOException {
        this.fenetre = uneFenetre;
        this.init();
    }

    public void init() {
        jPanel.setLayout(null);
        this.initFenetre();
        Insets insets = jPanel.getInsets();
        jPanel.setBackground(Color.black);
        boutons.setBackground(Color.black);
        boutons.setLayout(new BoxLayout(boutons, BoxLayout.PAGE_AXIS));

        initButtonLangue();
        initButtonOptions();
        initRecord();

        boutons.add(nouvellepartie);
        boutons.add(store);
        boutons.add(quitter);
        boutons.add(record);

        jPanel.add(logo);
        jPanel.add(boutons);

        jPanel.add(changerLangue);
        logo.setBounds(0, insets.top, fenetre.getWidth(), fenetre.getHeight() / 4);
        boutons.setBounds(0, insets.top + (int) (logo.getHeight() * 1.2), fenetre.getWidth(), (fenetre.getHeight()/3)+100);
        changerLangue.setBounds(fenetre.getWidth() / 2 - changerLangue.getIcon().getIconWidth() / 2, boutons.getY() + (int) (boutons.getHeight() * 1.2), changerLangue.getIcon().getIconWidth(), changerLangue.getIcon().getIconHeight());

        fenetre.revalidate();
        fenetre.repaint();
    }

    public void initFenetre() {
        fenetre.setVisible(true);
        fenetre.setContentPane(jPanel);
    }

    public void initRecord() {
        record.setBackground(Color.black);
        record.setFont(new Font("Kristen ITC", Font.PLAIN, 44));
        record.setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    public void initButtonLangue() {
        changerLangue.setBackground(Color.black);
        changerLangue.setBorderPainted(false);
        changerLangue.setFocusPainted(false);
        changerLangue.setCursor(new Cursor(Cursor.HAND_CURSOR));
        changerLangue.setDisabledIcon(changerLangue.getIcon());
        changerLangue.addActionListener(new FenetreMenuListener(fenetre));
        changerLangue.setName("langue");
        changerLangue.setPreferredSize(new Dimension(fenetre.getWidth(), fenetre.getHeight() / 8));
        changerLangue.setSize(fenetre.getWidth(), fenetre.getHeight() / 8);
    }

    public void initButtonOptions() {
        nouvellepartie.setText(Session.getInstance().recupererValeur("nouvelle"));
        nouvellepartie.setName("nouvelle");
        initConfigButton(nouvellepartie);

        store.setText(Session.getInstance().recupererValeur("store"));
        store.setName("store");
        initConfigButton(store);

        quitter.setText(Session.getInstance().recupererValeur("quitter"));
        quitter.setName("quitter");

        nouvellepartie.setAlignmentX(Component.CENTER_ALIGNMENT);
        store.setAlignmentX(Component.CENTER_ALIGNMENT);
        quitter.setAlignmentX(Component.CENTER_ALIGNMENT);

        initConfigButton(quitter);
    }

    public void initConfigButton(final JButton button) {
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setFont(new Font("Kristen ITC", Font.PLAIN, 44));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(new FenetreMenuListener(fenetre));

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

}
