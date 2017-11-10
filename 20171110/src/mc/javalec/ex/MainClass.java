package mc.javalec.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		Weapon weapon = new Weapon();
		weapon.manyBullet();
		weapon.killing();
		weapon.oneShot();
		weapon.power();
		weapon.bleed();
		weapon.shortDistance();
		
		
		
		MachineGun machinegun = new Weapon() {
		
		public void manyBullet() {
			System.out.println("많은 총알");
		}
		
		public void killing() {
			System.out.println("많은 죽임");
		}
		};
	
		machinegun.manyBullet();
		machinegun.killing();
		
		ShotGun shotgun = new Weapon();
		shotgun.oneShot();
		shotgun.power();
		
		Knife knife = new Weapon();
		knife.bleed();
		knife.shortDistance();
		
		
	}

}
