/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.listener;

import pacmiage2.modele.JoueurInfo;
import pacmiage2.vue.eshop.Eshop_AfficheObjet;
import pacmiage2.vue.menu.FenetrePrincipale;
import pacmiage2.modele.Objet;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 * Classe 
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Action_Btn_Objet extends AbstractAction {

    private final Objet it;
    private final FenetrePrincipale eshopFenetre;

    public Action_Btn_Objet(Objet it, FenetrePrincipale eshopFenetre) {
        this.it = it;
        this.eshopFenetre = eshopFenetre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

            JDialog f = new JDialog();
            f.setBounds(FenetrePrincipale.getTailleEcran().width / 4, FenetrePrincipale.getTailleEcran().height / 4, 4 * FenetrePrincipale.getTailleEcran().width / 8, FenetrePrincipale.getTailleEcran().height / 2);
            f.setBackground(Color.black);
            JPanel panel = new JPanel();
            if(it!=null){
                Eshop_AfficheObjet eshop_AfficheObjet = new Eshop_AfficheObjet(panel, it, false, eshopFenetre);
            }
            Component add = f.add(panel);
            f.setVisible(true);
        
    }

}
