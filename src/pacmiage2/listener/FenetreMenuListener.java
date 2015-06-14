package pacmiage2.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import pacmiage2.vue.menu.FenetrePrincipale;
import pacmiage2.utiles.Session;
import pacmiage2.vue.menu.FenetreMenu;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class FenetreMenuListener implements ActionListener{

    FenetrePrincipale fenetre;
    

    public FenetreMenuListener(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            JButton tp = (JButton) ae.getSource();
            Session.getInstance();
            //todo refresh
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

                    if (Session.getInstance().getLocale().equals(Locale.FRENCH)) {
                        Session.getInstance().setLocale(Locale.ENGLISH);
                    } else {
                        Session.getInstance().setLocale(Locale.FRENCH);
                    }
                    fenetre.initFenetreMenu();
                    break;

            }
        } catch (IOException ex) {
            Logger.getLogger(FenetreMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FenetreMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FenetreMenuListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FenetreMenuListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
