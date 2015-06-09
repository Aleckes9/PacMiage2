/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.utiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Maëlle Cloitre
 */
public class SauvegardeFichier implements Serializable {

    private static final SauvegardeFichier SAUVEGARDE = new SauvegardeFichier();

    private SauvegardeFichier() {
        
    }

    /**
     * Enregistre dans un fichier la liste des médias
     *
     * @param monObjetSerializable information du joueur
     * @param cheminFichier
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void enregistrerFichier(Object monObjetSerializable, String cheminFichier) throws FileNotFoundException, IOException {

        File f = new File(cheminFichier);
        if(!f.exists()){
            f.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(f);
        try (ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(monObjetSerializable);
        }
    }

        public static SauvegardeFichier getInstance() {
        return SAUVEGARDE;
    }
}
