/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.listener;

import pacmiage.vue.eshop.EshopAfficheObjet;
import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 * 
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant d'écouter l'utilisation du bouton objet par l'utilisateur
 */
public class ActionBtnObjet extends AbstractAction {

    private final Objet it;
    private final FenetrePrincipale eshopFenetre;

    /**
     * Constructeur de la classe ActionBtnObjet
     * @param it
     * @param eshopFenetre
     */
    public ActionBtnObjet(Objet it, FenetrePrincipale eshopFenetre) {
        this.it = it;
        this.eshopFenetre = eshopFenetre;
    }

    /**
     * Méthode permettant de créer la fenêtre de l'eshop et reçoit en paramètre un ActionEvent
     * @param ae est un event indiquant qu'une action a lieue
     */
    @Override
    public void actionPerformed(ActionEvent ae) {

            JDialog f = new JDialog();
            f.setBounds(FenetrePrincipale.getTailleEcran().width / 4, FenetrePrincipale.getTailleEcran().height / 4, 4 * FenetrePrincipale.getTailleEcran().width / 8, FenetrePrincipale.getTailleEcran().height / 2);
            f.setBackground(Color.black);
            JPanel panel = new JPanel();
            if(it!=null){
                EshopAfficheObjet eshopAfficheObjet = new EshopAfficheObjet(panel, it, false, eshopFenetre);
            }
            f.add(panel);
            f.setVisible(true);
        
    }

}
