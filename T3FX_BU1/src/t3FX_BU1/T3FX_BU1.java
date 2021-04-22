package t3FX_BU1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class T3FX_BU1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button loeschen = new Button("löschen");
		TextField txt = new TextField();
		txt.setPrefWidth(200);

		TextField txt2 = new TextField();
		txt2.setPrefWidth(200);

		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.add(loeschen, 0, 0);
		gp.add(txt, 1, 0);
		gp.add(txt2, 1, 1);
		gp.setPadding(new Insets(10));

		loeschen.setOnAction(e -> {
			txt.clear();
			txt2.clear();
		});

		primaryStage.setScene(new Scene(gp, 350, 150));
		primaryStage.setTitle("t3FX_BU1");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
