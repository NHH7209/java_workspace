package ch05_1;

import java.util.Random;

import ch05.Banana;
import ch06.Animal;

public class DrawingMainTest1 {

	public static void main(String[] args) {

		DrawingMachine[] dm = new DrawingMachine[3];
		dm[0] = new Doll("곰인형", 5_000);
		dm[1] = new Toy("로봇장난감", 8_000);
		dm[2] = new Electro("게임기", 1_0000);
		int coin  = 0;
		
		Random random = new Random();
		int selected = random.nextInt(3);

		System.out.println(selected);
		dm[selected].showInfo();
		
		if (selected == 0) {
			String checkOrigin = ((Doll)dm[0]).origin;
			System.out.println(checkOrigin);
		} else if (selected == 1) {
			String checkOrigin = ((Toy)dm[1]).origin;
			System.out.println(checkOrigin);
		} else if (selected == 2) {
			String checkOrigin = ((Electro)dm[2]).origin;
			System.out.println(checkOrigin);
		}else {
			System.out.println("시스템 오류");
		}
	}
}
