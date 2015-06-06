package pacmiage2.modele;

import java.awt.Color;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JPanel;
import javax.swing.JFrame;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import pacmiage2.controleur.PartieController;
import pacmiage2.vue.AfficherMenu;
import pacmiage2.vue.Eshop_AfficheEshop;
import pacmiage2.controleur.SelectionnerNiveau;
import pacmiage2.utiles.Sauvegarde;
import pacmiage2.utiles.Session;

/**
 *
 * @author Axel Nini
 */
public class Fenetre extends JFrame {

    private JPanel jpanel;
    private Properties properties;
    private JoueurInfo joueur;
    private Sauvegarde sauvegarde;
    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int hauteur = (int) tailleEcran.getHeight();
    static int largeur = (int) tailleEcran.getWidth();
    PartieController partieController;

    public Fenetre(Properties properties, JoueurInfo joueur, Sauvegarde sauvegarde) {
        this.sauvegarde = sauvegarde;
        this.joueur = joueur;
        this.properties = properties;
    }

    public void initFenetre() {
        Session.getInstance();
        this.setTitle("pacmiage");
        jpanel = new JPanel();
        this.setContentPane(jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setBounds(0, 0, largeur, hauteur);
        //this.setUndecorated(true);
        jpanel.setPreferredSize(new Dimension(largeur, hauteur));
        jpanel.setBackground(Color.black);
        this.setVisible(true);
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
    

    
        public void executerPartie(int niveau, String cheminCarte) throws SlickException {
        
        partieController = new PartieController(niveau, this.joueur, cheminCarte);
        //game.setShowFPS(false);
//        game.setTargetFrameRate(30);
//        game.setMusicOn(true);
//        game.setMusicVolume(0.5f);
//        game.start();


    }
    

    public JPanel getJpanel() {
        return jpanel;
    }

    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    public Properties getProperties() {
        return properties;
    }

    public JoueurInfo getJoueur() {
        return joueur;
    }

    public static int getHauteur() {
        return hauteur;
    }

    public static int getLargeur() {
        return largeur;
    }

    public Sauvegarde getSauvegarde() {
        return sauvegarde;
    }

    public void setSauvegarde(Sauvegarde sauvegarde) {
        this.sauvegarde = sauvegarde;
    }

    public PartieController getPartieController() {
        return partieController;
    }

    public void setPartieController(PartieController partieController) {
        this.partieController = partieController;
    }


    
    
    
    
    
    
    
    
    

}
