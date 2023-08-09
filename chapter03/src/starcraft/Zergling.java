package starcraft;

public class Zergling extends Unit{

	public Zergling(String name) {
		super(name);
		super.power = 2;
		super.hp = 45;
	}
	public void attack(Marine marine) {
		marine.beAttacke(super.power);
		System.out.println(name + "가" + marine.getName() + "을 공격합니다.");
	}
	public void attack(Zealot zealot) {
		zealot.beAttacke(super.power);
		System.out.println(name + "가" + zealot.getName() + "을 공격합니다.");
	}
}
