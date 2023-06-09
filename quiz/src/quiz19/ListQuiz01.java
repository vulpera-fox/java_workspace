package quiz19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {

		/*
		 * 	List 1번
		 * 
		 *  1. list에 1~20까지 순서대로 값을 저장
		 *  2. list의 값을 순서대로 출력
		 */

		List<Integer> list = new ArrayList<>();

		for ( int i = 0; i < 20; i++ ) {
			list.add(i);
		}

		for ( int i = 0; i < 20; i++ ) {
			System.out.println(list.get(i));
		}

		/*
		 *  List 2번
		 *  
		 *  1. User를 저장하는 list 생성
		 *  2. 3개의 각각 다른 User 객체를 만들고 순서대로 저장
		 *  3. User객체 안에 홍길동이 있으면 해당 객체의 name과 age를 출력하는 코드 작성
		 *  4. User객체 안에 홍길자가 있으면 해당 객체를 삭제하는 코드 작성
		 */

		LinkedList<User> list2 = new LinkedList<>();

		User u1 = new User("홍길동",20);
		User u2 = new User("고길동",40);
		User u3 = new User("홍길자",60);


		list2.add(u1);
		list2.offer(u2);
		list2.add(u3);

		for (int i = 0; i < list2.size(); i++ ) {
			if( list2.get(i).getName().contains("홍길동")) {
				System.out.println(list2.get(i).getName() + " " + list2.get(i).getAge());
			} else if ( list2.get(i).getName().contains("홍길자")) {
				list2.remove(i);
				if ( i >= list2.size() ) {
					break;
				}
			}
			
			System.out.println(list2.get(i).getName() + " " + list2.get(i).getAge());
		}
		


	}

}
