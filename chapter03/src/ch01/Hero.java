package ch01;

public class Hero {
	
	int power;
	int level;
	int hp;
	
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.name = "전사1";
		System.out.println(w1.name);
	}
}

class Warrior extends Hero{
	String name;
}
