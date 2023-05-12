package day13.collection.queue;

import java.util.ArrayDeque;

public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> que = new ArrayDeque<>();
		
		// 뒤에서 추가
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println(que.toString());
		// 앞에서 제거
		System.out.println("반환된 값 : " + que.pollFirst());
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println(que.toString());
		
		System.out.println("================================");
		
		// 앞에서 추가
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		System.out.println(que.toString());
		// 뒤에서 제거
		que.pollLast();
		System.out.println(que.toString());
		
		// list의 get 처럼 앞에서 or 뒤에서 값을 확인하기
		System.out.println(que.peekFirst());
		
	}

}
