package t3FX_TA2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_TA2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Tab auswahlTab = new Tab("Restaurantauswahl");

		Label lbl = new Label("Wählen Sie die Kuchenart aus");
		ComboBox<String> cb = new ComboBox<>(
				FXCollections.observableArrayList("Italienisch", "Griechisch", "Chinesisch"));
		VBox vb = new VBox(0, lbl, cb);
		vb.setPadding(new Insets(5));
		auswahlTab.setContent(vb);

		Tab RestaurantautTab = new Tab("RestaurantautListe");

		TableColumn<Restaurant, String> nameCol = new TableColumn<>("Restaurantname");
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		nameCol.setMinWidth(100);
		TableColumn<Restaurant, String> adresseCol = new TableColumn<>("adresse");
		adresseCol.setCellValueFactory(new PropertyValueFactory<>("adresse"));
		adresseCol.setMinWidth(100);
		TableColumn<Restaurant, String> telefonCol = new TableColumn<>("telefon");
		telefonCol.setCellValueFactory(new PropertyValueFactory<>("telefon"));
		telefonCol.setMinWidth(100);

		TableView<Restaurant> tv = new TableView<>();

		tv.getColumns().addAll(nameCol, adresseCol, telefonCol);
		RestaurantautTab.setContent(tv);

		TabPane tp = new TabPane(auswahlTab, RestaurantautTab);

		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				ObservableList<Restaurant> ol = FXCollections.observableArrayList();

				switch (arg2) {
				case "Italienisch":
					ol.add(new Restaurant("Pizaria...", "Wien", "01 120"));
					ol.add(new Restaurant("Alconto...", "Linz", "01 323"));
					ol.add(new Restaurant("Mario...", "Graz", "01 493"));
					break;

				case "Griechisch":
					ol.add(new Restaurant("Vegan...", "Steier", "01 490"));
					ol.add(new Restaurant("Vegetarisch...", "Leibnitz", "01 380"));
					ol.add(new Restaurant("Burger...", "Wienerneustadt", "01 297"));
					break;

				case "Chinesisch":
					ol.add(new Restaurant("Suchi...", "Pandorf", "01 750"));
					ol.add(new Restaurant("Suchibar...", "Baden", "01 396"));
					ol.add(new Restaurant("All you van eat...", "Neu Kirche", "01 465"));
					break;

				}
				tv.setItems(ol);

			}

		});
		primaryStage.setScene(new Scene(tp));
		primaryStage.setTitle("T3FX_TA2");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
