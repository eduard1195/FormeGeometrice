package Forme;

public class Triunghi extends Shape {

	public Triunghi(String culoare) {
		super(culoare);
		this.nume="triunghi";
	}

	@Override
	public String getNume() {
		return nume;
	}
	
	public void draw() {
		System.out.print(" " + nume);
		
	}

}
