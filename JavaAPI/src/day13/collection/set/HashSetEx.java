package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		// add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");  // 중복 X
		
		// toString
		System.out.println(set.toString());
		
		// size()
		System.out.println(set.size());
		
		// remove() 정확히 일치하는 항목으로 지울 수 있
		set.remove("python");
		System.out.println(set.toString());
		
		
		// 내부적으로 반복자(Iterator)의 개념을 사용해서 회전
		for(String s : set) {
			System.out.println(s);
		}

		System.out.println("=============================");
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
