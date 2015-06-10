package pacmiage2.controleur;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.utiles.Configuration;
import pacmiage2.utiles.SauvegardeFichier;

/**
 *
 * @author Aleckes9
 */
public class Btn_RetourEshop extends AbstractAction {

    private FenetrePrincipale f;

    public Btn_RetourEshop(FenetrePrincipale f) {
        this.f = f;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            f.dispose();
            f.initFenetreShop();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Btn_RetourEshop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Btn_RetourEshop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
