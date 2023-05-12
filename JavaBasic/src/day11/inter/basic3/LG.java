package day11.inter.basic3;

public class LG implements Printed {

	private String logo = "Life is Good";
	
	
	public void print(String document) {
		System.out.println(logo);
		System.out.println(document);
	}

	public void colorPrint(String document, String color) {
		System.out.println(logo);
		System.out.println("color : " + color);
		System.out.println(color + "색상 : " + document);
	}

	public int copy(int n) {
		
		for ( int i = 1; i <= n; i++ ) {
			System.out.println(i + "장 복사중");
		}
		return 1;
	}
	
	
	
	
}
