package pacmiage.listener;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import pacmiage.vue.menu.FenetrePrincipale;


/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class BtnRetourEshop extends AbstractAction {

    private final FenetrePrincipale fenetre;

    /**
     *
     * @param fenetre
     */
    public BtnRetourEshop(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        fenetre.initFenetreShop();
    }

}
