package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		

		//  static메소드를 사용해서 객체를 반환하는 모형
		Calendar c = Calendar.getInstance();
		
		
		System.out.println(c.get(Calendar.SECOND));
		
		
	}

}
