package day09.poly.basic02;

public class House {
	
//	private Student student[] = new Student[100];
//	private Employee employee[] = new Employee[100];
//	private Teacher teacher[] = new Teacher[100];
//	private int index1;
//	
//	public void inHouse(Student student) {
//		this.student[index1] = student;
//		index1++;
		
	private Person person[] = new Person[100];
	private int index;
	
	public void inHouse(Person person) {
		this.person[index] = person;
		index++;
		
	}
	
	public void whoRU(Person p) {
		
		if( p instanceof Student ) {
			System.out.println("학생입니다");
			Student s = (Student) p;
			
		} else if ( p instanceof Teacher ) {
			System.out.println("교사입니다");
			
		} else if ( p instanceof Employee ) {
			System.out.println("직원입니다");
			
		} else {
			System.out.println("사람아니야");
		}
		
		
		
	}
	
	
	
}
