package quiz;

public class Quiz18 {

	public static void main(String[] args) {
		
		int[] arr = {54,32,3,5,7,14,20};
		
		int sum = 0;
		
		for ( int i = 0; i < arr.length; i++ ) {
			if( arr[i] % 2 == 0 ) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		
	}

}
