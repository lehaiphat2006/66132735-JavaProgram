package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//Creating a line object
		Line line = new Line();
		//Setting the properties to a line
		line.setStartX(100.0);
		line.setStartY(150.0);
		line.setEndX(500.0);
		line.setEndY(150.0);
		//Creating a Group
		Group root = new Group(line);
		//Creating a Scene
		Scene scene = new Scene(root, 600, 300);
		//Setting title to the scene
		primaryStage.setTitle("Sample application");
		//Adding the scene to the stage
		primaryStage.setScene(scene);
		//Displaying the contents of a scene
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
