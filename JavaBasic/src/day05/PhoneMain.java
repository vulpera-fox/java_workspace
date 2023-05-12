package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		
		Phone blk = new Phone();
		
		blk.info();
		
		Phone pink = new Phone("iPhone");
		
		pink.info();
		
		Phone red = new Phone("Nokia", "Red");
		
		red.info();
		
		Phone white = new Phone("Pixel", 500000);
		
		white.info();
		
		// model, color, price 를 매개변수로 받아서 초기화하는 생성자를 만들어보
		
		Phone blue = new Phone("옴니아", "Blue", 1);
		
		blue.info();
		
	}

}
