/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Aleckes9
 */
public class AffichageScore {
        private float x = 250, y = 30;
        private Map map;
        private int argent;
        public AffichageScore(Map map) {
        this.map = map;
    }
    
        public void render(Graphics g) throws SlickException {
        g.setColor(new Color(0, 0, 0, .5f));
        String argentString = String.valueOf(argent);
                float xx = x;
                float yy = y;
            for (int i = 0; i < argentString.length(); i++) {

                g.drawImage(new Image("./src/ressources/image/chiffre/"+argentString.charAt(i)+".png"), xx, yy);
                xx=xx+40;
            }
        
        
    }
        
        
        public void update(int delta) {
            
        }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }
        
        
}
