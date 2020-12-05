package ui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
}
