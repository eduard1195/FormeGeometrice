package Forme;

public class Cerc extends Shape {

	public Cerc(String culoare) {
		super(culoare);
		this.nume="cerc";
	}

	@Override
	public String getNume() {
		return nume;
	}
	
	public void draw() {
		System.out.print(" " + nume);
		
	}


}
