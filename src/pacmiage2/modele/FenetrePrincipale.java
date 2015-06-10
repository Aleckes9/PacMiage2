package pacmiage2.modele;

import java.awt.Color;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JFrame;
import org.newdawn.slick.SlickException;
import pacmiage2.controleur.partie.PartieController;
import pacmiage2.vue.menu.FenetreMenu;
import pacmiage2.vue.eshop.Eshop_AfficheEshop;
import pacmiage2.controleur.SelectionnerNiveau;
import pacmiage2.utiles.Session;

/**
 *
 * @author Axel Nini
 */
public class FenetrePrincipale extends JFrame {

    private JPanel jpanel;
    private final JoueurInfo joueur;
    private static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    private PartieController partieController;

    public FenetrePrincipale(JoueurInfo joueur) {
        this.joueur = joueur;

    }

    public void initFenetre() {
        Session.getInstance();
        this.setTitle("pacmiage");
        jpanel = new JPanel();
        this.setContentPane(jpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setBounds(0, 0, (int)tailleEcran.getWidth(), (int)tailleEcran.getHeight());
            this.setUndecorated(true);
        
        jpanel.setPreferredSize(new Dimension((int)tailleEcran.getWidth(), (int)tailleEcran.getHeight()));
        jpanel.setBackground(Color.black);
        this.setVisible(true);
    }

    public void initFenetreMenu() throws IOException, FileNotFoundException, ClassNotFoundException {
        new FenetreMenu(this);
    }

    public void initFenetreNiveau() throws IOException, FileNotFoundException, ClassNotFoundException {
        new SelectionnerNiveau(this);
    }

    public void initFenetreShop() throws IOException, FileNotFoundException, ClassNotFoundException {
        new Eshop_AfficheEshop(this);
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



    public PartieController getPartieController() {
        return partieController;
    }

    public void setPartieController(PartieController partieController) {
        this.partieController = partieController;
    }

    public static Dimension getTailleEcran() {
        return tailleEcran;
    }
    
    


    
    
    
    
    
    
    
    
    

}
