
package pacmiage.vue.bouton;

import pacmiage.listener.EshopActionAchat;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import pacmiage.utiles.Session;

/**
 * Bouton pour confirmer l'achat d'un objet
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class EshopBtnConfirmAchat extends JButton {

    /**
     *
     * @param it
     * @param eshopFenetre
     */
    public EshopBtnConfirmAchat(Objet it,FenetrePrincipale eshopFenetre) {
        this.setAction(new EshopActionAchat(it,eshopFenetre));
        this.setText(Session.getInstance().recupererValeur("oui"));
        this.setFont(new Font(null, 30, 30 ));
        this.setBorderPainted(false);
        this.setForeground(Color.white);
        this.setBackground(Color.black);
    }

}
