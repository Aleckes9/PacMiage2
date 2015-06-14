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
 * 
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
     *
     */
    public ControleurQuestion() {

    }

    /**
     *
     */
    public void initQuestion() {

       
            //On crée une nouvelle instance de notre FenetreBoutons
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
     *
     * @return
     */
    public QuestionFenetreQuestion getFenetre() {
        return fenetre;
    }

    /**
     *
     * @param fenetre
     */
    public void setFenetre(QuestionFenetreQuestion fenetre) {
        this.fenetre = fenetre;
    }

    /**
     *
     * @param niveau
     */
    public void afficherQuestion(int niveau) {
        fenetre = new QuestionFenetreQuestion(qBuilder.getQuestion(niveau));
        device.setFullScreenWindow(fenetre);
        fenetre.setVisible(true);//On la rend visible
    }

    /**
     *
     * @return
     */
    public DocumentBuilderFactory getFactory() {
        return factory;
    }

    /**
     *
     * @param factory
     */
    public void setFactory(DocumentBuilderFactory factory) {
        this.factory = factory;
    }

    /**
     *
     * @return
     */
    public DocumentBuilder getBuilder() {
        return builder;
    }

    /**
     *
     * @param builder
     */
    public void setBuilder(DocumentBuilder builder) {
        this.builder = builder;
    }

    /**
     *
     * @return
     */
    public Document getDocument() {
        return document;
    }

    /**
     *
     * @param document
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     *
     * @return
     */
    public Element getRacine() {
        return racine;
    }

    /**
     *
     * @param racine
     */
    public void setRacine(Element racine) {
        this.racine = racine;
    }

    /**
     *
     * @return
     */
    public QuestionBuilder getqBuilder() {
        return qBuilder;
    }

    /**
     *
     * @param qBuilder
     */
    public void setqBuilder(QuestionBuilder qBuilder) {
        this.qBuilder = qBuilder;
    }

    /**
     *
     * @return
     */
    public static GraphicsDevice getDevice() {
        return device;
    }

    /**
     *
     * @param device
     */
    public static void setDevice(GraphicsDevice device) {
        ControleurQuestion.device = device;
    }

}
