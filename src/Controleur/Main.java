package Controleur;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import vue.FenGestion;

public class Main extends Application{
	static public FenGestion		fenGestion;


	
	public void start(Stage f) throws IOException {
		fenGestion = new FenGestion();
		fenGestion.show();
	}
	
	public static void main(String args[]) {
		Application.launch();
	}
	
	static public void fermerAppli() {
		System.exit(0);
	}
	

	
	
	
	
	
	
	
	
}
