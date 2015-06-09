/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue;

import pacmiage2.modele.FenetrePrincipale;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage2.modele.JoueurInfo;

/**
 * Affiche la barre d'information située en haut de l'écran comprenant les
 * informations du joueur
 *
 * @author Maëlle
 */
public class AfficheBarreInformation {

    JPanel p;

    public AfficheBarreInformation(FenetrePrincipale f, JoueurInfo joueur) {

        this.p = new JPanel();

        p.setBackground(Color.black);
        p.setLayout(new BorderLayout());
        JLabel graine = new JLabel();
        graine.setText(joueur.getGraines() + " Graines");
        graine.setBackground(Color.black);
        graine.setFont(new Font("Serif", Font.BOLD, 40));
        graine.setForeground(Color.WHITE);
        p.add(graine, BorderLayout.WEST);
        p.setLayout(new GridLayout(0, 6));
        for (int i = 0; i < joueur.getObjetDispo().length; i++) {

            p.add(new Btn_Objet(joueur.getObjetDispo()[i], joueur, f));

        }
        BtnRetourMenu bt = new BtnRetourMenu(joueur, f);
        p.add(bt);
    }

    /**
     * Renvoie le JPanel où s'affiche la barre d'information joueur
     *
     * @return le JPanel où s'affiche la barre d'information joueur
     */
    public JPanel getBarreDuHaut() {
        return p;
    }
}
