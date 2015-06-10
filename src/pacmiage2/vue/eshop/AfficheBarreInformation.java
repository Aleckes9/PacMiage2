/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.eshop;

import pacmiage2.modele.FenetrePrincipale;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage2.modele.JoueurInfo;
import pacmiage2.modele.Objet;
import pacmiage2.vue.bouton.Btn_RetourMenu;
import pacmiage2.vue.bouton.Btn_Objet;

/**
 * Affiche la barre d'information située en haut de l'écran comprenant les
 * informations du joueur
 *
 * @author Maëlle
 */
public class AfficheBarreInformation extends JPanel {


    public AfficheBarreInformation(FenetrePrincipale fenetre) {

        JoueurInfo joueur = JoueurInfo.getInstance();

        this.setBackground(Color.black);
        this.setLayout(new BorderLayout());
        JLabel graine = new JLabel();
        graine.setText(joueur.getGraines() + " Graines");
        graine.setBackground(Color.black);
        graine.setFont(new Font("Serif", Font.BOLD, 40));
        graine.setForeground(Color.WHITE);
        this.add(graine, BorderLayout.WEST);
        this.setLayout(new GridLayout(0, 6));
        
        for (Objet objetDispo : joueur.getObjetDispo()) {
            this.add(new Btn_Objet(objetDispo, fenetre));
        }
        
        Btn_RetourMenu bt = new Btn_RetourMenu(fenetre);
        this.add(bt);
    }
}
