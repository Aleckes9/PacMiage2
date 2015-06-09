/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.question;

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
import pacmiage2.utiles.QuestionBuilder;

/**
 *
 * @author Aleckes9
 */
public class Question_QuestionControler {
    
    public Question_QuestionControler(){
        try {
            //On crée une nouvelle instance de notre FenetreBoutons
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = factory.newDocumentBuilder();
            final Document document = builder.parse(new File("./src/ressources/questions/questions.xml"));
            Element racine = document.getDocumentElement();
            QuestionBuilder qBuilder = new QuestionBuilder(racine);
            Question_FenetreQuestion fenetre = new Question_FenetreQuestion(qBuilder.getQuestion(1));
            fenetre.setVisible(true);//On la rend visible

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Question_FenetreQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Question_FenetreQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Question_FenetreQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        
    } 
    
}
