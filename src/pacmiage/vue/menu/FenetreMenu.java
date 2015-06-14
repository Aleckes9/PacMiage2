package pacmiage.vue.menu;

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
import pacmiage.listener.FenetreMenuListener;
import pacmiage.modele.JoueurInfo;
import pacmiage.utiles.Session;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Méthode permettant d'afficher la fenêtre de menu
 */
public final class FenetreMenu {

    private final FenetrePrincipale fenetre;

    private final JPanel jPanel = new JPanel();
    private final JPanel boutons = new JPanel();

    private final JLabel logo = new JLabel(new ImageIcon("./src/ressources/image/logo/logo.png"));
    private final JLabel record = new JLabel("Record : " + JoueurInfo.getInstance().getRecord());

    private final JButton nouvellepartie = new JButton();
    private final JButton store = new JButton();
    private final JButton quitter = new JButton();
    private final JButton changerLangue = new JButton(new ImageIcon("./src/ressources/image/drapeau/enfr.png"));

    /**
     * Constructeur de la classe FenetreMenu
     * @param uneFenetre principale
     * @throws IOException
     */
    public FenetreMenu(FenetrePrincipale uneFenetre) throws IOException {
        this.fenetre = uneFenetre;
        this.init();
    }

    /**
     * Méthode permettant l'initialisation des boutons, du logo et du fond
     */
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
        boutons.setBounds(0, insets.top + (int) (logo.getHeight() * 1.2), fenetre.getWidth(), (fenetre.getHeight() / 3) + 100);
        changerLangue.setBounds(fenetre.getWidth() / 2 - changerLangue.getIcon().getIconWidth() / 2, boutons.getY() + (int) (boutons.getHeight() * 1.2), changerLangue.getIcon().getIconWidth(), changerLangue.getIcon().getIconHeight());

        fenetre.revalidate();
        fenetre.repaint();
    }

    /**
     * Initialisation de la fenêtre
     */
    public void initFenetre() {
        fenetre.setVisible(true);
        fenetre.setContentPane(jPanel);
    }

    /**
     * Initialisation du record
     */
    public void initRecord() {
        record.setBackground(Color.black);
        record.setFont(new Font("Kristen ITC", Font.PLAIN, 44));
        record.setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    /**
     * Initialisation du bouton de changement de langue
     */
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

    /**
     * Initialisation des boutons d'option
     */
    public void initButtonOptions() {
        nouvellepartie.setText(Session.getInstance().recupererValeur("nouvelle"));
        nouvellepartie.setName("nouvelle");
        initConfigButtonMenu(nouvellepartie);

        store.setText(Session.getInstance().recupererValeur("store"));
        store.setName("store");
        initConfigButtonMenu(store);

        quitter.setText(Session.getInstance().recupererValeur("quitter"));
        quitter.setName("quitter");

        nouvellepartie.setAlignmentX(Component.CENTER_ALIGNMENT);
        store.setAlignmentX(Component.CENTER_ALIGNMENT);
        quitter.setAlignmentX(Component.CENTER_ALIGNMENT);

        initConfigButtonMenu(quitter);
    }

    /**
     * Initialisation de la configuration des boutons du menu
     * @param buttonMenu les boutons du menu
     */
    public void initConfigButtonMenu(final JButton buttonMenu) {
        buttonMenu.setForeground(Color.white);
        buttonMenu.setBackground(Color.black);
        buttonMenu.setBorderPainted(false);
        buttonMenu.setFocusPainted(false);
        buttonMenu.setFont(new Font("Kristen ITC", Font.PLAIN, 44));
        buttonMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonMenu.addActionListener(new FenetreMenuListener(fenetre));

        buttonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMenu.setBackground(Color.YELLOW);
                buttonMenu.setForeground(Color.black);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMenu.setBackground(Color.BLACK);
                buttonMenu.setForeground(Color.white);
            }
        });
    }

}
