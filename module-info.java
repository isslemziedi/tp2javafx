module tp2javafx {
	requires javafx.controls;
	requires javafx.base;
	
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	exports example;
	opens example to javafx.fxml;

}
