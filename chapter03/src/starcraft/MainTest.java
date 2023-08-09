package starcraft;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		int flag = 1;

		Scanner sc = new Scanner(System.in);

		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");

		while (flag == 1) {
			System.out.println("유닛을 선택해주세요.");
			System.out.println("1. 질럿 2. 마린 3. 저글링");
			int unitNumber = sc.nextInt();
			flag = 2;

			if (unitNumber == ZEALOT) {
				System.out.println("질럿을 선택하였습니다.");
				zealot1.showInfo();
				while (flag == 2) {
					System.out.println("누구를 공격하시겠습니까?");
					System.out.println("2. 마린 3. 저글링");
					int attackChoise = sc.nextInt();
					if (attackChoise == 2) {
						marine1.beAttacke(zealot1.power);
						marine1.showInfo();
						flag = 2;
					}
					else if(attackChoise == 3) {
						zergling1.beAttacke(zergling1.power);
						zergling1.showInfo();
						flag = 2;
					}
				}
			} else if (unitNumber == MARINE) {
				System.out.println("마린을 선택하였습니다.");
				marine1.showInfo();
				while (flag == 2) {
					System.out.println("누구를 공격하시겠습니까?");
					System.out.println("1. 질럿 3. 저글링");
					int attackChoise = sc.nextInt();
					if (attackChoise == ZEALOT) {
						zealot1.beAttacke(zealot1.power);
						marine1.showInfo();
						flag = 2;
					} else if (attackChoise == ZERGLING) {

					}
				}
			} else if (unitNumber == ZERGLING) {
				System.out.println("저글링을 선택하였습니다.");
				zergling1.showInfo();
				System.out.println("누구를 공격하시겠습니까?");
				System.out.println("1. 질럿 2. 마린");
				int attackChoise = sc.nextInt();
			} else {
				System.out.println("잘못입력하였습니다.");
				flag = 1;
			}
		} // end of while

	}
}
