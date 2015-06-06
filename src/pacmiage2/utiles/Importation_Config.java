package pacmiage2.utiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <b>Importation_Config est la class utilisée pour récuperer nôtre fichiers de configuration et retourner un properties utilisable.</b>
 * @author Dupuis.Alexandre
 * @version 1.0
 */
public class Importation_Config {
	
	/**
	 * Properties est une class utilisée pour récupérer des valeurs dans un fichiers spécifique.
	 * Chaque paramètre est stocké comme une paire composée d'un pointeur de référence ('key') donnant le nom du paramètre, suivi de la valeur désirée de ce paramètre.
	 */
	private Properties properties;
	
	/**
	 * Chemin d'accès au fichier de configuration
	 */
	private String configPath = "./src/ressources/parametres/config.txt";
	
	/**
	 * Constructeur vide de la class Importation_Config
	 */
	public Importation_Config() {
	
	}
	
	/**
	 * Initialise le properties avec le chemin du fichier de configuration.
	 */
	public void setConfiguration(){
		

		 try {
			 
		 FileInputStream fs =new FileInputStream(configPath);
		 this.properties = new Properties();
		 this.properties.load(fs);
		 fs.close();
		 
		 } catch (IOException e) {
		 System.out.println("Pas de Fichier de configuration, ou chemin incorrect");
		 }

	}

	
	/**
	 * Retourne le properties créé
	 * @return Properties
	 */
	public Properties getConfiguration(){
		return properties;
		
	}
	
	
}