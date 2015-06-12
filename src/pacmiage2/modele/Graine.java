/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.modele;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import pacmiage2.utiles.Configuration;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class Graine {

    private int x, y;
    private final int width, height;
    private final Image imageGraine;

    public Graine(int x, int y) throws SlickException {
        this.x = x;
        this.y = y;
        imageGraine = new Image(Configuration.getInstance().recupererValeur("graine"));
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
