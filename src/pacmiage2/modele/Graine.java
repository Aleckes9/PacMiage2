/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.modele;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 *
 * @author Aleckes9
 */
public class Graine {

    private String name;
    private int x, y;
    private int width, height;
    private Image imageGraine;

    public Graine(String name, int x, int y) throws SlickException {
        this.name = name;
        this.x = x;
        this.y = y;
        imageGraine = new Image("./src/ressources/image/objet/graine.png");
        width = imageGraine.getWidth();
        height = imageGraine.getHeight();
    }

    public void init() throws SlickException {

    }

    public void render(Graphics g) {
        g.drawImage(imageGraine, x, y);
    }

    public void update(int delta) {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getYMillieu() {
        return y + (height / 2);
    }

    public int getXMillieu() {
        return x + (width / 2);
    }
}
