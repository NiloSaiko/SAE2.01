package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CtrlModif {
	@FXML private TextField montantField;
    @FXML private TextField idField;
    @FXML private TextField prenomField;
    @FXML private DatePicker datePaiementPicker;
    @FXML private Button bnAnnuler;
    @FXML private TextField nomField;
    @FXML private Button bnEnregistrer;
    @FXML private Button bnSuppMembre;
    
    @FXML void clicAnnuler() {
    	Main.closeModif();
    }
    
    @FXML void clicEnregistrer() {
    	Main.closeModif();
    }
    
}
