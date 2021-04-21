package helloJavaFXWorld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFXWorld extends Application {
	private int i = 1;

	@Override
	public void start(Stage primaryStage) {

		Label lb1 = new Label("Hello JavaFX world");

		Button btn = new Button("Hier Klicken");

		btn.setOnAction(e -> {
			btn.setText("Nicht so fest(" + i++ + ")");

		});

		VBox vb = new VBox(10, lb1, btn);

		Scene scene = new Scene(vb,350,150);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello world");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
