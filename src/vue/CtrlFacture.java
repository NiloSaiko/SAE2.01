package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CtrlFacture {
	@FXML private ToggleGroup moyenPaiementGroup;
    @FXML private TextField idField;
    @FXML private RadioButton bnCours;
    @FXML private RadioButton bnCheque;
    @FXML private RadioButton bnCoti;
    @FXML private RadioButton bnEspeces;
    @FXML private Button bnAnnuler;
    @FXML private Button bnGenerer;
    @FXML private RadioButton bnCarte;
    @FXML private ToggleGroup typeFactureGroup;
    
    @FXML void clicAnnuler() {
    	Main.closeFacture();
    }

}
