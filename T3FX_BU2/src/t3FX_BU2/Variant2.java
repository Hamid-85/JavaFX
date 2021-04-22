package t3FX_BU2;

import java.awt.Color;

import javax.swing.JTextArea;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Variant2 extends Application {
	Slider[] slider = new Slider[4];

	@Override
	public void start(Stage primaryStage) {
		Slider[] slider = new Slider[4];

		ToggleGroup tg = new ToggleGroup();
		RadioButton rb1 = new RadioButton("Button 1");
		rb1.setToggleGroup(tg);

		RadioButton rb2 = new RadioButton("Button 2");
		rb2.setToggleGroup(tg);
		RadioButton rb3 = new RadioButton("Button 3");
		rb3.setToggleGroup(tg);

		Label lbl = new Label();
		lbl.setStyle("-fx-text-fill: red;");
		

		rb1.setOnAction(e -> {

			if (rb1.isSelected())
				lbl.setText("Button 1 is selected");

		});
		rb2.setOnAction(e -> {

			if (rb2.isSelected())
				lbl.setText("Button 2 is selected");

		});
		rb3.setOnAction(e -> {

			if (rb3.isSelected())
				lbl.setText("Button 3 is selected");

		});

		VBox vb = new VBox(10, rb1, rb2, rb3, lbl);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 350, 150));
		primaryStage.setTitle("t3FX_BU2");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
