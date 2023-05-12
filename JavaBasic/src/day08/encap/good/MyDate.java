package day08.encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때, 미리 생성해놓은
	 * getter , setter 를 사용
	 * 
	 * setter 메소드
	 * 1. 값을 저장하는 용도의 메소드
	 * 2. 접근제어자는 public으로 선언하고 이름은 set + 멤버변수명 으로 지정
	 */
	
	public void setYear(int year) {
		
		if ( year < 1900 || year > 2023 ) {
			System.out.println("잘못된 값을 입력했습니다.");
			return;
		} else {
			this.year =  year;
		}
	}
	
	/*
	 * getter 메소드
	 * 1. 은닉변수의 값을 조회하는 메소드
	 * 2. 접근제어자는 public, 반환유형이 있고 이름은 get + 멤버변수명 으로 지
	 */
	
	public int getYear() {
		
		return year;
	}
	
	/*
	 * 1. month, day, ssn에 대한 getter/setter 생성
	 * 
	 * month - 1~12사이 의 값
	 * day - 1~31 사이의 값
	 * ssn - 하이픈 제외 13자리 값만 저
	 */
	
public void setMonth(int month) {
		
		if ( month < 1 || month > 12 ) {
			System.out.println("잘못된 값을 입력했습니다.");
			return;
		} else {
			this.month =  month;
		}
	}

public int getMonth() {
	
	return month;
}

public void setDay(int day) {
	
	if ( day < 1 || day > 31 ) {
		System.out.println("잘못된 값을 입력했습니다.");
		return;
	} else {
		this.day =  day;
	}
}

public int getDay() {
	
	return day;
}

public void setSsn(String ssn) {
	
	ssn = ssn.replace("-" , "");
	
	if(ssn.length() > 13) {
		System.out.println("잘못 입력했습니다.");
		return;
	}
	this.ssn = ssn;
}

public String getSsn() {
	
	return ssn;
}











}
