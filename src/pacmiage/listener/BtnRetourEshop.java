package pacmiage.listener;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import pacmiage.vue.menu.FenetrePrincipale;


/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de gérer le retour à la page de l'eshop
 */
public class BtnRetourEshop extends AbstractAction {

    private final FenetrePrincipale fenetre;

    /**
     * Constructeur de la classe BtnRetourEshop
     * @param fenetre correspond à la fenêtre principale
     */
    public BtnRetourEshop(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }

    /**
     * Méthode permettant d'afficher le store lorsque l'utilisateur clique sur le bouton d'action
     * @param ae est un event indiquant qu'une action a lieue
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        fenetre.initFenetreShop();
    }

}
