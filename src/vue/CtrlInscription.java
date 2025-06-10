package vue;

import Controleur.Main;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import modele.Eleve;

public class CtrlInscription {
	
	@FXML private Button modifierButton;
    @FXML private TableColumn<?, ?> prenomColumn;
    @FXML private ComboBox<?> coursComboBox;
    @FXML private TableColumn<?, ?> nomColumn;
    @FXML private TableColumn<?, ?> montantColumn;
    @FXML private Button fermerButton;
    @FXML private TableView<?> inscritsTable;
    
    @FXML private TableView<Eleve> tvListeEleve;
    
    @FXML void clicFermer() {
    	Main.closeInscription();
    }
    
    @FXML void clicModif() {
    	Main.openModif();
    }
    
     @FXML void init() {
    	 TableColumn<Eleve, String> colonne1 = new TableColumn<Eleve,String>("Nom");
    	 colonne1.setCellValueFactory(new PropertyValueFactory<Eleve, String>("nom"));
    	 tvListeEleve.getColumns().set(1, colonne1);
    	 TableColumn<Eleve, String> colonne2 = new TableColumn<Eleve,String>("Prénom");
    	 colonne2.setCellValueFactory(new PropertyValueFactory<Eleve, String>("prenom"));
    	 tvListeEleve.getColumns().set(2, colonne2);
    	 TableColumn<Eleve,Integer> colonne3 = new TableColumn<Eleve,Integer>("Montant Payé");
    	 colonne3.setCellValueFactory(new PropertyValueFactory<Eleve, Integer>("montanyPaye"));
    	 tvListeEleve.getColumns().set(3, colonne3);
  	 

    	 tvListeEleve.setItems(Main.getLesEleves());
    	 tvListeEleve.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    	 

    	 BooleanBinding rien = Bindings.equal(tvListeEleve.getSelectionModel().selectedIndexProperty(), -1);

    	 

    	 modifierButton.disableProperty().bind(rien);



     }

}
