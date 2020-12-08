package ui;

import java.io.IOException;

import customExceptions.EntityRepeatedException;
import customExceptions.NullEntityException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.VirtualSchool;

/**
 * The Class Main.
 */
public class Main extends Application {

	/** The school. */
	private final VirtualSchool school = new VirtualSchool("SAI");

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Start.
	 *
	 * @param primaryStage the primary stage
	 */
	@Override
	public void start(Stage primaryStage) {
		loadSplash();
	}

	/**
	 * Load splash.
	 */
	void loadSplash() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("splash.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			SplashController controller = loader.getController();
			controller.setStage(stage);
			controller.setMain(this);
			controller.initThread();
			
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Load main.
	 *
	 * @param primaryStage the primary stage
	 */
	public void loadMain(Stage primaryStage) {
		loadDefaultData();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
			Parent root = loader.load();
			MainController controller = loader.getController();
			controller.setMain(this);
			controller.getLoginController().setMainController(controller);
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setOnCloseRequest(closer);
			primaryStage.setTitle(school.getName());
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** The closer. */
	private final EventHandler<WindowEvent> closer = new EventHandler<WindowEvent>() {

		@Override
		public void handle(WindowEvent event) {
			System.exit(0);
		}
	};

	/**
	 * Load default data.
	 */
	public void loadDefaultData() {
		try {
			school.addTeacher("12234", "Carlos", "Samper", "root", 3500000);
			school.addTeacher("12235", "Alberto", "Samper", "root", 3500000);
			school.addTeacher("12236", "Camila", "Samper", "root", 3500000);
			school.addTeacher("12237", "Beatriz", "Samper", "root", 3500000);
			school.addTeacher("12238", "Delio", "Samper", "root", 3500000);

			school.addStudents("60001", "Amanda", "Medina", "student");
			school.addDirector("12345", "Roberto", "Gomez", "root1", 5000000);
			school.addCourse("1", "Biology", "Biology for 6th grade");
			school.addCourse("2", "History", "History for 6th grade");
			school.addCourse("3", "History", "History for 6th grade");

			school.getCourses().get(0).setTeacher(school.getTeachers().get(0));
			school.getCourses().get(1).setTeacher(school.getTeachers().get(0));
			school.getCourses().get(2).setTeacher(school.getTeachers().get(0));
			school.getTeachers().get(0).addCourse("1");
			school.getTeachers().get(0).addCourse("2");
			school.getTeachers().get(0).addCourse("3");
		} catch (NullEntityException e) {
			e.printStackTrace();
		} catch (EntityRepeatedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the virtual school.
	 *
	 * @return the virtual school
	 */
	public VirtualSchool getVirtualSchool() {
		return school;
	}
}
