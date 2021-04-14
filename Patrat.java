package Forme;

public class Patrat extends Shape {

	public Patrat(String culoare) {
		super(culoare);
		this.nume="patrat";
	}

	@Override
	public String getNume() {
		return nume;
	}

	public void draw() {
		System.out.print(" " + nume);
		
	}

	
}
