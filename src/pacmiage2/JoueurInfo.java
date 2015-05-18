/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.util.ArrayList;

/**
 *
 * @author Maëlle
 */
public class JoueurInfo {

    private int graines;
    private int record;
    private ArrayList<Objet> ObjetDispo;

    public JoueurInfo() {
        this.graines = 0;
        this.record = 0;
        ObjetDispo = new ArrayList<>();
    }

    public void ajouterGraines(int n) {
        graines += n;
    }

    public void retirerGraines(int n) {
        graines -= n;
    }

    public int getGraines() {
        return graines;
    }

    public int getRecord() {
        return record;
    }

    public ArrayList<Objet> getObjetDispo() {
        return ObjetDispo;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public void ajouterObjet(Objet o) {
        ObjetDispo.add(o);
    }

    public void retirerObjet(Objet o) {
        ObjetDispo.remove(o);
    }
}
