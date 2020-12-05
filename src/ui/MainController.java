package ui;

import java.net.URL;

import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import threads.ImageThread;

public class MainController implements Initializable {

	@FXML
	private BorderPane pane;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// pane.setStyle("-fx-background-color: #c93010;");
	}

	public BorderPane getPane() {
		return pane;
	}
	public static void showAlert(String message, String title, AlertType alertType) {
		Alert alert = new Alert(alertType);
		alert.setContentText(message);
		alert.setTitle(title);
		alert.setHeaderText("");
		alert.showAndWait();
	}
}
