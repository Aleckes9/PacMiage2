/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.utiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe permettant le chargement d'un fichier properties
 */
public final class Session {

    private static final Session session = new Session();
    private Locale locale = Locale.FRENCH;
    private Properties prop;
    private final Map<Locale, String> ficProp = new HashMap();

    private Session() {
        ficProp.put(Locale.FRENCH, "./src/ressources/properties/pacfr.properties");
        ficProp.put(Locale.ENGLISH, "./src/ressources/properties/pacen.properties");
        setLocale(Locale.FRENCH);
    }

    /**
     * Méthode permettant de récupérer la valeur d'une clé dans le fichier properties
     * @param cle, la cle dont on recherche la valeur
     * @return la valeur de la clé
     */
    public String recupererValeur(String cle) {
        return prop.getProperty(cle);
    }

    /**
     * Méthode permettant de charger le fichier
     * @param filename le nom du fichier
     * @return le fichier properties
     * @throws IOException
     */
    public static Properties load(String filename) throws IOException {
        Properties properties = new Properties();

        FileInputStream input = new FileInputStream(filename);
        properties.load(input);
        return properties;

    }

    /**
     * méthode renvoyant la locale
     * @return la locale actuellement utilisée
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Méthode permettant de setter la locale
     * @param locale
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
        String chemin = ficProp.get(locale);
        try {
            prop = Session.load(chemin);
        } catch (IOException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @return
     */
    public static Session getInstance() {
        return session;
    }

}
