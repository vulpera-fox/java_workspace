package day08.modi.protec.pac2;
import day08.modi.protec.pac1.A;
public class D extends A{

	
	public D() {
		
		// protected는 상속 관계에서 super를 통한 접근이 가능
		super();
		super.bool = false;
		super.method();
	}
	
	
	// override 됨
	protected void method() {
		
	}
}
