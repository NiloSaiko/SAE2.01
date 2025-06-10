package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CtrlVisuMail {
	@FXML private Button bnEnvoyerMail;

    @FXML private Button bnAnnulerVisuMail;
    
    @FXML void clicAnnuler() {
    	Main.closeVisuMail();
    }
    
    @FXML void clicEnvoyer() {
    	Main.envoieMail();
    }
    

}
