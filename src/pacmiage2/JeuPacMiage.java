/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle
 */
public class JeuPacMiage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {
        int niveau = 1;

       JoueurInfo joueur=new JoueurInfo();
        AppGameContainer game = new AppGameContainer(new PartieController(niveau,joueur), 1024, 768, false);
        //game.setShowFPS(false);
        
        game.setTargetFrameRate(30);
        game.setMusicOn(true);
        game.setMusicVolume(0.5f);
        game.start();
        
    }
}
