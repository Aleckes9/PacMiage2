package pacmiage2.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.newdawn.slick.SlickException;
import pacmiage2.utiles.Configuration;
import pacmiage2.vue.menu.FenetrePrincipale;

/**
 *
 * @author Aleckes9
 */
public class SelectionNiveauListener implements ActionListener {

    private final FenetrePrincipale fenetre;
    
    public SelectionNiveauListener(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        try {
            JButton tp = (JButton) e.getSource();

            switch (tp.getText()) {
                case "1":
                    fenetre.executerPartie(1, Configuration.getInstance().recupererValeur("carte1"));
                    break;
                case "2":
                    fenetre.executerPartie(2, Configuration.getInstance().recupererValeur("carte2"));
                    break;
                case "3":
                    fenetre.executerPartie(3, Configuration.getInstance().recupererValeur("carte3"));
                    break;
                case "4":
                    fenetre.executerPartie(4, Configuration.getInstance().recupererValeur("carte4"));
                    break;
                case "5":
                    fenetre.executerPartie(5, Configuration.getInstance().recupererValeur("carte5"));
                    break;
            }
        } catch (SlickException ex) {
            Logger.getLogger(SelectionNiveauListener.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
