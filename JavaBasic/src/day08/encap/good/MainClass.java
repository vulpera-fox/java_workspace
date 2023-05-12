package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyDate me = new MyDate();
		
		me.setYear(2000);
		
		System.out.println(me.getYear());
		
		me.setMonth(10);

		
		me.setDay(30);
		
		
		me.setSsn("1234567-123456");
		
		System.out.println(me.getMonth());
		System.out.println(me.getDay());
		System.out.println(me.getSsn());
		
	}

}
