package t3FX_D3;

import javafx.geometry.Insets;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ErgebnisDialog extends Dialog<ButtonType>{
		
	
	public ErgebnisDialog(int zahl,int exponent) {
			
			Label lbl=new Label(zahl+"**"+exponent+"="+Math.pow(zahl, exponent));
			VBox vb=new VBox(10,lbl);
			vb.setPadding(new Insets(5));
			this.getDialogPane().setContent(vb);
			this.getDialogPane().getButtonTypes().addAll(ButtonType.OK,ButtonType.CANCEL);
	}

}
