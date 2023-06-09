package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		// 1970년 1월 1일 00시 기준으로 지금까지 흐른 시간을 밀리초로 바꿔서 표시
		System.out.println(date.getTime());
		
		Date date2 = new Date(System.currentTimeMillis() + 1000);
		
		System.out.println(date2);
		
		System.out.println(date2.getTime() - date.getTime());
		
		
		
		// 보기 편한 날짜 출력방식으로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 / hh시 : mm분 : ss초");
		
		System.out.println(sdf.format(date));
		
	}

}
