package pacmiage2.controleur.partie;

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
import pacmiage2.vue.question.Question_FenetreQuestion;
import pacmiage2.utiles.QuestionBuilder;

/**
 *
 * @author Aleckes9
 */
public class ControleurQuestion {

    private Question_FenetreQuestion fenetre;
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;
    private Element racine;
    private QuestionBuilder qBuilder;
    static GraphicsDevice device = GraphicsEnvironment
        .getLocalGraphicsEnvironment().getScreenDevices()[0];

    public ControleurQuestion(int niveau) {
        init(niveau);
    }

    public void init(int niveau) {

        try {
            //On crée une nouvelle instance de notre FenetreBoutons
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            document = builder.parse(new File("./src/ressources/questions/questions.xml"));
            
            racine = document.getDocumentElement();
            qBuilder = new QuestionBuilder(racine);
            
            
            fenetre = new Question_FenetreQuestion(qBuilder.getQuestion(niveau));
            device.setFullScreenWindow(fenetre);
            fenetre.setVisible(true);//On la rend visible
            

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(Question_FenetreQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Question_FenetreQuestion getFenetre() {
        return fenetre;
    }

    public void setFenetre(Question_FenetreQuestion fenetre) {
        this.fenetre = fenetre;
    }

}
