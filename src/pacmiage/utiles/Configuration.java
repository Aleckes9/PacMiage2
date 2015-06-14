package pacmiage.utiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>Importation_Config est la class utilisée pour récuperer nôtre fichiers de
 * configuration et retourner un properties utilisable.</b>
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * @version 1.0
 */
public final class Configuration {

    /**
     * Properties est une class utilisée pour récupérer des valeurs dans un
     * fichiers spécifique. Chaque paramètre est stocké comme une paire composée
     * d'un pointeur de référence ('key') donnant le nom du paramètre, suivi de
     * la valeur désirée de ce paramètre.
     */
    private Properties properties;

    /**
     * Chemin d'accès au fichier de configuration
     */
    private String cheminConfig = "./src/ressources/parametres/config.txt";
    private static final Configuration config = new Configuration();

    /**
     * Constructeur vide de la class Importation_Config
     */
    private Configuration() {
        try {
            properties = load(cheminConfig);
        } catch (IOException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param cle
     * @return
     */
    public String recupererValeur(String cle) {
        String valeur = properties.getProperty(cle);
        return valeur;
    }

    private static Properties load(String filename) throws IOException {
        Properties properties = new Properties();

        FileInputStream input = new FileInputStream(filename);
        properties.load(input);
        return properties;

    }

    /**
     *
     * @return
     */
    public static Configuration getInstance() {
        return config;

    }

}
