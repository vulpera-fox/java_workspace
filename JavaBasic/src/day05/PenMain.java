package day05;

public class PenMain {

	public static void main(String[] args) {

		// 펜을 사용하려면 객체로 생성해야한다

		Pen red = new Pen();

		red.ink = "빨강";
		red.price = 2000;
		red.company = "빨간펜";

		red.write();

		Pen blk = new Pen();
		blk.ink = "검정";
		blk.price = 3000;
		blk.company = "모나미";

		blk.write();

		red.info();		
		blk.info();
	}

}
