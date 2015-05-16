/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pacmiage2.AfficheGrainesDispo;

/**
 * Affiche la barre d'information située en haut de l'écran comprenant les
 * informations du joueur
 *
 * @author Maëlle
 */
public class AfficheBarreInformation {

    JPanel p;

    public AfficheBarreInformation(JDialog f) {
        this.p = new JPanel();
        p.setBackground(Color.black);
        p.setLayout(new BorderLayout());
        AfficheGrainesDispo argent = new AfficheGrainesDispo();
        JLabel graine = argent.getGraine();
        p.add(graine, BorderLayout.WEST);

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
