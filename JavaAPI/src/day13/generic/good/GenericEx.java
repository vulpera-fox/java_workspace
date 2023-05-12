package day13.generic.good;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		add1(list1);
		add1(list2);
		add1(list3);
		
		add2(list1);
//		add2(list2); // Integer X
//		add2(list3); // Object X
		
		add3(list1);
//		add3(list2); // Integer X
		add3(list3);
		
		
	}

	public static void add1(List<?> list) {
		
	}
	
	public static void add2(List<? extends String> list) {
		
	}
	
	public static void add3(List<? super String> list) {
		
	}
	
}
