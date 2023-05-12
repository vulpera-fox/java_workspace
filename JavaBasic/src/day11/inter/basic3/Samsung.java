package day11.inter.basic3;

public class Samsung implements Printed {

	public void print(String document) {
		System.out.println("Samsung : " + document);
	}

	public void colorPrint(String document, String color) {
		System.out.println("Samsung : " + color + ", " + document);
	}

	public int copy(int n) {
		System.out.println("Samsung : " + n + "장 복사중");
		return n;
	}

	
	
	
}
