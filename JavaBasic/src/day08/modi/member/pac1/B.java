package day08.modi.member.pac1;

public class B {
	
	A a = new A(); // public

	A a2 = new A(2); // default

//	A a3 = new A("가나다"); // private
	
	
	public B() {
		a.var1 = 1;
		a.var2 = 2;
//		a.var3 = 3;
		
		a.method1();
		a.method2();
//		a.method3();


	}
	}
