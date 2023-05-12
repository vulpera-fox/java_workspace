package day03;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {45, 13, 26 ,21 ,63, 42, 51, 24, 5};
		
		int i = 0;
		int max = 0;
		while (i < arr.length) {
			
			if ( arr[i] > max ) {
				max = arr[i];
			}
			
			i++;
		}
		System.out.println(max);
		

	}

}
