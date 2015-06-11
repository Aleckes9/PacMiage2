/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.modele;

import java.util.logging.Level;
import java.util.logging.Logger;
import pacmiage2.vue.partie.Partie_AffichageMap;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author Alexandre
 */
public class PacMiage {

    private float x, y;
    private int direction = 0;
    private int futurDirection = 0;
    private String imagePac;

    private boolean moving = false;
    private Animation[] animations = new Animation[8];
    private boolean onStair = false;
    private int vitesse = 2;

    private Partie_AffichageMap map;

    public PacMiage(Partie_AffichageMap map) throws SlickException {
        this.map = map;
        imagePac = "./src/ressources/image/personnage/pacManMove.png";
    }

    public void init(int posX, int pasY) throws SlickException {
        x = posX;
        y = pasY;
        initAnimation();
    }

    public void initAnimation() throws SlickException {
        SpriteSheet spriteSheet = new SpriteSheet(imagePac, 32, 32);
        this.animations[0] = loadAnimation(spriteSheet, 0, 1, 0);
        this.animations[1] = loadAnimation(spriteSheet, 0, 1, 1);
        this.animations[2] = loadAnimation(spriteSheet, 0, 1, 2);
        this.animations[3] = loadAnimation(spriteSheet, 0, 1, 3);
        this.animations[4] = loadAnimation(spriteSheet, 1, 6, 0);
        this.animations[5] = loadAnimation(spriteSheet, 1, 6, 1);
        this.animations[6] = loadAnimation(spriteSheet, 1, 6, 2);
        this.animations[7] = loadAnimation(spriteSheet, 1, 6, 3);
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

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void update(int delta) {
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
                    if(vitesse != 2){
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

    public boolean estEnCollisionMur(float xObjet, float yObjet) {
        return this.map.isCollision(xObjet + 1, yObjet + 1)
                || this.map.isCollision(xObjet + 31, yObjet + 1)
                || this.map.isCollision(xObjet + 1, yObjet + 31)
                || this.map.isCollision(xObjet + 31, yObjet + 31);
    }

    public boolean estEnCollisionObjet(float xObjet, float yObjet) {

        return xObjet > this.x && xObjet < this.x + 33 && yObjet > this.y && yObjet < this.y + 33;

    }

    private float getFuturX(int delta, int direction) {
        float futurX = this.x;
        switch (direction) {
            case 1:
                futurX = this.x - 2 * delta;
                break;
            case 0:
                futurX = this.x + 2 * delta;
                break;
        }
        return futurX;
    }

    private float getFuturY(int delta, int direction) {
        float futurY = this.y;
        switch (direction) {
            case 2:
                futurY = this.y - 2 * delta;
                break;
            case 3:
                futurY = this.y + 2 * delta;
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

    public float getCenterX() {
        return x + 16;
    }

    public float getCenterY() {
        return y + 16;
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

    public void setImagePac(String imagePac) {
        this.imagePac = imagePac;
        try {
            initAnimation();
        } catch (SlickException ex) {
            Logger.getLogger(PacMiage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
