package pacmiage2.controleur;

import pacmiage2.modele.JoueurInfo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.utiles.Configuration;
import pacmiage2.utiles.SauvegardeFichier;

/**
 *
 * @author Maëlle
 */
public class RetourMenu extends AbstractAction {

    private JoueurInfo j;
    private FenetrePrincipale f;

    public RetourMenu(JoueurInfo j, FenetrePrincipale f) {
        this.j = j;
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));
            f.initFenetre();
            f.initFenetreMenu();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
