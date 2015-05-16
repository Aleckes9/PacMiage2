/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

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


    public PartieController() {
        
       super("Lesson 1 :: WindowGame");
       map = new Map();
       player = new Joueur(map);
    }


  
  @Override
public void init(GameContainer container) throws SlickException {
  

  this.container = container;
  this.map.init(); 
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
  this.player.render(g);
  this.map.renderForeground();

}


@Override
public void update(GameContainer container, int delta) throws SlickException {
  // [...] test de trigger (leçon 6) 
        for (int objectID = 0; objectID < map.getObjectCount(); objectID++) {
        if (player.getX() > map.getObjectX(0, objectID)
                && player.getX() < map.getObjectX(0, objectID) + map.getObjectWidth(0, objectID)
                && player.getY() > map.getObjectY(0, objectID)
                && player.getY() < map.getObjectY(0, objectID) + map.getObjectHeight(0, objectID)) {
            if ("graine".equals(map.getObjectType(0, objectID))) {

            } 
        }
     }
  this.player.update(delta);
  // [...] mise à jour de la camera (leçon 4) 
}
  
}
