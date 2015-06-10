/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.controleur;

import pacmiage2.modele.JoueurInfo;
import pacmiage2.vue.eshop.Eshop_AfficheObjet;
import pacmiage2.modele.FenetrePrincipale;
import pacmiage2.modele.Objet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Maëlle
 */
public class Action_Btn_Objet  extends AbstractAction{
private boolean jeuEnCours;
private Objet it;
private JoueurInfo j;
private FenetrePrincipale eshopFenetre;

    public Action_Btn_Objet(Objet it, FenetrePrincipale eshopFenetre) {
    this.jeuEnCours=jeuEnCours;
    this.it=it;
    this.j=j;
    this.eshopFenetre=eshopFenetre;    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
if(jeuEnCours==true){
    
}else{
    JDialog f = new JDialog();
        f.setBackground(Color.black);
    JPanel panel = new JPanel();
    new Eshop_AfficheObjet(panel, it, false,eshopFenetre);
f.add(panel);
f.setVisible(true);
}
    }
    
}
