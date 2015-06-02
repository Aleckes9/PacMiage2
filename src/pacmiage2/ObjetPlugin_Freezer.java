package pacmiage2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maëlle
 */
public class ObjetPlugin_Freezer implements IPlugin{
  private int time;
    private Fantome fantome;
    @Override
    public Object executer() {
        Thread t = new Thread();
      fantome.setVitesse(0);
      try {
          t.sleep(100000);
      } catch (InterruptedException ex) {
          Logger.getLogger(ObjetPlugin_Freezer.class.getName()).log(Level.SEVERE, null, ex);
      }
         fantome.setVitesse(4);
        return true;
    }

    @Override
    public String getNom() {
        return "Freezer";
    }

 
    @Override
    public void setApplicationContext(ApplicationContext ctx) {
time=ctx.getPartie().getAffichageTemps().getTemps();
      this.fantome = ctx.getFantome();
    }

}
