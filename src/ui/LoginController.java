package ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import threads.ImageThread;

public class LoginController implements Initializable{
	@FXML
	private ImageView imageView;
	@FXML
	public void handleLogin(ActionEvent e) {
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Thread images = new ImageThread(imageView);
		images.start();
	}

}
