package application;
	
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;

public class BMI extends Application {
	@Override
	public void start(Stage primaryStage) {
		 // Label
        Label lblTitle = new Label("Ứng dụng tính BMI");

        Label lblHeight = new Label("Chiều cao (m):");
        TextField txtHeight = new TextField();

        Label lblWeight = new Label("Cân nặng (kg):");
        TextField txtWeight = new TextField();

        Button btnCalculate = new Button("Tính BMI");

        Label lblResult = new Label();
        Label lblCategory = new Label();
     // Xử lý nút bấm
        btnCalculate.setOnAction(e -> {

            try {
                double height = Double.parseDouble(txtHeight.getText());
                double weight = Double.parseDouble(txtWeight.getText());

                double bmi = weight / (height * height);

                lblResult.setText("BMI: " + String.format("%.2f", bmi));

                String category;

                if (bmi < 18.5) {
                    category = "Thiếu cân";
                } else if (bmi < 25) {
                    category = "Bình thường";
                } else if (bmi < 30) {
                    category = "Thừa cân";
                } else {
                    category = "Béo phì";
                }

                lblCategory.setText("Phân loại: " + category);

            } catch (Exception ex) {
                lblResult.setText("Vui lòng nhập đúng dữ liệu!");
                lblCategory.setText("");
            }

        });
     // Layout
        VBox root = new VBox(10);

        root.setPadding(new Insets(20));

        root.getChildren().addAll(
                lblTitle,
                lblHeight,
                txtHeight,
                lblWeight,
                txtWeight,
                btnCalculate,
                lblResult,
                lblCategory
        );

        // Scene
        Scene scene = new Scene(root, 350, 300);

        primaryStage.setTitle("BMI Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
