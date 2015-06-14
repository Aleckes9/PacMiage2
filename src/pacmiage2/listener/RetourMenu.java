package pacmiage2.listener;

import pacmiage2.modele.JoueurInfo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import pacmiage2.vue.menu.FenetrePrincipale;
import pacmiage2.utiles.Configuration;
import pacmiage2.utiles.SauvegardeFichier;

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
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
