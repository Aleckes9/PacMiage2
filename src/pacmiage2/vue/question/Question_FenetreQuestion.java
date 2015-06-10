/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacmiage2.vue.question;

import pacmiage2.controleur.partie.FenetreQuestionListener;
import pacmiage2.modele.Reponse;
import pacmiage2.modele.Question;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


/**
 *
 * @author Aleckes9
 */
public class Question_FenetreQuestion extends JFrame {

    private Question question;
    private JButton valider;
    private ArrayList<JButton> boutons;
    private JTextPane text;
    private JTextPane label;
    private JPanel panelGlobal;
    private boolean choix;

    /**
     *
     * @param question
     */
    public Question_FenetreQuestion(Question question) {
        this.question = question;
        boutons = new ArrayList<>();

        for (Reponse bouton : question.getReponse()) {
            boutons.add(new JButton(bouton.getText()));
        }
        label = new JTextPane();
        text = new JTextPane();
        build();//On initialise notre fenêtre
    }

    /**
     *
     */
    private void build() {
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int) tailleEcran.getHeight();
        int largeur = (int) tailleEcran.getWidth();
        setUndecorated(true);
        this.setBackground(Color.BLACK);
        setTitle("Fenêtre qui affiche des boutons"); //On donne un titre à l'application
        setSize((int) (largeur * 0.80f), (int) (hauteur * 0.80f)); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(true); //On permet le redimensionnement
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPaneGlobal());

    }

    /**
     *
     * @return
     */
    private JPanel buildContentPaneGlobal() {

        panelGlobal = new JPanel();
        panelGlobal.setLayout(new BorderLayout());
        panelGlobal.setBackground(Color.BLACK);
        panelGlobal.add(buildContentPaneGauche(), BorderLayout.WEST);
        panelGlobal.add(buildContentPaneDroite(), BorderLayout.EAST);
        panelGlobal.add(buildContentPanePied(), BorderLayout.SOUTH);

        return panelGlobal;
    }

    /**
     *
     * @return
     */
    private JPanel buildContentPaneDroite() {

        JPanel panel = new JPanel();
        panel.setSize(this.getWidth() / 2, this.getHeight());
        panel.setLayout(new GridLayout(boutons.size(), 1));
        for (JButton unBouton : boutons) {
            unBouton.addActionListener(new FenetreQuestionListener(this));
            panel.add(unBouton);
        }
        return panel;
    }

    /**
     *
     * @return
     */
    private JPanel buildContentPaneGauche() {

        JPanel panel = new JPanel();
        panel.setSize(this.getWidth() / 2, this.getHeight());
        panel.setLayout(new GridLayout(2, 1));
        Font font = new Font("Market", Font.BOLD, 18);
        text.setFont(font);
        text.setBackground(Color.BLACK);
        label.setFont(font);
        label.setBackground(Color.BLACK);
        appendToPane(text, question.getText(), Color.ORANGE);
        appendToPane(label, question.getChoix(), Color.RED);
        panel.add(text);
        panel.add(label);
        return panel;
    }

    /**
     *
     * @return
     */
    private JPanel buildContentPanePied() {

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        valider = new JButton("Valider");
        panel.add(valider);
        valider.addActionListener(new FenetreQuestionListener(this));
        return panel;
    }
    
    private void appendToPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.setText(msg);
    }

    /**
     *
     * @return
     */
    public JButton getValider() {
        return valider;
    }

    /**
     *
     * @param valider
     */
    public void setValider(JButton valider) {
        this.valider = valider;
    }

    /**
     *
     * @return
     */
    public Question getQuestion() {
        return question;
    }

    public JTextPane getText() {
        return text;
    }

    public void setText(JTextPane text) {
        this.text = text;
    }

    /**
     *
     * @param question
     */
    public void setQuestion(Question question) {
        this.question = question;
    }

    public JPanel getPanelGlobal() {
        return panelGlobal;
    }

    public void setPanelGlobal(JPanel panelGlobal) {
        this.panelGlobal = panelGlobal;
    }

    /**
     *
     * @return
     */
    public ArrayList<JButton> getBoutons() {
        return boutons;
    }

    /**
     *
     * @param boutons
     */
    public void setBoutons(ArrayList<JButton> boutons) {
        this.boutons = boutons;
    }

    /**
     *
     * @return
     */
    public JTextPane getLabel() {
        return label;
    }

    /**
     *
     * @param label
     */
    public void setLabel(JTextPane label) {
        this.label = label;
    }

    public void fermer() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void setChoix(boolean unChoix) {
        this.choix = unChoix;
    }

    public boolean isChoix() {
        return choix;
    }

}