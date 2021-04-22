package t3FX_HV2;

import java.net.URI;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T3FX_HV2 extends Application {

	@Override
	public void start(Stage primaryStage) {

		Label lblbundesland = new Label("Bundesland: ");
		lblbundesland.setPrefWidth(300);
		lblbundesland.setFont(Font.font(15));
		
		
		Label lblSalzburg = new Label("Salzburg");
		lblSalzburg.setPrefWidth(300);
		lblSalzburg.setFont(Font.font(15));
		
		
		Label lbleinwohner = new Label("Einwohner: ");
		lbleinwohner.setPrefWidth(300);
		lbleinwohner.setFont(Font.font(15));
		
		Label lb1einwohnern = new Label("1604 Einwohnern (Stand 1. Jänner 2020)");
		lb1einwohnern.setPrefWidth(300);
		lb1einwohnern.setFont(Font.font(15));

		GridPane gp = new GridPane();
		gp.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));
		gp.setPrefHeight(100);
		gp.setVgap(30);
		gp.add(lblbundesland, 0, 0);
		gp.add(lblSalzburg, 1, 0);
		gp.add(lbleinwohner, 0, 1);
		gp.add(lb1einwohnern, 1, 1);

		Label bildtext = new Label("Attersee/Steiermark");
		bildtext.setPrefWidth(300);
		bildtext.setFont(Font.font(17));
		bildtext.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));

		Label bild = new Label();
        URI uri = Paths.get("C:\\Java\\Attersee.jpg").toUri();
		ImageView iv = new ImageView(uri.toString());
		iv.setPreserveRatio(true);
		iv.setFitWidth(500);
		bild.setGraphic(iv);
		HBox hb2 = new HBox(10, bildtext, bild);
		hb2.setPadding(new Insets(5));

		VBox vb = new VBox(10, gp, hb2);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 700, 500));
		primaryStage.setTitle("t3FX_HV2");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
