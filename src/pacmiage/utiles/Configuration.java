package pacmiage.utiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant de récuperer notre fichier de configuration et retourner un properties utilisable
 */
public final class Configuration {

    private Properties properties;
    private String cheminConfig = "./src/ressources/parametres/config.txt";
    private static final Configuration config = new Configuration();

    /**
     * Constructeur de la classe Configuration
     */
    private Configuration() {
        try {
            properties = load(cheminConfig);
        } catch (IOException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Méthode permettant de récupérer la valeur d'une clé dans le fichier properties
     * @param cle, la cle dont on recherche la valeur
     * @return la valeur de la clé
     */
    public String recupererValeur(String cle) {
        return properties.getProperty(cle);
    }

    /**
     * Méthode permettant de charger le fichier
     * @param filename le nom du fichier
     * @return le fichier properties
     * @throws IOException
     */
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
