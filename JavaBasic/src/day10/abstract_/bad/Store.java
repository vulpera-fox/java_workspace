package day10.abstract_.bad;

public class Store {
	
	// 추상메소드가 없다면?
	// 자식메소드에서 반드시 오버라이딩을 했어야 했는데 그러지 않았다면 잘못된 메소드로 실행됨
	
	public void melon() {
		System.out.println("각 지점에서 가격을 책정하세요.");
	}
	public void orange() {
		System.out.println("각 지점에서 가격을 책정하세요.");
	}
	public void grape() {
		System.out.println("각 지점에서 가격을 책정하세요.");
	}
	public void apple() {
		System.out.println("각 지점에서 가격을 책정하세요.");
	}

}
