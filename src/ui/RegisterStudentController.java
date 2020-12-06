/**
 * Sample Skeleton for 'registerStuden.fxml' Controller Class
 */

package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Course;
import model.Register;

public class RegisterStudentController {

	@FXML // fx:id="codeTxt"
	private TextField codeTxt; // Value injected by FXMLLoader

	@FXML // fx:id="tableView"
	private TableView<Course> tableView; // Value injected by FXMLLoader

	@FXML // fx:id="codeTC"
	private TableColumn<Course, String> codeTC; // Value injected by FXMLLoader

	@FXML // fx:id="courseTC"
	private TableColumn<Course, String> courseTC; // Value injected by FXMLLoader

	@FXML // fx:id="pŕiceTC"
	private TableColumn<Course, String> priceTC; // Value injected by FXMLLoader
	private Register register;
	private StudentsController lastController;

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public StudentsController getLastController() {
		return lastController;
	}

	public void setLastController(StudentsController lastController) {
		this.lastController = lastController;
		initTableView();
	}

	@FXML
	void addCourse(ActionEvent event) {

	}

	@FXML
	void goBackButton(ActionEvent event) {
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {

	}

	private void initTableView() {
		codeTC.setCellValueFactory(new PropertyValueFactory<Course, String>("id"));
		courseTC.setCellValueFactory(new PropertyValueFactory<Course, String>("name"));
		priceTC.setCellValueFactory(new PropertyValueFactory<Course, String>("description"));
		tableView.getItems().clear();
		tableView.getItems().addAll(
				lastController.getLastController().getMainController().getMain().getVirtualSchool().getCourses());
	}
}
