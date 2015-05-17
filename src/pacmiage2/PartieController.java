/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Alexandre
 */
public class PartieController extends BasicGame{
      private GameContainer container;
  private Map map;
  private Joueur player;
    private java.util.Map<Integer, Graine> grainesMap;


    public PartieController() {
        
       super("Lesson 1 :: WindowGame");
       map = new Map();
       player = new Joueur(map);
       grainesMap = new HashMap<Integer, Graine>();
       

    }


  
  @Override
public void init(GameContainer container) throws SlickException {
  

  this.container = container;
  this.map.init(); 
                     for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {
            if ("graine".equals(map.getObjectType(objectID))) {
                String nomObjet = map.getObjectName(objectID);
                  grainesMap.put(objectID , new Graine(nomObjet, map.getObjectX(objectID), map.getObjectY(objectID)));
            }   
     }
  this.player.init();
  
  
  JoueurController controller = new JoueurController(this.player);
  container.getInput().addKeyListener(controller);
  Music background = new Music("bruno.ogg");
  background.loop();
}
  
  
  @Override
public void render(GameContainer container, Graphics g) throws SlickException {
  // placement de camera (leçon 4)
  this.map.renderBackground();
  
  
  
      for (Integer graine : grainesMap.keySet()) {
          grainesMap.get(graine).render(g);
      }

          
      
  this.player.render(g);

  this.map.renderForeground();

}


@Override
public void update(GameContainer container, int delta) throws SlickException {
  // [...] test de trigger (leçon 6) 
        for (Integer uneGraine : grainesMap.keySet()) {
            Graine graine = grainesMap.get(uneGraine);
            if(graine != null){
                
        if (player.estEnCollisionObjet(graine.getX(), graine.getY())) {
           
                  grainesMap.remove(uneGraine);
            
        }
                
            }

     }
  this.player.update(delta);
  // [...] mise à jour de la camera (leçon 4) 
}
  
}
