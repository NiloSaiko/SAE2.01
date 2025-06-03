/**
 * 
 */
/**
 * 
 */
module SAE2_01 {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens vue to javafx.graphics, javafx.fxml;
	opens modele to javafx.graphics, javafx.fxml;
	opens Controleur to javafx.graphics, javafx.fxml;
}