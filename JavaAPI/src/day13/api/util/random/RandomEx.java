package day13.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println(r.nextDouble(5));
		
		System.out.println(r.nextInt(10));
		
		System.out.println(r.nextBoolean());
	}

}
