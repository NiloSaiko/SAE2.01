package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CtrlVisuFacture {
	@FXML
    private Button bnEnvoyerMail;

    @FXML
    private Button bnAnnulerVisuMail;

    @FXML
    void annulerFActure() {
    	Main.fermerVisuFact();
    }

    @FXML
    void envoyerFacture() {
    	Main.openFactGenerer();
    }


}
