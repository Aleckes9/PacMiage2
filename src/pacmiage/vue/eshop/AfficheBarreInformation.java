/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.eshop;

import pacmiage.vue.menu.FenetrePrincipale;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage.modele.JoueurInfo;
import pacmiage.modele.Objet;
import pacmiage.vue.bouton.BtnRetourMenu;
import pacmiage.vue.bouton.BtnObjet;

/**
 * 
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Affiche la barre d'information située en haut de l'écran comprenant les informations du joueur
 * 
 */
public class AfficheBarreInformation extends JPanel {

    /**
     * Constructeur de la classe AfficheBarreInformation
     * @param fenetre la fenêtre principale
     */
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
            this.add(new BtnObjet(objetDispo, fenetre));
        }

        BtnRetourMenu bt = new BtnRetourMenu(fenetre);
        this.add(bt);
    }
}
