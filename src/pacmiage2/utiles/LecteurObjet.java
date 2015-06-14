/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.utiles;

import pacmiage2.modele.Objet;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * Lecture du fichier contenant les objets et création d'un tableau d'objet
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public class LecteurObjet {

    private static Document document;
    private static Element racine;
    private final Objet[] objet;

    public LecteurObjet() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        //On crée une instance de SAXBuilder
        SAXBuilder sxb = new SAXBuilder();
   
        try {
            //On crée un nouveau document JDOM avec en argument le fichier XML

            document = sxb.build(new File(Configuration.getInstance().recupererValeur("listeBonus")));
        } catch (JDOMException | IOException ex) {
            Logger.getLogger(LecteurObjet.class.getName()).log(Level.SEVERE, null, ex);
        }
   

        //On initialise un nouvel élément racine avec l'élément racine du document.
        racine = document.getRootElement();

        //On crée une List contenant tous les noeuds "etudiant" de l'Element racine
        List listEtudiants = racine.getChildren("objet");
        objet = new Objet[listEtudiants.size()];
        Iterator i = listEtudiants.iterator();
        int n = 0;
        /**
         * On parcours le fichier pour remplir notre tableau d'objet
         */
        while (i.hasNext()) {

            Element courant = (Element) i.next();
            objet[n] = new Objet(courant.getChildText("nom"), courant.getChildText("image"), courant.getChild("description").getChildText(Session.getInstance().getLocale().toString()), Integer.parseInt(courant.getChildText("prix")), courant.getChildText("mini_image"));
            n++;
        }
    }

    /**
     * On récupère le tableau d'objets
     *
     * @return le tableau d'objets
     */
    public Objet[] getObjet() {
        return objet;
    }
}
