/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author Alexandre
 */
public class Fantome {

    private float x, y;
    private float xOrg, yOrg;
    private float xDepart, yDepart;
    private int direction = 2;
    private int futurDirection = 0;
    private boolean moving = false;
    private final Animation[] animations = new Animation[8];
    private boolean onStair = false;
    private int vitesse = 4;
    private int frequence = 0;
    private int topDepart;

    private Map map;

    public Fantome(Map map) {
        this.map = map;
    }

    public void resetPos() {
        x = xOrg;
        y = yOrg;
        moving = false;
    }

    public void init() throws SlickException {
        topDepart = 0;
        SpriteSheet spriteSheet = new SpriteSheet("./src/ressources/image/personnage/FantomMove.png", 32, 32);
        this.animations[0] = loadAnimation(spriteSheet, 0, 1, 0);
        this.animations[1] = loadAnimation(spriteSheet, 0, 1, 1);
        this.animations[2] = loadAnimation(spriteSheet, 0, 1, 2);
        this.animations[3] = loadAnimation(spriteSheet, 0, 1, 3);
        this.animations[4] = loadAnimation(spriteSheet, 1, 6, 0);
        this.animations[5] = loadAnimation(spriteSheet, 1, 6, 1);
        this.animations[6] = loadAnimation(spriteSheet, 1, 6, 2);
        this.animations[7] = loadAnimation(spriteSheet, 1, 6, 3);
    }
    
    public void initEtat(int posX, int pasY){
        x = xOrg = posX;
        y = yOrg = pasY;
        moving = false;
    }
    
    public void initDepart(int posX, int pasY){
        xDepart = posX;
        yDepart = pasY;
    }
    
    

    private Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y) {
        Animation animation = new Animation();
        for (int x = startX; x < endX; x++) {
            animation.addFrame(spriteSheet.getSprite(x, y), 100);
        }
        return animation;
    }

    public void render(Graphics g) throws SlickException {
        g.drawAnimation(animations[direction + (moving ? 4 : 0)], x, y);
    }

    public void update(float newXPac, float newYPac) {
        if(topDepart == 150){
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
        }else{
            topDepart++;
        }

    }

    public boolean estEnCollisionMur(float xObjet, float yObjet) {

        return this.map.isCollision(xObjet + 1, yObjet + 1)
                || this.map.isCollision(xObjet + 31, yObjet + 1)
                || this.map.isCollision(xObjet + 1, yObjet + 31)
                || this.map.isCollision(xObjet + 31, yObjet + 31);
    }

    public boolean estEnCollisionCible(float xObjet, float yObjet) {

        return xObjet > this.x && xObjet < this.x + 33 && yObjet > this.y && yObjet < this.y + 33;

    }

    private float getFuturX(int delta, int direction) {
        float futurX = this.x;
        switch (direction) {
            case 1:
                futurX = this.x - 1 * delta;
                break;
            case 0:
                futurX = this.x + 1 * delta;
                break;
        }
        return futurX;
    }

    private float getFuturY(int delta, int direction) {
        float futurY = this.y;
        switch (direction) {
            case 2:
                futurY = this.y - 1 * delta;
                break;
            case 3:
                futurY = this.y + 1 * delta;
                break;
        }
        return futurY;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isOnStair() {
        return onStair;
    }

    public void setOnStair(boolean onStair) {
        this.onStair = onStair;
    }

    public int getFuturDirection() {
        return futurDirection;
    }

    public void setFuturDirection(int futurDirection) {
        this.futurDirection = futurDirection;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void depart() {
        this.moving = true;
        x = xDepart;
        y = yDepart;
    }

}
