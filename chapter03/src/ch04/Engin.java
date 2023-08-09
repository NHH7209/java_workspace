package ch04;

public class Engin {

	// 자동차와 엔진에 관계에 있어서
	// 절대 상속을 사용하지 말자
	// 차와 엔진에 관계는 포함 관계로 설계 해주어야 한다.

	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	

	public Engin(String name, int price) {
		this.name = name;
		this.price = price;
	}

}
