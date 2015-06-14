
package pacmiage.vue.bouton;

import pacmiage.listener.Eshop_Action_Achat;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import pacmiage.utiles.Session;

/**
 * Bouton pour confirmer l'achat d'un objet
 *
 * @author Maëlle
 */
public class Eshop_BtnConfirmAchat extends JButton {

    public Eshop_BtnConfirmAchat(Objet it,FenetrePrincipale eshopFenetre) {
        this.setAction(new Eshop_Action_Achat(it,eshopFenetre));
        this.setText(Session.getInstance().recupererValeur("oui"));
        this.setFont(new Font(null, 30, 30 ));
        this.setBorderPainted(false);
        this.setForeground(Color.white);
        this.setBackground(Color.black);
    }

}
