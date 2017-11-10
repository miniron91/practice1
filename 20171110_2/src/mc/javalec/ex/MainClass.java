package mc.javalec.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		Weapon weapon = new Knife(); //인터페이스는 객체 타입에만 올 수 있다.
		weapon.Attack();
		weapon.Effect();
		
		Knife knife = new Knife(); //클래스 자체를 객체 선언할 수 도있다.
		knife.Attack();
		knife.Effect();
		
		weapon = new Gun(); //위에서 선언 된 객체는 다시한번 타입을 선언하지 않아도 사용가능하다.
		weapon.Attack();
		weapon.Effect();
		
		Weapon gun = new Gun(); //인터페이스를 객체타입에 놓고, 객체선언이 가능..
		gun.Attack();
		gun.Effect();
	}

}
