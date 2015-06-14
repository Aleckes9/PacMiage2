package pacmiage.controleur.partie;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import pacmiage.utiles.Configuration;
import pacmiage.vue.question.QuestionFenetreQuestion;
import pacmiage.utiles.QuestionBuilder;

/**
 * 
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * 
 * Classe contenant le controleur de la question
 */
public final class ControleurQuestion {

    private QuestionFenetreQuestion fenetre;
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;
    private Element racine;
    private QuestionBuilder qBuilder;
    private static GraphicsDevice device = GraphicsEnvironment
            .getLocalGraphicsEnvironment().getScreenDevices()[0];

    /**
     * Constructeur de la classe ControleurQuestion
     */
    public ControleurQuestion() {

    }

    /**
     * Initialisation d'une question
     */
    public void initQuestion() {

            factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ControleurQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            document = builder.parse(new File(Configuration.getInstance().recupererValeur("questions")));
        } catch (SAXException | IOException ex) {
            Logger.getLogger(ControleurQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
            racine = document.getDocumentElement();
            qBuilder = new QuestionBuilder(racine);

    }

    /**
     * Méthode renvoyant la fenêtre
     * @return la fenêtre
     */
    public QuestionFenetreQuestion getFenetre() {
        return fenetre;
    }

    /**
     * Méthode permettant de setter la fenêtre
     * @param fenetre
     */
    public void setFenetre(QuestionFenetreQuestion fenetre) {
        this.fenetre = fenetre;
    }

    /**
     * Méthode permettant d'afficher la question selon le niveau sélectionné
     * @param niveau le niveau sélectionné par l'utilisateur
     */
    public void afficherQuestion(int niveau) {
        fenetre = new QuestionFenetreQuestion(qBuilder.getQuestion(niveau));
        device.setFullScreenWindow(fenetre);
        fenetre.setVisible(true);//On la rend visible
    }

    /**
     * Méthode permettant de renvoyer le Factory qui permet de créer l'arborescence XML
     * @return le Factory
     */
    public DocumentBuilderFactory getFactory() {
        return factory;
    }

    /**
     * Méthode permettant de setter le Factory
     * @param factory
     */
    public void setFactory(DocumentBuilderFactory factory) {
        this.factory = factory;
    }

    /**
     * Méthode renvoyant le builder du document
     * @return le builder
     */
    public DocumentBuilder getBuilder() {
        return builder;
    }

    /**
     * Méthode permettant de setter le builder
     * @param builder
     */
    public void setBuilder(DocumentBuilder builder) {
        this.builder = builder;
    }

    /**
     * Méthode renvoyant le document
     * @return le document
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Méthode permettant de setter le document
     * @param document
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * Méthode renvoyant la racine de l'élément
     * @return la racine de l'élement
     */
    public Element getRacine() {
        return racine;
    }

    /**
     * Méthode permettant de setter la racine de l'élément
     * @param racine
     */
    public void setRacine(Element racine) {
        this.racine = racine;
    }

    /**
     * Méthode renvoyant le builder de la question
     * @return le builder de la question
     */
    public QuestionBuilder getqBuilder() {
        return qBuilder;
    }

    /**
     * Méthode permettant de setter le builder de la question
     * @param qBuilder
     */
    public void setqBuilder(QuestionBuilder qBuilder) {
        this.qBuilder = qBuilder;
    }

    /**
     * Méthode renvoyant l'écran
     * @return l'écran
     */
    public static GraphicsDevice getDevice() {
        return device;
    }

    /**
     * Méthode permettant de setter l'écran
     * @param device
     */
    public static void setDevice(GraphicsDevice device) {
        ControleurQuestion.device = device;
    }

}
