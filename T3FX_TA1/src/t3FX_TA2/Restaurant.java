package t3FX_TA2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Restaurant {
	private StringProperty name;
	private StringProperty adresse;
	private StringProperty telefon;
	public Restaurant(String n, String a, String t) {
		super();
		name = new SimpleStringProperty(n);
		adresse = new SimpleStringProperty(a);
		telefon = new SimpleStringProperty(t);
	}
	//liefert name von restaurant 
	public String getName() {
		return name.get();
	}
	public void setName(String v) {
	name.set(v);
	}
	//liefert gesamte property Objekt
	public StringProperty  nameProperty() {
		return name;
	}
	public String getAdresse() {
		return adresse.get();
	}
	public void setAdresse(String v) {
		adresse.set(v);
		}
	public StringProperty  adresseProperty() {
		return adresse;
	}
	public String getTelefon() {
		return telefon.get();
	}
	public void setTelefon(String v) {
		telefon.set(v);
		}
	public StringProperty  telefonProperty() {
		return telefon;
	}
	
	

}
