/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.vue.partie;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class PartieAffichageMap {

    private TiledMap tiledMap;
    private int tileW;
    private int tileH;


    /**
     *
     * @param cheminCarte
     * @throws SlickException
     */
        public void init(String cheminCarte) throws SlickException {
        this.tiledMap = new TiledMap(cheminCarte);
        tileW = this.tiledMap.getTileWidth();
        tileH = this.tiledMap.getTileHeight();
    }

    /**
     *
     */
    public void renderBackground() {
        this.tiledMap.render(0, 0, 0);
        this.tiledMap.render(0, 0, 1);
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
        public boolean isCollision(float x, float y) {
        int logicLayer = this.tiledMap.getLayerIndex("Logic");
        Image tile = this.tiledMap.getTileImage((int) x / tileW, (int) y / tileH, logicLayer);
        boolean collision;
        collision = tile != null;
        return collision;
    }

    /**
     *
     * @return
     */
    public int getObjectCount() {
        return this.tiledMap.getObjectCount(0);
    }

    /**
     *
     * @param objectID
     * @return
     */
    public String getObjectType(int objectID) {
        return this.tiledMap.getObjectType(0, objectID);
    }

    /**
     *
     * @param objectID
     * @return
     */
    public int getObjectX(int objectID) {
        return this.tiledMap.getObjectX(0, objectID);
    }

    /**
     *
     * @param objectID
     * @return
     */
    public int getObjectY(int objectID) {
        return this.tiledMap.getObjectY(0, objectID);
    }

    /**
     *
     * @param objectID
     * @return
     */
    public float getObjectWidth(int objectID) {
        return this.tiledMap.getObjectWidth(0, objectID);
    }

    /**
     *
     * @param objectID
     * @return
     */
    public float getObjectHeight(int objectID) {
        return this.tiledMap.getObjectHeight(0, objectID);
    }

    /**
     *
     * @param objectID
     * @return
     */
    public String getObjectName(int objectID) {
        return this.tiledMap.getObjectName(0, objectID);
    }

    /**
     *
     * @param objectID
     * @param propertyName
     * @param def
     * @return
     */
    public String getObjectProperty(int objectID, String propertyName, String def) {
        return this.tiledMap.getObjectProperty(0, objectID, propertyName, def);
    }

}
