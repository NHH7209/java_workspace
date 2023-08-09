package ch05_1;

import java.util.Random;

import ch06.Animal;

public class DrawingMainTest1 {

	public static void main(String[] args) {

		Random random = new Random();
		int selected = random.nextInt(3)  ;
		DrawingMachine[] dm = new DrawingMachine[3];
		dm[0] = new Doll("곰인형", 5_000);
		dm[1] = new Toy("로봇장난감", 8_000);
		
		System.out.println(selected);
		System.out.println(dm[selected]);
		if(selected == 0) {
			doll.
		}
		
	}
}
