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
 * Classe correspondant au modèle du Fantome
 */
public class Fantome extends PersonnageImpl {

    private float xOrg, yOrg;
    private float xDepart, yDepart;
    private int frequence = 0;
    private int topDepart;

    /**
     * Constructeur de la classe Fantome
     * @param map la carte du jeu
     * @param cheminImage le chemin du fichier contenant l'image
     * @throws SlickException
     */
    public Fantome(PartieAffichageMap map, String cheminImage) throws SlickException {
        super(map, cheminImage);
        vitesse = 2;
        topDepart = 0;
    }

    /**
     * Méthode permettant de remettre les positions à zéro
     */
    public void resetPos() {
        x = xOrg;
        y = yOrg;
        moving = false;
    }

    /**
     * Méthode permettant d'initialiser l'état du fantôme
     * @param posX l'abscisse du fantôme
     * @param pasY l'ordonnée du fantôme
     */
    public void initEtat(int posX, int pasY) {
        x = xOrg = posX;
        y = yOrg = pasY;
        moving = false;
    }

    /**
     * Méthode permettant d'initialiser la position de départ du fantôme
     * @param posX l'abscisse de la position
     * @param pasY l'ordonnée de la position
     */
    public void initDepart(int posX, int pasY) {
        xDepart = posX;
        yDepart = pasY;
    }

    /**
     * Mise à jour de la position du fantôme
     * @param newXPac la nouvelle position en abscisse
     * @param newYPac la nouvelle position en ordonnée
     */
    public void updateFantome(float newXPac, float newYPac) {
        if (topDepart == 150) {
            this.depart();
            topDepart = 0;
        }
        if (this.moving) {

            float moyX, moyY;
            moyX = x - newXPac;
            moyY = y - newYPac;
            boolean collision = true;
            int vitesseTmp = vitesse;

            if (frequence != 50) {

                while (collision) {

                    Double random = Math.random();
                    int newFuturDirection = (int) (random * 100) % 4;

                    if (random < 0.40) {

                    } else {
                        if (Math.abs(moyX) > Math.abs(moyY)) {
                            if (moyX < 0) {
                                newFuturDirection = 0;
                            } else {
                                newFuturDirection = 1;
                            }
                        } else {
                            if (moyY < 0) {
                                newFuturDirection = 3;
                            } else {
                                newFuturDirection = 2;
                            }
                        }
                    }

                    if (this.direction == 0 && newFuturDirection == 1 || this.direction == 1 && newFuturDirection == 0 || this.direction == 2 && newFuturDirection == 3 || this.direction == 3 && newFuturDirection == 2) {

                    } else {
                        this.futurDirection = newFuturDirection;
                    }

                    float futurX = getFuturX(vitesse, this.direction);
                    float futurY = getFuturY(vitesse, this.direction);
                    float futurXDir = getFuturX(vitesse, this.futurDirection);
                    float futurYDir = getFuturY(vitesse, this.futurDirection);

                    //Si la future destination n'est pas en collision on change de direction.
                    if (!estEnCollisionMur(futurXDir, futurYDir)) {
                        this.direction = this.futurDirection;
                        this.x = futurXDir;
                        this.y = futurYDir;
                        collision = false;

                    } else {

                        if (!estEnCollisionMur(futurX, futurY)) {
                            this.x = futurX;
                            this.y = futurY;
                            collision = false;

                        } else {
                            vitesse = 2;
                        }
                    }

                }

                frequence = 0;

            }
            if (vitesse != vitesseTmp) {
                vitesse = vitesseTmp;
            }
            frequence++;
        } else {
            topDepart++;
        }

    }

    /**
     * Méthode renvoyant si le fantôme est entré en collision avec le Pac-man
     * @param xObjet l'abscisse de la cible
     * @param yObjet l'ordonnée de la cible
     * @return true si le fantôme est en collision avec la cible, sinon false
     */
    public boolean estEnCollisionCible(float xObjet, float yObjet) {

        return xObjet > this.x && xObjet < this.x + 33 && yObjet > this.y && yObjet < this.y + 33;

    }

    /**
     * Méthode permettant de démarrer le mouvenement des fantômes
     */
    public void depart() {
        this.moving = true;
        x = xDepart;
        y = yDepart;
    }

}
