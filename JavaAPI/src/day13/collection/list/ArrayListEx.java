package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * => 배열기반
		 * => 순서 O, 중복 O
		 */
		
		//ArrayList<String> list = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		
		// list 추가 add()
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍길동");
		list.add("신사임당");
		
		System.out.println(list.toString());
		
		// 길이 확인 size()
		System.out.println("리스트의 길이 : " + list.size());
		
		// 중간에 추가 add(index)
		list.add(0, "0번째추가");
		System.out.println(list.toString());
		
		// 값의 확인 get()
		System.out.println(list.get(3));
		
		// 값의 수정 set()
		list.set(4, "홍순자");
		System.out.println(list.toString());
		
		// 값의 제거 remove()
		list.remove(0);
		list.remove("신사임당");
		System.out.println(list.toString());
		
		// 값의 확인 contains()
		if ( list.contains("홍길동") ) {
			System.out.println("홍길동이있다");
		}
		
		// 빈 리스트의 확인 isEmpty()
		if ( list.isEmpty() ) {
			System.out.println("리스트가비었음");
		} else {
			System.out.println("리스트가비지않음");
		}
		
		// 전부삭제 clear()
		list.clear();
		System.out.println(list.toString());
		
		System.out.println("=======================================");
		
		
		// 제네릭 <?> = 제네릭 타입으로 어떤 타입이던 들어갈 수 있음
		// 제네릭 <? extends String> = String과 String의 자식들이 전달 가능
		// 제네릭 <? super String> = String 타입이 될 수 있다면 전달 가능
		
		List<String> list2 = Arrays.asList("A","B","C","D");
		System.out.println(list2.toString());
		
		// 리스트의 병합
		list.addAll(list2);
		
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
