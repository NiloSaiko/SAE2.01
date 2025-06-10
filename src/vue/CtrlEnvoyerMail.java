package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CtrlEnvoyerMail {
	@FXML private Button bnEnvoyerAutreRappel;

    @FXML private Button bnRetourMenu;

    @FXML void clicEnvoyerAutreRappel() {
    	Main.envoieAutreMail();
    }

    @FXML void clicRetourMenu() {
    	Main.retourMenu();
    }

}
