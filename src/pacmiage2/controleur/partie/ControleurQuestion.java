package pacmiage2.controleur.partie;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import pacmiage2.utiles.Configuration;
import pacmiage2.vue.question.Question_FenetreQuestion;
import pacmiage2.utiles.QuestionBuilder;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public final class ControleurQuestion {

    private Question_FenetreQuestion fenetre;
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;
    private Element racine;
    private QuestionBuilder qBuilder;
    private static GraphicsDevice device = GraphicsEnvironment
            .getLocalGraphicsEnvironment().getScreenDevices()[0];

    public ControleurQuestion() {

    }

    public void initQuestion() {

        try {
            //On crée une nouvelle instance de notre FenetreBoutons
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            document = builder.parse(new File(Configuration.getInstance().recupererValeur("questions")));

            racine = document.getDocumentElement();
            qBuilder = new QuestionBuilder(racine);

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.exit(0);
        }

    }

    public Question_FenetreQuestion getFenetre() {
        return fenetre;
    }

    public void setFenetre(Question_FenetreQuestion fenetre) {
        this.fenetre = fenetre;
    }

    public void afficherQuestion(int niveau) {
        fenetre = new Question_FenetreQuestion(qBuilder.getQuestion(niveau));
        device.setFullScreenWindow(fenetre);
        fenetre.setVisible(true);//On la rend visible
    }

    public DocumentBuilderFactory getFactory() {
        return factory;
    }

    public void setFactory(DocumentBuilderFactory factory) {
        this.factory = factory;
    }

    public DocumentBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(DocumentBuilder builder) {
        this.builder = builder;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Element getRacine() {
        return racine;
    }

    public void setRacine(Element racine) {
        this.racine = racine;
    }

    public QuestionBuilder getqBuilder() {
        return qBuilder;
    }

    public void setqBuilder(QuestionBuilder qBuilder) {
        this.qBuilder = qBuilder;
    }

    public static GraphicsDevice getDevice() {
        return device;
    }

    public static void setDevice(GraphicsDevice device) {
        ControleurQuestion.device = device;
    }

}
