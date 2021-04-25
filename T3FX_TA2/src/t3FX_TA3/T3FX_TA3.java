package t3FX_TA3;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

public class T3FX_TA3 extends Application {

	@Override
	public void start(Stage primaryStage) {
		TreeItem<String> rb = new TreeItem<>("Ruderboote");
		TreeItem<String> sb = new TreeItem<>("Segelboote");
		TreeItem<String> mb = new TreeItem<>("Motorboote");
		TreeItem<String> b = new TreeItem<>("boote");

		b.getChildren().addAll(rb, sb, mb);
		b.setExpanded(true);
		TreeView<String> tv = new TreeView<>(b);
		tv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

		tv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<String>> arg0, TreeItem<String> arg1,
					TreeItem<String> arg2) {
				if (!arg2.getValue().equals("Boote")) {
					BootListDialog bld = new BootListDialog(arg2.getValue());
					bld.showAndWait();
				}

			}

		});
		primaryStage.setScene(new Scene(tv));
		primaryStage.setTitle("T3FX_TA3");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
