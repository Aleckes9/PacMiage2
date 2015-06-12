package pacmiage2.controleur.partie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Maëlle Cloitre / Dupuis Alexandre / Axel Nini / Raphaël Senand
 */
public final class ControleurTemps {

    /**
     * timer : timer servant à décrémenter le chronometre
     */
    private Timer timer;

    /**
     * tempsRestant : temps restant
     */
    private int tempsRestant;

    /**
     * temps : temps initial
     */
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

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int getTempsRestant() {
        return tempsRestant;
    }

    public void setTempsRestant(int tempsRestant) {
        if (tempsRestant < 0) {
            this.tempsRestant = 0;
        } else {
            this.tempsRestant = tempsRestant;
        }
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }
}
