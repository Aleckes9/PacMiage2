/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.modele;

/**
 *
 * @author Aleckes9
 */
public class Reponse {
    
    private String text;
    private boolean veracite;
    
        public Reponse(){
        
    }
    
    public Reponse(String text, boolean veracite){
        
        this.text = text;
        this.veracite = veracite;
        
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isVeracite() {
        return veracite;
    }

    public void setVeracite(boolean veracite) {
        this.veracite = veracite;
    }
    
    
    
    
}

