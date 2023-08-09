package ch04;

public class Car {

	private String name;
	private int price;
	// 포함 관계
	private Engin engin;
	
	public Car(String name, int price, Engin engin) {
		this.name = name;
		this.price = price;
		this.engin = engin;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Engin getEngin() {
		return engin;
	}

	

}
