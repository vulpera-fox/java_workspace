package day13.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> que = new PriorityQueue<>();
		
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);
		
		System.out.println(que.toString());
		
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());

		System.out.println(que.toString());
		
		System.out.println("===========================");
		
		// User 객체를 담을 수 있는 Queue
		// Queue가 순서를 확인할 때, compareTo 메소드를 확인함
		// compareTo에 정의된 순서에 의해서 우선순위를 정함
		// 객체가 우선순위를 가지게 하려면 comparable 인터페이스를 상속받아서 compareTo 메소드를 오버라이딩하면 된다
		
		System.out.println("홍길동".compareTo("홍길자"));
		System.out.println("홍길자".compareTo("홍길동"));
		
		Queue<User> que2 = new PriorityQueue<>();
		
		que2.offer( new User("홍길동", 10) );
		que2.offer( new User("홍길자", 20) );
		que2.offer( new User("홍길순", 30) );
		que2.offer( new User("신사임당", 40) );
		
		System.out.println("가장 먼저 나온 객체의 이름 : " + que2.poll().getName());
		System.out.println(que2.toString());
		System.out.println(que2.poll());
		System.out.println(que2.poll());
		System.out.println(que2.poll());
	}

}
