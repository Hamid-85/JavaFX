package t3FX_BU2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_BU2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		ToggleGroup tg=new ToggleGroup();
		RadioButton rb1=new RadioButton("RadioButton 1");
		rb1.setToggleGroup(tg);
		RadioButton rb2=new RadioButton("RadioButton 2");
		rb2.setToggleGroup(tg);
		RadioButton rb3=new RadioButton("RadioButton 3");
		rb3.setToggleGroup(tg);
		
		Label lb1=new Label();
		lb1.setPrefWidth(200);
		//variant 1
		tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
		

			@Override
			public void changed(ObservableValue<? extends Toggle> arg0, Toggle arg1, Toggle arg2) {
				if(rb1.isSelected())
					lb1.setText("RadioButton 1 ausgewelt");
				else if(rb2.isSelected())
					lb1.setText("RadioButton 2 ausgewelt");
				else if(rb3.isSelected())
					lb1.setText("RadioButton 3 ausgewelt");
			}});		
		

		// 10 pixel Abstand zwischen zeillen
		VBox vb=new VBox(10,rb1,rb2,rb3,lb1);
		vb.setPadding(new Insets(5));
		
		
		
		primaryStage.setScene(new Scene(vb,350,150));
		primaryStage.setTitle("t3FX_BU2");
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
