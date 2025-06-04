package vue;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class CtrlPasPaye {
	
	@FXML private RadioButton coursRadio;
    @FXML private TableColumn<?, ?> prenomColumn;
    @FXML private TableColumn<?, ?> montantDuColumn;
    @FXML private TableColumn<?, ?> coursColumn;
    @FXML private RadioButton saisonRadio;
    @FXML private TableView<?> membersTable;
    @FXML private RadioButton alphaRadio;
    @FXML private ComboBox<?> filterComboBox;
    @FXML private Button bnEnvoyerRappel;
    @FXML private TableColumn<?, ?> montantPayeColumn;
    @FXML private ToggleGroup trierBouton;
    @FXML private Button bnQuitter;
    @FXML private TableColumn<?, ?> nomColumn;
    @FXML private TableColumn<?, ?> idColumn;

}
