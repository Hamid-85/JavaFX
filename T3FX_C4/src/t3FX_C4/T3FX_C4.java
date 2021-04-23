package t3FX_C4;

import java.net.URI;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_C4 extends Application {

	@Override
	public void start(Stage primaryStage) {

		Label lbl = new Label("Wählen Sie die Hunderasse aus");
		ComboBox<String> cb = new ComboBox<>();
		cb.setItems(FXCollections.observableArrayList("Husky", "German Shepherd", "Hunter"));

		cb.getSelectionModel().select(0);

		Label lblBild = new Label();

		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {

				switch (arg2) {
				case "Husky":
					URI uri = Paths.get("C:\\Java\\Hund\\husky.jpeg").toUri();

					ImageView iv = new ImageView(uri.toString());
					iv.setPreserveRatio(true);
					iv.setFitWidth(300);
					lblBild.setGraphic(iv);
					break;

				case "German Shepherd":
					URI uri1 = Paths.get("C:\\Java\\Hund\\German.png").toUri();

					ImageView iv1 = new ImageView(uri1.toString());
					iv1.setPreserveRatio(true);
					iv1.setFitWidth(300);
					lblBild.setGraphic(iv1);
					break;
				case "Hunter":
					URI uri2 = Paths.get("C:\\Java\\Hund\\Hunter.jpg").toUri();

					ImageView iv2 = new ImageView(uri2.toString());
					iv2.setPreserveRatio(true);
					iv2.setFitWidth(300);
					lblBild.setGraphic(iv2);
					break;
				}
			}

		});

		VBox vb = new VBox(10, lbl, cb, lblBild);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 350, 500));
		primaryStage.setTitle("T3FX_C4");

		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
