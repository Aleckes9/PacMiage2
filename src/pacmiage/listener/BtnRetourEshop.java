package pacmiage.listener;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import pacmiage.vue.menu.FenetrePrincipale;


/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class BtnRetourEshop extends AbstractAction {

    private FenetrePrincipale fenetre;

    /**
     *
     * @param fenetre
     */
    public BtnRetourEshop(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            fenetre.initFenetreShop();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RetourMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BtnRetourEshop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
