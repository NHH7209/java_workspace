package ch05_1;

public class DrawingMachine {
	
	String name;
	int price;
	
	public DrawingMachine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
