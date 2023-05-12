package day06.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.age = 20;
		std.name = "홍길동";
		std.studentId = "123123";
		System.out.println(std.info());
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subject = "수학";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 40;
		e.name = "스티브잡스";
		e.department = "애플";
		System.out.println(e.info());

	}

}
