package pacmiage2.utiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class ChargerFichier {

    private static final ChargerFichier CHARGER = new ChargerFichier();

    private ChargerFichier() {

    }

    /**
     * Retourne les infomations du joueur enregistrées dans le fichier
     *
     * @param cheminFichier
     * @return les infomations du joueur enregistrées dans le fichier
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object lectureFichier(String cheminFichier) throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File(cheminFichier);
        Object o = null;
        if (f.exists()) {
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(fin);
            o = in.readObject();
        }
        return o;
    }

    public static ChargerFichier getInstance() {
        return CHARGER;
    }
}
