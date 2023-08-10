package ch05_1;

public class Doll extends DrawingMachine{
	String origin;
	
	public Doll(String name, int price) {
		super(name, price);
		origin = "중국산";
	}
	
}
