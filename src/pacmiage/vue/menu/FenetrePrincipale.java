package pacmiage.vue.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JFrame;
import org.newdawn.slick.SlickException;
import pacmiage.controleur.partie.PartieController;
import pacmiage.vue.eshop.EshopAfficheEshop;
import pacmiage.utiles.Session;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Méthode permettant d'afficher la fenêtre principale
 */
public class FenetrePrincipale extends JFrame {

    private JPanel jpanel;
    private static final Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    private PartieController partieController;

    /**
     * Constructeur de la classe FenetrePrincipale
     */
    public FenetrePrincipale() {

    }

    /**
     * Initialisation de la fenêtre
     */
    public void initFenetre() {
        Session.getInstance();
        this.setTitle("pacmiage");
        jpanel = new JPanel();
        this.setContentPane(jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setBounds(0, 0, (int) tailleEcran.getWidth(), (int) tailleEcran.getHeight());
        this.setUndecorated(true);

        jpanel.setPreferredSize(new Dimension((int) tailleEcran.getWidth(), (int) tailleEcran.getHeight()));
        jpanel.setBackground(Color.black);
        this.setVisible(true);
    }

    /**
     * Initialisation de la fenêtre de Menu
     * @throws IOException
     */
    public void initFenetreMenu() throws IOException {
        FenetreMenu fenetreMenu = new FenetreMenu(this);
    }

    /**
     * Initialisation de la fenêtre de niveaux
     * @throws IOException
     */
    public void initFenetreNiveau() throws IOException{
        SelectionnerNiveau selectionnerNiveau = new SelectionnerNiveau(this);
    }

    /**
     * Initialisation de la fenêtre de l'Eshop
     */
    public void initFenetreShop() {
        try {
            EshopAfficheEshop eshopAfficheEshop = new EshopAfficheEshop(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Execution de la partie
     * @param niveau le niveau sélectionné
     * @param cheminCarte le chemin du fichier contenant la carte
     * @throws SlickException
     */
    public void executerPartie(int niveau, String cheminCarte) throws SlickException {

        partieController = new PartieController(niveau, cheminCarte);

    }

    /**
     * Méthode renvoyant le panel
     * @return le panel
     */
    public JPanel getJpanel() {
        return jpanel;
    }

    /**
     * Méthode permettant de setter le panel
     * @param jpanel
     */
    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    /**
     * Méthode renvoyant le controlleur de la partie
     * @return le controlleur
     */
    public PartieController getPartieController() {
        return partieController;
    }

    /**
     * Méthode permettant de setter le controlleur de la partie
     * @param partieController
     */
    public void setPartieController(PartieController partieController) {
        this.partieController = partieController;
    }

    /**
     * Méthode renvoyant la taille de l'écran
     * @return la taille de l'écran
     */
    public static Dimension getTailleEcran() {
        return tailleEcran;
    }

}
