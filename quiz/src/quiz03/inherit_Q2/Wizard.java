package quiz03.inherit_Q2;

public class Wizard extends Player {
 	//Player클래스로 상속관계를 만들어 주세요
	//마법사는 생성될 때 ★이름만 매개변수로 받고, hp = 50, mp = 100이 됩니다.
	//마법사는 강력한 iceArrow()를 가지고 있습니다
	//iceArrow()는 호출될떄마다 mp를 -20씩 감소시킵니다

	Wizard(String n) {
		name = n;
		hp = 50;
		mp = 100;
	}
	void iceArrow() {
		if ( mp >= 20 ) {
			mp -= 20;
			System.out.println(name + "의 얼음화살");
		} else {
			System.out.println("마나가 부족합니다.");
		}
		System.out.println("현재 마나량은 " + mp + " 입니다");
	}
}