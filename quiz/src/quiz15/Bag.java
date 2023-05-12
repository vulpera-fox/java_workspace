package quiz15;

public class Bag implements IBag {

	String[] arr = new String[100];
	int a = 0;

	@Override
	public void insert(String item) {
		arr[a] = item;
		a++;
	}

	@Override
	public void print() {
		System.out.println("=====================");
		for ( int i = 0; i < a; i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println("=====================");
	}

	@Override
	public int search(String item) {
		for ( int i = 0; i < a; i++ ) {
			if ( arr[i].equals(item)) {
				return i+1;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) {
		for ( int i = 0; i <= a-1; i++ ) {
			if ( arr[i].equals(item)) {
				for( int j = i; j < a; j++) {
					arr[j] = arr[j+1];
				}
				a--;
				return true;
			}
		}
		return false;


	}
}