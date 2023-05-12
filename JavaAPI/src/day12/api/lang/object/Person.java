package day12.api.lang.object;

public class Person implements Cloneable  {

	// 모든 클래스는 Object를 상속받는다

	private int age;
	private String name;


	public Person(String name) {
		this.name = name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String gettName() {
		return this.name;
	}


	public boolean equals(Object obj) {

		// 객체의 name 값이 같다면 true를 반환

		if ( obj instanceof Person ) {
			Person p = (Person)obj;
			if(p.gettName() != null ) {
				p.gettName().equals(this.name);
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}


	@Override
	protected void finalize() throws Throwable {
		// 객체가 사라지는 시점에 자동으로 실행
		System.out.println(this.name + "님이 사라졌네요");

		super.finalize();
	}

	/*
	 * 객체 복사 메소드
	 * clone() 을 오버라이드 하면, 외부에서 사용이 가능해짐
	 * 클래스는 Clonable 인터페이스를 상속받아야함
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}








}

