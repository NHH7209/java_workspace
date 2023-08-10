package ch05_1;

public class Electro extends DrawingMachine{

	String origin;
	
	public Electro(String name, int price) {
		super(name, price);
		origin = "중국산";
	}
}
