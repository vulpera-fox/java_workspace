package day07.this_;

public class Person {
	
	String name;
	int age;
	
	
	Person(String name, int age){
		
		this.name = name;
		
		this.age = age;
		
//		System.out.println(this.info());
		
	}
	
	
	Person(String name){
		
//		this.name = name;
//		this.age = 1;
		this(name, 20); // 매개변수 맞추기
		
	}
	
	Person(){
		
//		this.name = "이름없음";
//		this.age = 1;
		this("이름없음",1);
	}
	
	
	
	
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}

}
