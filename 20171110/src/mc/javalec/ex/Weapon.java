package mc.javalec.ex;

public class Weapon implements Knife, MachineGun, ShotGun{
	
	public void manyBullet() {
		System.out.println("많은 총알을 쏠 수 있습니다.");
	}
	
	public void killing() {
		System.out.println("사람을 죽일 수 있습니다.");
	}
	
	public void oneShot() {
		System.out.println("한방에 죽일 수 있습니다.");
	}
	
	public void power() {
		System.out.println("화력이 강력합니다.");
	}
	
	public void bleed() {
		System.out.println("피가 흐릅니다.");
	}
	
	public void shortDistance() {
		System.out.println("짧은 단거리용입니다.");
	}
}
