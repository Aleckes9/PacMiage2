/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage.utiles;

import pacmiage.modele.Reponse;
import pacmiage.modele.Question;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 * Classe permettant de builder la liste des questions
 */
public class QuestionBuilder {

    private final List<Question> questions;
    private final Element racine;

    /**
     * Constructeur de la classe QuestionBuilder
     * @param racine
     */
    public QuestionBuilder(Element racine) {
        this.racine = racine;
        questions = new ArrayList<>();
        fabriquerQuestion();
    }

    /**
     * Méthode renvoyant les questions selon le niveau choisi
     * @param niveau choisi par l'utilisateur
     * @return la liste de questions
     */
    public Question getQuestion(int niveau) {
        List<Question> listQuestionNv = new ArrayList<>();
        for (Question qestion : questions) {
            if (qestion.getNiveau() == niveau) {
                listQuestionNv.add(qestion);
            }
        }
        int indice = (int) ((Math.random() * 100) % listQuestionNv.size());
        return listQuestionNv.get(indice);
    }

    private void fabriquerQuestion() {
        final NodeList racineNoeuds = racine.getChildNodes();
        final int nbRacineNoeuds = racineNoeuds.getLength();

        for (int i = 0; i < nbRacineNoeuds; i++) {
            if (racineNoeuds.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Question question = new Question();
                final Element questionNoeud = (Element) racineNoeuds.item(i);
                question.setNiveau(Integer.parseInt(questionNoeud.getAttribute("niveau")));

                final NodeList text = questionNoeud.getElementsByTagName("text");
                final Element textNoeud = (Element) text.item(0);
                question.setText(textNoeud.getTextContent().trim());

                final NodeList reponses = questionNoeud.getElementsByTagName("reponse");
                for (int j = 0; j < reponses.getLength(); j++) {
                    Reponse reponse = new Reponse();
                    final Element reponseNoeud = (Element) reponses.item(j);
                    reponse.setText(reponseNoeud.getTextContent().trim());
                    reponse.setVeracite("true".equals(reponseNoeud.getAttribute("rep").trim()));
                    question.addReponse(reponse);
                }
                questions.add(question);
            }
        }

    }

}
