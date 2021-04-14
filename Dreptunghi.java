package Forme;

public class Dreptunghi extends Shape {

	public Dreptunghi(String culoare) {
		super(culoare);
		this.nume="dreptunghi";
	}

	@Override
	public String getNume() {
		return nume;
	}
	
	public void draw() {
		System.out.print(" " + nume);
		
	}

}