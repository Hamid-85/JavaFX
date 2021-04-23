package t3FX_bl1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Katze {
	private StringProperty name;
	private IntegerProperty alter;

	public Katze(String n, int a) {
		name = new SimpleStringProperty(n);
		alter = new SimpleIntegerProperty(a);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String n) {
		name.set(n);
		;
	}

	public StringProperty nameProperty() {
		return name;
	}

	public int getAlter() {
		return alter.get();
	}

	public void setAlter(int a) {
		alter.set(a);
	}

	public IntegerProperty alterProperty() {
		return alter;
	}

}
