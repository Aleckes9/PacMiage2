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
 * 
 * Classe permettant de gérer le retour au Menu Principal
 */
public class RetourMenu extends AbstractAction {

    private FenetrePrincipale f;

    /**
     * Constructeur de la classe RetourMenu
     * @param f est la fenêtre principale
     */
    public RetourMenu(FenetrePrincipale f) {
        this.f = f;
    }

    /**
     * Méthode permettant de renvoyer au menu principal lorsque l'utilisateur clique 
     * @param ae est un event indiquant qu'une action a lieue
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            SauvegardeFichier.getInstance().enregistrerFichier(JoueurInfo.getInstance(), Configuration.getInstance().recupererValeur("pathSauvegarde"));
            f.initFenetreMenu();
        } catch (IOException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
