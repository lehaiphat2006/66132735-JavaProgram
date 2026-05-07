package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;

public class Main extends Application {
	

	@Override
	public void start(Stage primaryStage) {
		//Creating a Text_Example object
		Text text1 = new Text("Hi how are you");
		//Setting font to the text
		text1.setFont(
		Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC,14)
		);
		//setting the position of the text
		text1.setX(50);
		text1.setY(75);
		//Striking through the text
		text1.setStrikethrough(true);
		//Creating a Text_Example object
		Text text2 = new Text("Welcome to Tutorialspoint");
		//Setting font to the text
		text2.setFont(
		Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR,30)
		);
		//setting the position of the text
		text2.setX(50);
		text2.setY(150);
		//underlining the text
		text2.setUnderline(true);
		//Creating a Group object
		Group root = new Group(text1, text2);
		//Creating a scene object
		Scene scene = new Scene(root, 600, 300);
		//Setting title to the Stage
		primaryStage.setTitle("Decorations Example");
		//Adding scene to the stage
		primaryStage.setScene(scene);
		//Displaying the contents of the stage
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
