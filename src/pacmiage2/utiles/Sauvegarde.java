/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.utiles;

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

    public Sauvegarde(String cheminFichier) {
        this.nomFichier = cheminFichier;
    }

    public Sauvegarde() {

    }

    /**
     * Enregistre dans un fichier la liste des médias
     *
     * @param monObjetSerializable information du joueur
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void enregistrerFichier(Object monObjetSerializable) throws FileNotFoundException, IOException {

        File f = new File(nomFichier);
        if(!f.exists()){
            f.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(f);
        try (ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(monObjetSerializable);
        }
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
    public Object lectureFichier() throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File(nomFichier);
        Object o = null;
        
        if (f.exists()) {
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(fin);
            o = in.readObject();
        }
        return o;
    }
}
