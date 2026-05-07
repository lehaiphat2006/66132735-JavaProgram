package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//Creating a Text object
		Text text = new Text();
		//Setting font to the text
		text.setFont(new Font(45));
		//setting the position of the text
		text.setX(50);
		text.setY(150);
		//Setting the text to be added.
		text.setText("Welcome to Tutorialpoint");
		//Creating a Group object
		Group root = new Group();
		//Retrieving the observable list object
		ObservableList list = root.getChildren();
		//Setting the text object as a node to the group object
		list.add(text);
		//Creating a scene object
		Scene scene = new Scene(root, 600, 300);
		//Setting title to the Stage
		primaryStage.setTitle("Sample Application");
		//Adding scene to the stage
		primaryStage.setScene(scene);
		//Displaying the contents of the stage
		primaryStage.show();


	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
