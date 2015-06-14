package pacmiage.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.utiles.Session;
import pacmiage.vue.menu.FenetreMenu;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant d'associer les boutons du menu aux fenêtre à afficher correspondantes
 */
public class FenetreMenuListener implements ActionListener {

    FenetrePrincipale fenetre;

    /**
     * Constructeur de la classe FenetreMenuListener
     * @param fenetre est la fenêtre principale
     */
    public FenetreMenuListener(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }

    /**
     * Méthode permettant de lancer la fenêtre correspondant au bouton cliqué par l'utilisateur sur le menu
     * @param ae est un event indiquant qu'une action a lieue
     */
    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            JButton tp = (JButton) ae.getSource();
            Session.getInstance();
            switch (tp.getName()) {
                case "nouvelle":
                    fenetre.initFenetreNiveau();
                    break;
                case "store":
                    fenetre.initFenetreShop();
                    break;
                case "quitter":
                    System.exit(0);
                    break;
                case "langue":
                    caseLangue();
                    break;
                default:
                    break;

            }
        } catch (IOException ex) {
            Logger.getLogger(FenetreMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Méthode permettant de changer la Locale lors du clic sur le bouton de changement de langue
     * @throws IOException 
     */
    public void caseLangue() throws IOException {
        if (Session.getInstance().getLocale().equals(Locale.FRENCH)) {
            Session.getInstance().setLocale(Locale.ENGLISH);
        } else {
            Session.getInstance().setLocale(Locale.FRENCH);
        }
        fenetre.initFenetreMenu();
    }
}
