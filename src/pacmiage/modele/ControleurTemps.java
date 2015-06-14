package pacmiage.modele;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public final class ControleurTemps {


    private Timer timer;

    private int tempsRestant;

    private int temps;

    /**
     * Construction du chronometre
     *
     * @param temps
     */
    public ControleurTemps(int temps) {
        timer = createTimer();
        this.setTempsRestant(temps);
        this.setTemps(temps);
    }

    /**
     * Permet de démarrer le chronometre
     */
    public void start() {
        timer.start();
    }

    /**
     * Permet d'arreter le chronometre
     */
    public void stop() {
        timer.stop();
    }

    /**
     * Methode qui crée un Timer
     *
     * @return le timer
     */
    private Timer createTimer() {
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (tempsRestant > 0) {
                    tempsRestant--;
                } else {
                    timer.stop();
                }
            }
        };
        return new Timer(1000, action);
    }

    /**
     * Méthode renvoyant le timer
     * @return le timer
     */
    public Timer getTimer() {
        return timer;
    }

    /**
     * Méthode permettant de setter le timer
     * @param timer
     */
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    /**
     * méthode renvoyant le temps restant
     * @return le temps restant
     */
    public int getTempsRestant() {
        return tempsRestant;
    }

    /**
     * Méthode permettant de setter le temps restant
     * @param tempsRestant
     */
    public void setTempsRestant(int tempsRestant) {
        if (tempsRestant < 0) {
            this.tempsRestant = 0;
        } else {
            this.tempsRestant = tempsRestant;
        }
    }

    /**
     * Méthode permettant de récupérer le temps
     * @return temps
     */
    public int getTemps() {
        return temps;
    }

    /**
     * Méthode permettant de setter le temps
     * @param temps
     */
    public void setTemps(int temps) {
        this.temps = temps;
    }
}
