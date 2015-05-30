/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.util.ArrayList;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author Alexandre
 */
public class Map {

    private TiledMap tiledMap;
    private int tileW;
    private int tileH;
    // méthodes d’initialisation et d'affichage  [...]
    public void init() throws SlickException {
        this.tiledMap = new TiledMap("./src/ressources/map/pacManCarte.tmx");
        tileW = this.tiledMap.getTileWidth();
        tileH = this.tiledMap.getTileHeight();
    }

    public void renderBackground() {
        this.tiledMap.render(0, 0, 0);
        this.tiledMap.render(0, 0, 1);
        this.tiledMap.render(0, 0, 2);

    }

    public void renderForeground() {

    }

    // méthode isCollision [...]
    public boolean isCollision(float x, float y) {
        int logicLayer = this.tiledMap.getLayerIndex("Logic");
        Image tile = this.tiledMap.getTileImage((int) x / tileW, (int) y / tileH, logicLayer);
        boolean collision = tile != null;
        return collision;
    }

    public int getObjectCount() {
        return this.tiledMap.getObjectCount(0);
    }

    public String getObjectType(int objectID) {
        return this.tiledMap.getObjectType(0, objectID);
    }

    public int getObjectX(int objectID) {
        return this.tiledMap.getObjectX(0, objectID);
    }

    public int getObjectY(int objectID) {
        return this.tiledMap.getObjectY(0, objectID);
    }

    public float getObjectWidth(int objectID) {
        return this.tiledMap.getObjectWidth(0, objectID);
    }

    public float getObjectHeight(int objectID) {
        return this.tiledMap.getObjectHeight(0, objectID);
    }

    public String getObjectName(int objectID) {
        return this.tiledMap.getObjectName(0, objectID);
    }

    public String getObjectProperty(int objectID, String propertyName, String def) {
        return this.tiledMap.getObjectProperty(0, objectID, propertyName, def);
    }

}
