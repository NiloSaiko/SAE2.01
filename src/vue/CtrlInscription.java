package vue;

import Controleur.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CtrlInscription {
	
	@FXML private Button modifierButton;
    @FXML private TableColumn<?, ?> prenomColumn;
    @FXML private ComboBox<?> coursComboBox;
    @FXML private TableColumn<?, ?> nomColumn;
    @FXML private TableColumn<?, ?> montantColumn;
    @FXML private Button fermerButton;
    @FXML private TableView<?> inscritsTable;
    
    @FXML void clicFermer() {
    	Main.closeInscription();
    }
    
    @FXML void clicModif() {
    	Main.openModif();
    }
    
    

}
