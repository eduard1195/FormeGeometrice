package Forme;

import abstractions.IGraficElement;

public abstract class Shape implements IGraficElement {
	String nume;
	String culoare;
	Shape(String culoare){
		this.culoare=culoare;
	}
	public String getCuloare() {
		return culoare;
	}
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	public abstract String getNume() ;
	

}
