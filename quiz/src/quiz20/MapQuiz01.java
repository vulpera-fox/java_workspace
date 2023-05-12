package quiz20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = sc.nextInt();

			if(menu == 1) {
				System.out.print("등록할 메뉴를 입력하세요>");
				String newMenu = sc.next();
				if ( !map.containsKey(newMenu) ) {
					System.out.print("가격을 입력하세요>");
					int price = sc.nextInt();
					map.put(newMenu, price);
				} else {
					System.out.println("이미 등록된 메뉴입니다.");
				}



			} else if(menu == 2) { //메뉴판 전체 보기

				Set<Entry<String, Integer>> set = map.entrySet();

				for(Entry<String, Integer> entry : set ) {
					System.out.println("메뉴 : " + entry.getKey() + ", 가격 : " + entry.getValue());
				}


			} else if(menu == 3) {// 메뉴판 수정
				System.out.print("수정할 메뉴를 입력하세요>");
				String cMenu = sc.next();
				if(map.containsKey(cMenu)) {
					System.out.print("수정할 가격을 입력하세요>");
					int cPrice = sc.nextInt();
					map.put(cMenu, cPrice);
				} else {
					System.out.println("메뉴가 존재하지 않습니다.");
				}

			} else if(menu == 4) { //삭제
				System.out.print("삭제할 메뉴를 입력하세요>");
				String delMenu = sc.next();
				if(map.containsKey(delMenu)) {
					map.remove(delMenu);
					System.out.println("메뉴를 삭제했습니다.");
				} else {
					System.out.println("삭제할 메뉴가 없습니다.");
				}



			} else if(menu == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}

		}


	}
}
