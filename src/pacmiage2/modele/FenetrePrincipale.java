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
import pacmiage2.controleur.partie.PartieController;
import pacmiage2.vue.AfficherMenu;
import pacmiage2.vue.eshop.Eshop_AfficheEshop;
import pacmiage2.controleur.SelectionnerNiveau;
import pacmiage2.utiles.SauvegardeFichier;
import pacmiage2.utiles.Session;

/**
 *
 * @author Axel Nini
 */
public class FenetrePrincipale extends JFrame {

    private JPanel jpanel;
    private JoueurInfo joueur;
    static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    static int hauteur = (int) tailleEcran.getHeight();
    static int largeur = (int) tailleEcran.getWidth();
    PartieController partieController;

    public FenetrePrincipale(JoueurInfo joueur) {
        this.joueur = joueur;

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
        new SelectionnerNiveau(joueur, this);
    }

    public void initFenetreShop() throws IOException, FileNotFoundException, ClassNotFoundException {
        new Eshop_AfficheEshop(joueur, this);
    }
    
    
    

    
        public void executerPartie(int niveau, String cheminCarte) throws SlickException {
        
        partieController = new PartieController(niveau, this.joueur, cheminCarte);

    }
    

    public JPanel getJpanel() {
        return jpanel;
    }

    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }



    public JoueurInfo getJoueur() {
        return joueur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }


    public PartieController getPartieController() {
        return partieController;
    }

    public void setPartieController(PartieController partieController) {
        this.partieController = partieController;
    }


    
    
    
    
    
    
    
    
    

}
