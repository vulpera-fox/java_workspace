package day13.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		// Map인터페이스를 구현하는 HashMap
		// 탐색이 빠름

		// Key에 대한 타입과 Value에 대한 타입을 지정할 수 있다
		// HashMap<Integer, String> map = new HashMap<>();

		Map<Integer, String> map = new HashMap<>();


		// Map에 값을 저장할 때는 put(key, value)

		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");

		System.out.println(map.toString());
		System.out.println(map.size());
		
		// 맵에 동일한 키를 저장하면?
		map.put(4, "강감찬");
		System.out.println(map.toString());
		
		// 맵의 Value 구하기
		System.out.println(map.get(5));
		
		// key의 유무 확인 containsKey
		if ( map.containsKey(4) ) {
			System.out.println("키가잇슴");
		} else {
			System.out.println("키가업슴");
		}
		
		
		// 맵의 삭제 remove
		System.out.println(map.remove(1, "홍길동"));
		System.out.println(map.toString());
		
		
		// 맵의 순회
		// 방법 1
		Set<Entry<Integer,String>> set = map.entrySet();

		for ( Entry<Integer,String> entry : set ) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("=====================================");
		
		// 방법 2
		Set<Integer> set2 = map.keySet();
		
		for ( int key : set2 ) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		
		// 맵에 객체를 담는 모형
		Map<Integer, Object> map2 = new HashMap<>();
		
		
		
		
		
	}

}
