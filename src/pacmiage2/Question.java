/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;
import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author Aleckes9
 */
public class Question {
    private int niveau;
    private String choix;
    private ArrayList<Reponse> reponse;
    private String text;
    
    public Question(){
       reponse = new  ArrayList<Reponse>();
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }
    


    public ArrayList<Reponse> getReponse() {
        return reponse;
    }

    public void setReponse(ArrayList<Reponse> reponse) {
        this.reponse = reponse;
    }
    
    

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isEmptyChoix() {
        return choix.isEmpty();
    }



    public boolean isEmptyReponse() {
        return reponse.isEmpty();
    }

    public Reponse getReponse(int index) {
        return reponse.get(index);
    }

    public boolean addReponse(Reponse e) {
        return reponse.add(e);
    }

    public Reponse removeReponse(int index) {
        return reponse.remove(index);
    }

    public Iterator<Reponse> iteratorReponse() {
        return reponse.iterator();
    }


    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }


    
    
    
    
}
