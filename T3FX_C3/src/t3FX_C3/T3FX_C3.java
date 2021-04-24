package t3FX_C3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T3FX_C3 extends Application {

	@Override
	public void start(Stage primaryStage) {

		Label lb1 = new Label("Wählen Sie das Format der Datenanzeige aus.");
		ComboBox<String> cb = new ComboBox<>(FXCollections.observableArrayList("Vollständig", "Lang", "Kurz"));
		Label lblText = new Label();
		
		lblText.setFont(Font.font(15));
		lblText.setStyle("-fx-text-fill: blue;");


		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case "Vollständig":
					lblText.setText(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
					break;
				case "Lang":
					lblText.setText(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
					break;
				case "Kurz":
					lblText.setText(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
					break;

				}
			}

		});

		VBox vb = new VBox(10, lb1, cb, lblText);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 350, 150));
		primaryStage.setTitle("T3FX_C3");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
