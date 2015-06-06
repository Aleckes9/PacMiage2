/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
/**
 *
 * @author Aleckes9
 */
public class Partie_AffichageScore {
        private float x, y;
        private int score;
        private int futureScore;
        public Partie_AffichageScore() {
    }
    
        public void render(Graphics g) throws SlickException {
            
            if(score<futureScore){
                score = score+1;
            }
            
            
        String argentString = String.valueOf(score);
                float xx = x;
                float yy = y;
            for (int i = 0; i < argentString.length(); i++) {
                g.drawImage(new Image("./src/ressources/image/chiffre/"+argentString.charAt(i)+".png"), xx, yy);
                xx=xx+40;
            }
        
        
    }
        
        
        public void initPos(int xPos, int Ypos) {
          x =   xPos;
          y = Ypos;
        }
        
        public void update(int delta) {
            
        }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFutureScore() {
        return futureScore;
    }

    public void setFutureScore(int futureScore) {
        this.futureScore = futureScore;
    }
    
    
        
        
}
