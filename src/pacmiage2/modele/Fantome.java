/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.modele;

import pacmiage2.vue.partie.Partie_AffichageMap;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Fantome extends PersonnageImpl {

    private float xOrg, yOrg;
    private float xDepart, yDepart;
    private int frequence = 0;
    private int topDepart;

    public Fantome(Partie_AffichageMap map, String cheminImage) throws SlickException {
        super(map, cheminImage);
        vitesse = 2;
        topDepart = 0;
    }

    public void resetPos() {
        x = xOrg;
        y = yOrg;
        moving = false;
    }

    public void initEtat(int posX, int pasY) {
        x = xOrg = posX;
        y = yOrg = pasY;
        moving = false;
    }

    public void initDepart(int posX, int pasY) {
        xDepart = posX;
        yDepart = pasY;
    }

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

    public boolean estEnCollisionCible(float xObjet, float yObjet) {

        return xObjet > this.x && xObjet < this.x + 33 && yObjet > this.y && yObjet < this.y + 33;

    }


    public void depart() {
        this.moving = true;
        x = xDepart;
        y = yDepart;
    }

}
