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
 */
public class FenetrePrincipale extends JFrame {

    private JPanel jpanel;
    private static final Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    private PartieController partieController;

    /**
     *
     */
    public FenetrePrincipale() {

    }

    /**
     *
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
     *
     * @throws IOException
     */
    public void initFenetreMenu() throws IOException {
        FenetreMenu fenetreMenu = new FenetreMenu(this);
    }

    /**
     *
     * @throws IOException
     */
    public void initFenetreNiveau() throws IOException{
        SelectionnerNiveau selectionnerNiveau = new SelectionnerNiveau(this);
    }

    /**
     *
     */
    public void initFenetreShop() {
        try {
            EshopAfficheEshop eshopAfficheEshop = new EshopAfficheEshop(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param niveau
     * @param cheminCarte
     * @throws SlickException
     */
    public void executerPartie(int niveau, String cheminCarte) throws SlickException {

        partieController = new PartieController(niveau, cheminCarte);

    }

    /**
     *
     * @return
     */
    public JPanel getJpanel() {
        return jpanel;
    }

    /**
     *
     * @param jpanel
     */
    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    /**
     *
     * @return
     */
    public PartieController getPartieController() {
        return partieController;
    }

    /**
     *
     * @param partieController
     */
    public void setPartieController(PartieController partieController) {
        this.partieController = partieController;
    }

    /**
     *
     * @return
     */
    public static Dimension getTailleEcran() {
        return tailleEcran;
    }

}
