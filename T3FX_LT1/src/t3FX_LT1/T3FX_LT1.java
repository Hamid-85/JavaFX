package t3FX_LT1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class T3FX_LT1 extends Application {

	@Override
	public void start(Stage primaryStage) {

		TextField txt1 = new TextField();
		txt1.setPrefWidth(100);
		txt1.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
		Label lb11 = new Label();
		lb11.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.DOTTED, null, new BorderWidths(2))));
		lb11.setPrefWidth(200);
		
		TextField txt2 = new TextField();
		txt2.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
		txt2.setPrefWidth(100);
		Label lb12 = new Label();
		lb12.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.DOTTED, null, new BorderWidths(2))));
		lb12.setPrefWidth(200);
		
		TextField txt3 = new TextField();
		txt3.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
		txt3.setPrefWidth(100);
		Label lb13 = new Label();
		lb13.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.DOTTED, null, new BorderWidths(2))));
		lb13.setPrefWidth(200);

		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(5));
		gp.add(txt1, 0, 0);
		gp.add(lb11, 1, 0);
		gp.add(txt2, 0, 1);
		gp.add(lb12, 1, 1);
		gp.add(txt3, 0, 2);
		gp.add(lb13, 1, 2);

		txt1.setOnAction(e -> lb11.setText(txt1.getText()));
		txt2.setOnAction(e -> lb12.setText(txt2.getText()));
		txt3.setOnAction(e -> lb13.setText(txt3.getText()));

		primaryStage.setScene(new Scene(gp,350,150));
		primaryStage.show();

		primaryStage.setTitle("t3FX_LT1");

	}

	public static void main(String[] args) {
		launch(args);
	}
}
