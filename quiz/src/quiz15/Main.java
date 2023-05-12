package quiz15;

public class Main {

	public static void main(String[] args) {
		
		IBag bag = new Bag();
		
		bag.insert("apple");
		bag.insert("apple");
		bag.insert("apple");
		bag.insert("apple");
		bag.print();
		System.out.println(bag.search("tomato"));
		System.out.println(bag.search("toma"));
		System.out.println(bag.delete("apple"));
		System.out.println(bag.delete("apple"));
		System.out.println(bag.delete("apple"));
		System.out.println(bag.delete("tomato"));
		bag.print();
		
	}

}
