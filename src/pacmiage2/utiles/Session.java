/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.utiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Axel
 */
public final class Session {

    private static final Session session = new Session();
    private Locale locale = Locale.FRENCH;
    private Properties prop;
    private final HashMap<Locale, String> ficProp = new HashMap();

    private Session() {
        ficProp.put(Locale.FRENCH, "./src/ressources/properties/pacfr.properties");
        ficProp.put(Locale.ENGLISH, "./src/ressources/properties/pacen.properties");
        setLocale(Locale.FRENCH);
    }

    public String recupererValeur(String cle) {
        String valeur = prop.getProperty(cle);
        return valeur;
    }

    public static Properties load(String filename) throws IOException {
        Properties properties = new Properties();

        FileInputStream input = new FileInputStream(filename);
        properties.load(input);
        return properties;

    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
        String chemin = ficProp.get(locale);
        try {
            prop = Session.load(chemin);
        } catch (IOException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Session getInstance() {
        return session;
    }

}
