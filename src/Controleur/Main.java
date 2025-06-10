package Controleur;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import vue.FenFacture;
import vue.FenFactureGenerer;
import vue.FenGestion;
import vue.FenInscription;
import vue.FenMailEnvoye;
import vue.FenModif;
import vue.FenPasPaye;
import vue.FenRappel;
import vue.FenVisuFacture;
import vue.FenVisuMail;

public class Main extends Application{
	static public FenGestion fenGestion;
	static public FenFacture fenFacture;
	static public FenRappel fenRappel;
	static public FenInscription fenInscription;
	static public FenModif fenModif;
	static public FenPasPaye fenPasPaye;
	static public FenMailEnvoye fenMailEnvoye;
	static public FenFactureGenerer fenFactureGenerer;
	static public FenVisuMail fenVisuMail;
	static public FenMailEnvoye fenEnvoyerMail;
	static public FenVisuFacture fenVisuFacture;
	
	
	public void start(Stage f) throws IOException {
		fenGestion = new FenGestion();
		fenFacture = new FenFacture();
		fenRappel = new FenRappel();
		fenInscription = new FenInscription();
		fenModif = new FenModif();
		fenPasPaye = new FenPasPaye();
		fenMailEnvoye = new FenMailEnvoye();
		fenFactureGenerer= new FenFactureGenerer();
		fenVisuMail= new FenVisuMail();
		fenEnvoyerMail = new FenMailEnvoye();
		fenVisuFacture = new FenVisuFacture();
		fenGestion.show();
	}
	
	public static void main(String args[]) {
		Application.launch();
	}
	
	static public void fermerAppli() {
		System.exit(0);
	}
	static public void openFacture(){
		fenGestion.close();
		fenFacture.show();
	}
	static public void openRappel(){
		fenGestion.close();
		fenRappel.show();
	}
	
	static public void openInscription(){
		fenGestion.close();
		fenInscription.show();
	}
	
	static public void openPasPaye(){
		fenGestion.close();
		fenPasPaye.show();
	}
	
	static public void openModif(){
		fenInscription.close();
		fenModif.show();
	}
	
	static public void closeInscription(){
		fenGestion.show();
		fenInscription.close();
	}
	
	static public void closeRappel(){
		fenGestion.show();
		fenRappel.close();
	}
	
	static public void closeFacture(){
		fenGestion.show();
		fenFacture.close();
	}
	
	static public void closePasPaye(){
		fenGestion.show();
		fenPasPaye.close();
	}
	
	static public void closeModif(){
		fenInscription.show();
		fenModif.close();
	}
	
	static public void envoieAutreMail(){
		fenMailEnvoye.close();
		fenRappel.show();
	}
	
	static public void retourMenu(){
		fenMailEnvoye.close();
		fenGestion.show();
	}
	
	static public void openEnvoyerRappelPasPaye(){
		fenPasPaye.close();
		fenRappel.show();
	}
	
	static public void creerAutreFacture(){
		fenFactureGenerer.close();
		fenFacture.show();
	}
	
	static public void retourMenuFact(){
		fenFactureGenerer.close();
		fenGestion.show();
	}
	
	static public void closeVisuMail(){
		fenVisuMail.close();
		fenRappel.show();
	}
	
	static public void envoieMail(){
		fenVisuMail.close();
		fenEnvoyerMail.show();
	}
	static public void openVisuMail(){
		fenRappel.close();
		fenVisuMail.show();
	}
	
	static public void fermerVisuFact(){
		fenVisuFacture.close();
		fenFacture.show();
	}
	
	static public void openFactGenerer(){
		fenVisuFacture.close();
		fenFactureGenerer.show();
	}
	
	static public void openVisuFacture(){
		fenFacture.close();
		fenVisuFacture.show();
	}
	
	
	
	
	
	
}
