package Controleur;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import vue.FenFacture;
import vue.FenGestion;
import vue.FenInscription;
import vue.FenModif;
import vue.FenPasPaye;
import vue.FenRappel;

public class Main extends Application{
	static public FenGestion fenGestion;
	static public FenFacture fenFacture;
	static public FenRappel fenRappel;
	static public FenInscription fenInscription;
	static public FenModif fenModif;
	static public FenPasPaye fenPasPaye;
	
	
	public void start(Stage f) throws IOException {
		fenGestion = new FenGestion();
		fenFacture = new FenFacture();
		fenRappel = new FenRappel();
		fenInscription = new FenInscription();
		fenModif = new FenModif();
		fenPasPaye = new FenPasPaye();
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

	
	
	
	
	
	
	
	
}
