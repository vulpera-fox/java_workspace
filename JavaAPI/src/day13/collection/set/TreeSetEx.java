package day13.collection.set;

import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		
		// set + 정렬
		
		TreeSet<Integer> set = new TreeSet<>();
		
		
		set.add(100);
		set.add(83);
		set.add(18);
		set.add(58);
		set.add(41);
		set.add(22);
		
		System.out.println(set.toString());
		
		for(int i : set) {
			System.out.println(i);
		}

	}

}
