package pacmiage2;

import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author Axel Nini
 */
public class Fenetre extends JFrame{
    
    JPanel j = new JPanel();
    
    public Fenetre(){
        Session.getInstance();
        this.setSize(2000, 1100);
        this.setTitle("pacmiage");
        this.setVisible(true);
        this.setContentPane(j);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) throws IOException {
        new AfficherMenu();
        //new SelectionnerNiveau();
    }
    
    
}