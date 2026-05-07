package lehaiphat.javafx;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.stage.Stage;

public class Vdjavafx extends Application {
@Override
public void start(Stage primaryStage) throws Exception{
	// tạo một nút bấm 
	Button btn =new Button();
	//
	btn.setText("Xin chào Javafx");
	//tạo cửa sổ 
	StackPane root=new StackPane();
	
	root.getChildren().add(btn);
	// màn hình /cảnh hiển thị
	Scene scn=new Scene(root,400,200);
	
	primaryStage.setTitle("Hello World!");
	primaryStage.setScene(scn);
	primaryStage.show();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 launch(args);
	}

}
