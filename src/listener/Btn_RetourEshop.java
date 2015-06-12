package listener;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import pacmiage2.vue.menu.FenetrePrincipale;


/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Btn_RetourEshop extends AbstractAction {

    private FenetrePrincipale fenetre;

    public Btn_RetourEshop(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            fenetre.initFenetreShop();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Btn_RetourEshop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
