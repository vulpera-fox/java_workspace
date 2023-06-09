package day13.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {

		/*
		 * LinkedList
		 * 순서 O, 중복 O
		 * 노드객체 ( 양방향 연결리스트 )
		 * 삽입과 삭제는 ArrayList보다 효율적이지만 탐색은 느리다
		 */


		LinkedList<Integer> list = new LinkedList<>();
		
		// list와 기능이 동일하다
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.toString());
		
		// 중간에 추가
		list.add(3, 10);
		System.out.println(list.toString());
		
		// 값 얻기 get()
		System.out.println(list.get(3));
		
		// 값 삭제 remove()
		System.out.println(list.remove(3));
		System.out.println(list.toString());
		
		System.out.println("=============================");
		
		// linkedlist는 queue의 기능을 구현하기 때문에 queue기능도 사용가능
		
		
		list.offer(10);
		list.offer(11);
		
		System.out.println(list.toString());
		
		System.out.println(list.poll());
		System.out.println(list.toString());
		
	}

}
