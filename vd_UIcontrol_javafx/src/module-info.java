module vd_UIcontrol_javafx {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
