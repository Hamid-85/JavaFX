package t3FX_BU4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_BU4 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label ergebnis = new Label();
		ergebnis.setPrefWidth(200);
		Button loeschen = new Button("löschen");
		loeschen.setPrefWidth(200);

		Label lblOp1 = new Label("Operand 1");
		Label lblOp2 = new Label("Operand 2");

		TextField txtOp1 = new TextField();
		txtOp1.setPrefWidth(100);
		TextField txtOp2 = new TextField();
		txtOp2.setPrefWidth(100);

		Button add = new Button("+");
		add.setPrefWidth(30);
		Button sub = new Button("-");
		sub.setPrefWidth(30);
		Button multi = new Button("*");
		multi.setPrefWidth(30);
		Button div = new Button("/");
		div.setPrefWidth(30);

		add.setOnAction(e -> ergebnis.setText(berechnen(txtOp1.getText(), txtOp2.getText(), '+')));
		sub.setOnAction(e -> ergebnis.setText(berechnen(txtOp1.getText(), txtOp2.getText(), '-')));
		multi.setOnAction(e -> ergebnis.setText(berechnen(txtOp1.getText(), txtOp2.getText(), '*')));
		div.setOnAction(e -> ergebnis.setText(berechnen(txtOp1.getText(), txtOp2.getText(), '/')));
		loeschen.setOnAction(e -> {
			ergebnis.setText("");
			txtOp1.clear();
			txtOp2.clear();
		});
		GridPane gp = new GridPane();
		gp.add(ergebnis, 0, 0, 2, 1);

		gp.add(loeschen, 0, 1, 2, 1);

		gp.add(lblOp1, 0, 2);
		gp.add(lblOp2, 0, 3);
		gp.add(txtOp1, 1, 2);
		gp.add(txtOp2, 1, 3);
		gp.add(add, 2, 0);
		gp.add(sub, 2, 1);
		gp.add(multi, 2, 2);
		gp.add(div, 2, 3);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(5));

		VBox vb = new VBox(gp);

		primaryStage.setScene(new Scene(vb, 350, 150));
		primaryStage.setTitle("T3FX_BU4");
		primaryStage.show();
	}

	private String berechnen(String operand1, String operand2, char operator) {
		try {
			double zahl1 = Double.parseDouble(operand1);
			double zahl2 = Double.parseDouble(operand2);
			double ergebnis = 0;
			switch (operator) {
			case '+':
				ergebnis = zahl1 + zahl2;
				break;
			case '-':
				ergebnis = zahl1 - +zahl2;
				break;
			case '*':
				ergebnis = zahl1 * zahl2;
				break;
			case '/':
				ergebnis = zahl1 / zahl2;
				break;
			}
			return operand1 + " +operator + " + operand2 + "=" + ergebnis;
		} catch (NumberFormatException e) {
			new Alert(AlertType.ERROR, "Fehlerhafte zahl eingegeben").showAndWait();
			return "";
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
