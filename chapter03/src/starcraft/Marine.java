package starcraft;

public class Marine extends Unit{
	
	public Marine(String name) {
		super(name);
		super.power = 7;
		super.hp = 70;
	}
	public void attack(Zealot zealot) {
		zealot.beAttacke(super.power);
		System.out.println(name + "가" + zealot.getName() + "을 공격합니다.");
	}
	public void attack(Zergling zergling) {
		zergling.beAttacke(super.power);
		System.out.println(name + "가" + zergling.getName() + "을 공격합니다.");
		
	}
}
