/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author Alexandre
 */
public class Joueur {

    private float x = 230, y = 230;
    private int direction = 0;
    private boolean moving = false;
    private Animation[] animations = new Animation[8];
    private boolean onStair = false;
    private int vitesse = 1;

    private Map map;

    public Joueur(Map map) {
        this.map = map;
    }

    public void init() throws SlickException {
        SpriteSheet spriteSheet = new SpriteSheet("./src/ressources/image/personnage/pacManMove.png", 32, 32);
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
        g.setColor(new Color(0, 0, 0, .5f));

        g.drawAnimation(animations[direction + (moving ? 4 : 0)], x, y);
    }

    public void update(int delta) {
        if (this.moving) {
            float futurX = getFuturX(delta + vitesse);
            float futurY = getFuturY(delta + vitesse);
            //tout les x pour y = 0
            //tout les y pour x = 0
            //tout les x pour y = max
            //tout les y pour x = max

            if (estEnCollisionMur(futurX, futurY)) {
                this.moving = false;
            } else {
                this.x = futurX;
                this.y = futurY;
            }

        }
    }

    public boolean estEnCollisionMur(float xObjet, float yObjet) {
        boolean collision = false;
        for (int x = 0; x < 32; x++) {
            if (x == 0 || x == 31) {
                for (int j = 0; j < 32; j++) {
                    collision = this.map.isCollision(xObjet + x, yObjet + j);
                    if (collision) {
                        break;
                    }
                }
            } else {
                for (int j = 0; j < 32; j = j + 31) {
                    collision = this.map.isCollision(xObjet + x, yObjet + j);
                    if (collision) {
                        break;
                    }
                }
            }

            if (collision) {
                break;
            }
        }
        return collision;

    }

    public boolean estEnCollisionObjet(float xObjet, float yObjet) {

        return xObjet > this.x && xObjet < this.x + 32 && yObjet > this.y && yObjet < this.y + 32;

    }

    private float getFuturX(int delta) {
        float futurX = this.x;
        switch (this.direction) {
            case 1:
                futurX = this.x - .1f * delta;
                break;
            case 0:
                futurX = this.x + .1f * delta;
                break;
        }
        return futurX;
    }

    private float getFuturY(int delta) {
        float futurY = this.y;
        switch (this.direction) {
            case 2:
                futurY = this.y - .1f * delta;
                break;
            case 3:
                futurY = this.y + .1f * delta;
                break;
            case 1:
                if (this.onStair) {
                    futurY = this.y + .1f * delta;
                }
                break;
            case 0:
                if (this.onStair) {
                    futurY = this.y - .1f * delta;
                }
                break;
        }
        return futurY;
    }

//        private float getFuturX(int delta) {
//        float futurX = this.x;
//        switch (this.direction) {
//            case 1:
//                futurX = this.x - .1f * delta;
//                break;
//            case 0:
//                futurX = this.x + .1f * delta;
//                break;
//        }
//        return futurX;
//    }
//
//    private float getFuturY(int delta) {
//        float futurY = this.y;
//        switch (this.direction) {
//            case 2:
//                futurY = this.y - .1f * delta;
//                break;
//            case 3:
//                futurY = this.y + .1f * delta;
//                break;
//        }
//        return futurY;
//    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
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

}
