package quiz19;

import java.util.*;

public class ListQuiz02 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);


		x: while(true) {

			System.out.println("[1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보삭제 | 5.프로그램종료]");
			System.out.print("메뉴(번호)>");

			int menu = sc.nextInt();

			switch (menu) {

			case 1:
				// 이름과 나이를 입력받아서 user객체에 저장하고 리스트에 순서대로 추가
				System.out.print("이름을 입력하세요>");
				String name = sc.next();
				System.out.print("나이를 입력하세요>");
				int age = sc.nextInt();
				list.add(new User(name,age));
				break;

			case 2:
				// 리스트에 담긴 모든 회원의 이름, 나이를 출력
				for ( User u : list ) {
					System.out.println(u.getName()  + ", " + u.getAge());
				}
				
				break;

			case 3:
				// 찾을 이름을 새로 입력받아서, 그 이름이 있다면 이름과 나이를 출력
				// 찾는 이름이 없다면 " ~~~는 목록에 없습니다" 를 출력
				System.out.print("찾을 이름을 입력하세요>");
				String findName = sc.next();
				int count = 0;
				for ( int i = 0; i < list.size(); i++ ) {
					if ( list.get(i).getName().equals(findName) ) {
						System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
						count++;
					}
				}
				if(count == 0) {
				System.out.println(findName + "님은 목록에 없습니다.");
				}
				break;

			case 4:
				// 삭제할 이름을 입력받아서 이름과 동일한 User객체를 첫 1개만 삭제
				System.out.print("삭제할 이름을 입력하세요>");
				String delName = sc.next();
				for ( int i = 0; i < list.size(); i++ ) {
					if ( list.get(i).getName().equals(delName) ) {
						System.out.println(list.get(i).getName() + "님 삭제완료.");
						list.remove(i);
						continue x;
					}
				}
				System.out.println("입력하신 이름이 목록에 존재하지 않습니다.");
				break;
			case 5:
				System.out.println("프로그램 종료.");
				System.exit(0);
				break;

			default:
				break;
			}


		}



	}

}
