/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.modele;


import pacmiage.vue.partie.PartieAffichageMap;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe correspondant au modèle du jeu
 */
public class PacMiage extends PersonnageImpl {

    /**
     * Constructeur de la classe PacMiage
     * @param map la carte du jeu
     * @param cheminImage le chemin du fichier contenant l'image
     * @throws SlickException
     */
    public PacMiage(PartieAffichageMap map, String cheminImage) throws SlickException {
        super(map, cheminImage);
        vitesse = 2;
    }

    /**
     * Méthode permettant de mettre à jour la position du Pac-Man
     */
    public void updatePac() {
        if (this.moving) {
            float futurX = getFuturX(vitesse, this.direction);
            float futurY = getFuturY(vitesse, this.direction);
            float futurXDir = getFuturX(vitesse, this.futurDirection);
            float futurYDir = getFuturY(vitesse, this.futurDirection);

            if (!estEnCollisionMur(futurXDir, futurYDir)) {
                this.direction = this.futurDirection;
                this.x = futurXDir;
                this.y = futurYDir;

            } else {
                if (estEnCollisionMur(futurX, futurY)) {
                    this.moving = false;
                    if (vitesse != 2) {
                        float futurX2 = getFuturX(2, this.direction);
                        float futurY2 = getFuturY(2, this.direction);
                        if (!estEnCollisionMur(futurX2, futurY2)) {
                            this.x = futurX2;
                            this.y = futurY2;
                        }
                    }
                } else {
                    this.x = futurX;
                    this.y = futurY;
                }
            }
        }
    }

    /**
     * Méthode renvoyant un booléen indiquant si le Pac-man est en collision avec un objet
     * @param xObjet l'absciesse de l'objet
     * @param yObjet l'ordonnée de l'objet
     * @return true si le Pac-man est en collision avec un objet, sinon false
     */
    public boolean estEnCollisionObjet(float xObjet, float yObjet) {

        return xObjet > this.x && xObjet < this.x + 33 && yObjet > this.y && yObjet < this.y + 33;

    }



}
