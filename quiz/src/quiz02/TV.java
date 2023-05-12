package quiz02;

public class TV {

	String company = "LG";
	int channel; // 채널
	boolean power; // 전원
	
	/*
	 * 
	 * 메소드
	 * changeChannel : int - 매개변수 x번을 받아서 채널을 변경, 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 혹은 그 반대의 동작
	 * 
	 */
	
	int changeChannel(int ch) {
		channel = ch;
		System.out.println(ch + "번 채널로 변경합니다.");
		return channel;
	}
	void power() {
		if (power == true) {
			power = false;
		} else {
			power = true;
		}
	}
}
