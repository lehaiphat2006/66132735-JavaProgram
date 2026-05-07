module hienthi2text_javafx {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
