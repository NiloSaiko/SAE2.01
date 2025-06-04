package Controleur;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import vue.FenFacture;
import vue.FenGestion;
import vue.FenInscription;
import vue.FenModif;
import vue.FenPasPaye;
import vue.FenetreRappel;

public class Main extends Application{
	static public FenGestion fenGestion;
	static public FenFacture fenFacture;
	static public FenetreRappel fenRappel;
	static public FenInscription fenInscription;
	static public FenModif fenModif;
	static public FenPasPaye fenPasPaye;
	
	
	public void start(Stage f) throws IOException {
		fenGestion = new FenGestion();
		fenFacture = new FenFacture();
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
	

	
	
	
	
	
	
	
	
}
