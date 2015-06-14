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
     *
     * @param cle
     * @return
     */
    public String recupererValeur(String cle) {
        return prop.getProperty(cle);
    }

    /**
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static Properties load(String filename) throws IOException {
        Properties properties = new Properties();

        FileInputStream input = new FileInputStream(filename);
        properties.load(input);
        return properties;

    }

    /**
     *
     * @return
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     *
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
