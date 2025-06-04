package vue;

import Controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CtrlGestion {
	
	@FXML private Button bnCotiAnnuelle;
    @FXML private Button bnEnvoiRappel;
    @FXML private Button bnGererFact;
    @FXML private Button bnQuitter;
    @FXML private Button bnAffichListe;
 // clic sur bouton Fermer
    @FXML void clicFermer(ActionEvent event) {
    	Main.fermerAppli();
    }

}
