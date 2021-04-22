package t3FX_BU3;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_BU3 extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		CheckBox cb1 = new CheckBox("CheckBox 1");
		cb1.setAllowIndeterminate(true);
		cb1.setPrefWidth(100);
		
		CheckBox cb2 = new CheckBox("CheckBox 2");
		cb2.setAllowIndeterminate(true);
		cb2.setPrefWidth(100);

		TextField txt = new TextField();
		txt.setStyle("-fx-text-fill: red;");

		cb1.setOnAction(e -> {
			txt.clear();
			if (cb1.isSelected())
				txt.setText("CheckBox 1 is selected...");
			if (cb1.isIndeterminate())
				txt.setText("CheckBox 1 is indeterminate...");
			if (cb2.isSelected())
				txt.appendText("CheckBox 2 is selected...");
			if (cb2.isIndeterminate())
				txt.appendText("CheckBox 2 is indeterminate...");
		});
		cb2.setOnAction(e -> {
			txt.clear();
			if (cb1.isSelected())
				txt.setText("CheckBox 1 is selected...");
			if (cb1.isIndeterminate())
				txt.setText("CheckBox 1 is indeterminate...");
			if (cb2.isSelected())
				txt.appendText("CheckBox 2 is selected...");
			if (cb2.isIndeterminate())
				txt.appendText("CheckBox 2 is indeterminate...");

		});

		VBox vb = new VBox(10, cb1, cb2, txt);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 350, 150));
		primaryStage.setTitle("t3FX_BU3");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
