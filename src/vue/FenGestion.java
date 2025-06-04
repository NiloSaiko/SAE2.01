package vue;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenGestion extends Stage  {
	public FenGestion() throws IOException {
		Scene laScene;
		laScene = new Scene(creerSceneGraph());
		this.setTitle("Gestion");
		this.setScene(laScene);
		this.sizeToScene();
		this.setResizable(false);
	}
	
	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/home/etuinfo/esmmartin/Documents/S2/SAE2.01/SAE2.01/bin/gestion.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
		Pane racine = loader.load();
		return racine;

	}


}