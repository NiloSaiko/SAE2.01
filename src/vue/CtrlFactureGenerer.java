package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CtrlFactureGenerer {
	@FXML
    private Button bnGenererAutreFacture;

    @FXML
    private Button bnRetourMenu;

    @FXML void clicCreerAutreFacture() {
    	Main.creerAutreFacture();
    }

    @FXML void clicRetourMenu() {
    	Main.retourMenuFact();
    }

}
