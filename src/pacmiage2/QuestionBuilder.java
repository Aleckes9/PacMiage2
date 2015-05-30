/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Aleckes9
 */
class QuestionBuilder {

    private List<Question> q;
    private Element r;

    public QuestionBuilder(Element racine) {

        r = racine;
        q = new ArrayList<Question>();
        fabriquerQuestion();

    }

    Question getQuestion(int niveau) {
        List<Question> listQuestionNv = new ArrayList<Question>();
        for (Question qestion : q) {
            if(qestion.getNiveau() == niveau){
                listQuestionNv.add(qestion);
            }
        }
        int indice = (int) ((Math.random() * 100) % listQuestionNv.size());
        return q.get(indice);
    }

    private void fabriquerQuestion() {
        final NodeList racineNoeuds = r.getChildNodes();
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
                    reponse.setVeracite(reponseNoeud.getAttribute("rep").trim().equals("true"));
                    question.addReponse(reponse);
                }
                q.add(question);
            }
        }

    }

}
