package quiz17;

public class Main {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		
		try {
			System.out.println(c.input());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
