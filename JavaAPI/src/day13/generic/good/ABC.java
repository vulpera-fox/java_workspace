package day13.generic.good;

public class ABC<T> {
	// 클래스 or 인터페이스의 매개변수 <>
	// T 는 아직 타입이 정해지지 않았고 객체를 생성할 때 정해짐
	
	private T t;
	
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
