/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.modele;

import java.io.Serializable;
import java.lang.reflect.Array;

/**
 *
 * @author Maëlle
 */
public class JoueurInfo implements Serializable {

    private static JoueurInfo JOUEUR;
    private int graines;
    private int record;
    private Objet[] objetDispo;
    private int nbObjets;
    /*
     * Constructeur JoueurInfo
     */

    private JoueurInfo() {
        this.graines = 0;
        this.record = 0;
        objetDispo = (Objet[]) Array.newInstance(Objet.class, 4);
        for (int i = 0; i < 4; i++) {
            objetDispo[i] = null;
        }
        this.nbObjets = 0;
    }

    /**
     * Récupère le nombre d'objet que possède le joueur
     *
     * @return le nombre d'objet que possède le joueur
     */
    public int getNbObjet() {
        return this.nbObjets;
    }

    /**
     * Ajoute des graines sur le compte du joueur
     *
     * @param n nombre de graines à ajouter
     */
    public void ajouterGraines(int n) {
        graines = graines + n;
    }

    /**
     * Retire des graines sur le compte du joueur
     *
     * @param n nombre de graines à retirer
     */
    public void retirerGraines(int n) {
        graines = graines - n;
    }

    /**
     * Récupère le nombre de graine actuellement disponible sur le compte du
     * joueur
     *
     * @return le nombre de graine actuellement disponible sur le compte du
     * joueur
     */
    public int getGraines() {
        return graines;
    }

    /**
     * Récupère le record du joueur
     *
     * @return le record du joueur
     */
    public int getRecord() {
        return record;
    }

    /**
     * Récupère les objets du joueur
     *
     * @return
     */
    public Objet[] getObjetDispo() {
        return objetDispo;
    }

    /**
     * /**
     * Modifie le record du joueur
     *
     * @param record à modifier
     */
    public void setRecord(int reccord) {
        this.record = reccord;
    }

    /**
     * Ajoute un objet au joueur
     *
     * @param o objet à ajouter
     * @return true si l'objet a pu être ajouté false sinon
     */
    public boolean ajouterObjet(Objet o) {
        for (int i = 0; i < 4; i++) {
            if (objetDispo[i] == null) {
                objetDispo[i] = o;
                nbObjets++;
                return true;
            }
        }
        return false;
    }

    /**
     * Retire un objet au joueur
     *
     * @param o objet à retirer
     */
    public void retirerObjet(Objet o) {
        for (int i = 0; i < 4; i++) {
            if (objetDispo[i] == o) {
                objetDispo[i] = null;
                nbObjets--;
            }
        }
    }

    public static JoueurInfo getInstance() {
        if (JOUEUR == null) {
            JOUEUR = new JoueurInfo();
        }
        return JOUEUR;
    }
    
    public static void setInstance(JoueurInfo joueur) {
            JOUEUR = joueur;
    }
}
