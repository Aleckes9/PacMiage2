package pacmiage.listener;

import pacmiage.modele.JoueurInfo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.utiles.Configuration;
import pacmiage.utiles.SauvegardeFichier;

/**
 *
 * @author @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class RetourMenu extends AbstractAction {

    private FenetrePrincipale f;

    public RetourMenu(FenetrePrincipale f) {
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));
            //f.initFenetre();
            f.initFenetreMenu();
        } catch (IOException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
