/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.bouton;

import pacmiage.vue.menu.FenetrePrincipale;
import pacmiage.modele.Objet;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pacmiage.vue.eshop.EshopAfficheConfirmAcheter;

/**
 * 
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Bouton pour sélectionner un objet à acheter
 */
public final class EshopBtnAcheter extends JButton {
    
    private final Objet it;
    private final FenetrePrincipale eshopFenetre;
    
    
    /**
     * Constructeur de la classe EshopBtnAcheter
     * @param it l'objet
     * @param eshopFenetre la fenêtre de l'eshop
     */
    public EshopBtnAcheter(Objet it, FenetrePrincipale eshopFenetre) {
        this.it = it;
        this.eshopFenetre = eshopFenetre;
        initButton();
    }

    /**
     * Méthode permettant d'initialiser le bouton
     */
    public void initButton() {
        this.setAction(new EshopAfficheConfirmAcheter(it, eshopFenetre));
        ImageIcon icon = new ImageIcon("./src/ressources/image/eshop/Caddy.png");
        this.setIcon(icon);
        this.setBackground(Color.black);
        this.setBorderPainted(false);
    }

}
