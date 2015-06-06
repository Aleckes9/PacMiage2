package pacmiage2.modele;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JPanel;
import javax.swing.JFrame;
import pacmiage2.vue.AfficherMenu;
import pacmiage2.vue.Eshop_AfficheEshop;
import pacmiage2.controleur.SelectionnerNiveau;
import pacmiage2.utiles.Session;

/**
 *
 * @author Axel Nini
 */
public class Fenetre extends JFrame {

    private JPanel jpanel;
    private Properties properties;
    private JoueurInfo joueur;
    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int hauteur = (int) tailleEcran.getHeight();
    static int largeur = (int) tailleEcran.getWidth();

    public Fenetre(Properties properties, JoueurInfo joueur) {
        jpanel = new JPanel();
        this.joueur = joueur;
        this.properties = properties;
    }

    public void initFenetre() {
        Session.getInstance();
        this.setSize(2000, 1100);
        this.setTitle("pacmiage");
        this.setVisible(true);
        this.setContentPane(jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initFenetreMenu() throws IOException, FileNotFoundException, ClassNotFoundException {
        new AfficherMenu(joueur, this);
    }

    public void initFenetreNiveau() throws IOException, FileNotFoundException, ClassNotFoundException {
        new SelectionnerNiveau(properties, joueur, this);
    }

    public void initFenetreShop() throws IOException, FileNotFoundException, ClassNotFoundException {
        new Eshop_AfficheEshop(joueur, this);
    }

    public JPanel getJpanel() {
        return jpanel;
    }
    
    

}
