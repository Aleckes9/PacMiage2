/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Maëlle Cloitre
 */
public class Sauvegarde implements Serializable {

    private String nomFichier;

    public Sauvegarde() {
        this.nomFichier = "sauvegarde.txt";
    }
    
    /**
     * Enregistre dans un fichier la liste des médias
     *
     * @param nomFichier nom du fichier où est enregistré le joueur
     * @param monObjetSerializable information du joueur
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void enregistrerFichier( JoueurInfo monObjetSerializable) throws FileNotFoundException, IOException {
        File f = new File(nomFichier);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(monObjetSerializable);
        out.close();
    }

    /**
     * Retourne les infomations du joueur enregistrées dans le fichier
     *
     * 
     * 
     * @return les infomations du joueur enregistrées dans le fichier
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public JoueurInfo lectureFichier() throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File(nomFichier);
        JoueurInfo monObjetSerializable;
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        return (JoueurInfo) in.readObject();
    }
}
