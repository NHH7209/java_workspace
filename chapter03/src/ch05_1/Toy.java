package ch05_1;

public class Toy extends DrawingMachine{
	String origin;
	
	public Toy(String name, int price) {
		super(name, price);
		origin = "중국";
	}
}
