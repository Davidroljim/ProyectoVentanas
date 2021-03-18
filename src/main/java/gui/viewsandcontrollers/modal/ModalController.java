package gui.viewsandcontrollers.modal;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ModalController {

	
	@FXML
	private Label label;
	public void close (ActionEvent event) {
		 Node source = (Node) event.getSource();
		 Stage stage = (Stage) source.getScene().getWindow();
		 stage.close();
	}
	
}
