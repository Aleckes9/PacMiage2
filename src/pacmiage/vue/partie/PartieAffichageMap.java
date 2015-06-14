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
 * 
 * Méthode permettant d'afficher la map
 */
public class PartieAffichageMap {

    private TiledMap tiledMap;
    private int tileW;
    private int tileH;


    /**
     * Initialisation de la carte
     * @param cheminCarte le chemin du fichier contenant la carte
     * @throws SlickException
     */
        public void init(String cheminCarte) throws SlickException {
        this.tiledMap = new TiledMap(cheminCarte);
        tileW = this.tiledMap.getTileWidth();
        tileH = this.tiledMap.getTileHeight();
    }

    /**
     * Méthode permettant le rendu du fond
     */
    public void renderBackground() {
        this.tiledMap.render(0, 0, 0);
        this.tiledMap.render(0, 0, 1);
    }

    /**
     * Méthode permettant de savoir si il y a collision
     * @param x l'abscisse
     * @param y l'ordonnée
     * @return true si il y a collision, sinon false
     */
        public boolean isCollision(float x, float y) {
        int logicLayer = this.tiledMap.getLayerIndex("Logic");
        Image tile = this.tiledMap.getTileImage((int) x / tileW, (int) y / tileH, logicLayer);
        boolean collision;
        collision = tile != null;
        return collision;
    }

    /**
     * Méthode renvoyant le compteur d'objets
     * @return le compteur d'objets
     */
    public int getObjectCount() {
        return this.tiledMap.getObjectCount(0);
    }

    /**
     * Méthode renvoyant le type d'objet
     * @param objectID l'id de l'objet
     * @return le type d'objet
     */
    public String getObjectType(int objectID) {
        return this.tiledMap.getObjectType(0, objectID);
    }

    /**
     * Méthode renvoyant l'abscisse de l'objet
     * @param objectID, l'id de l'objet
     * @return  l'abscisse de l'objet
     */
    public int getObjectX(int objectID) {
        return this.tiledMap.getObjectX(0, objectID);
    }

    /**
     * Méthode renvoyant l'ordonnée de l'objet
     * @param objectID, l'id de l'objet
     * @return  l'ordonnée de l'objet
     */
    public int getObjectY(int objectID) {
        return this.tiledMap.getObjectY(0, objectID);
    }

    /**
     * Méthode renvoyant la largeur de l'objet 
     * @param objectID, l'id de l'objet
     * @return la largeur de l'objet
     */
    public float getObjectWidth(int objectID) {
        return this.tiledMap.getObjectWidth(0, objectID);
    }

    /**
     * Méthode renvoyant la longueur de l'objet
     * @param objectID, l'id de l'objet
     * @return la longueur de l'objet
     */
    public float getObjectHeight(int objectID) {
        return this.tiledMap.getObjectHeight(0, objectID);
    }

    /**
     * Méthode renvoyant le nom de l'objet
     * @param objectID, l'id de l'objet
     * @return le nom de l'obhet
     */
    public String getObjectName(int objectID) {
        return this.tiledMap.getObjectName(0, objectID);
    }

    /**
     * Méthode renvoyant la propriété de l'objet
     * @param objectID, l'id de l'objet
     * @param propertyName, le nom de la propriété
     * @param def, la définition de cette propriété
     * @return la propriété de l'objet
     */
    public String getObjectProperty(int objectID, String propertyName, String def) {
        return this.tiledMap.getObjectProperty(0, objectID, propertyName, def);
    }

}
