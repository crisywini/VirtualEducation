package ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import threads.ImageThread;

public class LoginController implements Initializable{
	@FXML
	private ImageView imageView;
	@FXML
	private TextField userField;
	@FXML
	private PasswordField passwordField;
	@FXML
	public void handleLogin(ActionEvent e) {
		if(isInputValid()) {
			MainController.showAlert("", "asd", AlertType.CONFIRMATION);
		}
	}
	public boolean isInputValid() {
		String errorMessage = "";
		if(userField.getText().isEmpty()) {
			errorMessage += "Please enter the user\n";
		}
		if(passwordField.getText().isEmpty()) {
			errorMessage += "Please enter the password\n";
		}
		if(errorMessage.isEmpty()) {
			return true;
		}else {
			MainController.showAlert(errorMessage, "WARNING", AlertType.WARNING);
		}
		return false;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Thread images = new ImageThread(imageView);
		images.start();
	}

}
