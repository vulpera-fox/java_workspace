package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {
	
	A a = new A(); // public

//	A a2 = new A(2); // default

//	A a3 = new A("가나다"); // private

	
	public C() {
		a.var1 = 1;
//		a.var2 = 2;	// default
//		a.var3 = 3; // private
		
		a.method1();
//		a.method2();
//		a.method3();
	}
	
}
