/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Maëlle
 */
public class PacMiage2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {
        new AppGameContainer(new PartieController(), 496, 496, false).start();
    }

}
