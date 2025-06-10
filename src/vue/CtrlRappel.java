package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CtrlRappel {
	@FXML private TextField idField;
    @FXML private TextField prenomField;
    @FXML private RadioButton rbNov20;
    @FXML private ToggleGroup dateBouton;
    @FXML private Button bnAnnuler;
    @FXML private TextField nomField;
    @FXML private Button bnVisualiser;
    @FXML private RadioButton rbNov2;
    
    @FXML void clicAnnuler() {
    	Main.closeRappel();
    }
    @FXML void clicVisuMail() {
    	Main.openVisuMail();
    }
    

}
