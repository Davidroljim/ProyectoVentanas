package gui.viewsandcontrollers.modal;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ModalController {

	
	@FXML
	private Label label;
	
	
	
	@FXML
	public void cerrarventana (ActionEvent event) {
		 Node source = (Node) event.getSource();
		 Stage stage = (Stage) source.getScene().getWindow();
		 stage.close();
	}
	
}
