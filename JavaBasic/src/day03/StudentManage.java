package day03;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		// 학생정보를 등록할 배열을 while문 밖에 선언
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];

		// 고객 수
		int count = 0 ;
		// 조회 할 위치
		int index = -1;

		x:while (true) {

			System.out.println("===========================================================================");
			System.out.println("[정보] 고객수 : " + count + ", 조회위치 : " + (index +1));
			System.out.println("[메뉴] 1.추가 , 2.이전정보 , 3.다음정보 , 4.현재정보 , 5. 정보수정 , 6.정보삭제 , 7.종료");
			System.out.println("===========================================================================");
			System.out.print("메뉴입력>");
			String menu = sc.next();

			switch (menu) {
			case "추가":
			case "1":
				// 이름, 성별, 간단한정보를 입력받아서 각 배열에 순서대로 저장
				if (count < nameList.length) {
				System.out.print("이름을 입력하세요>");
				String name = sc.next();
				System.out.print("나이를 입력하세요>");
				int age = sc.nextInt();
				System.out.print("성별을 입력하세요>");
				String gender = sc.next();

				nameList[count] = name;
				ageList[count] = age;
				infoList[count] = gender;

				count++;
				index = count - 1;
				} else { 
					System.out.println("목록이 가득 찼습니다.");
					break;
				}

				break;
			case "2":
				// 이전정보 출력 : 정보 출력은 index 위치로 출력한다. index가 0보다 작다면 출력하지 않도록 처리
				if ( index - 1 < 0 ) {
					System.out.println("이전 정보가 없습니다.");
				} else {
					index--;
					System.out.println("이름 : " + nameList[index] + " , 나이 : " + ageList[index] + " , 성별 : " + infoList[index]);
				}


				break;

			case "3":
				// 다음정보 출력 : 정보 출력은 index 위치로 출력한다.
				if ( index + 1 >= count ) {
					System.out.println("다음 정보가 없습니다.");
				} else {
					index++;
					System.out.println("이름 : " + nameList[index] + " , 나이 : " + ageList[index] + " , 성별 : " + infoList[index]);
				}

				break;

			case "4":
				// index가 가리키고 있는 위치정보를 출력한다.
				if ( index >= count || index < 0) {
					if ( count == 0) {
						System.out.println("고객 정보가 없습니다. 정보를 입력해주세요.");
					} else {
						System.out.println("현재 정보가 없습니다. 이전 정보로 돌아갑니다.");
						index--;
					}
					if ( index < 0 ) {
						index = 0;
					}
				} else {
					System.out.println("이름 : " + nameList[index] + " , 나이 : " + ageList[index] + " , 성별 : " + infoList[index]);
				}

				break;

			case "5":
				// 새로운 이름, 나이, 정보를 입력받아서 현재 index값의 정보를 수정
				System.out.println("새로운 정보를 입력하세요.");
				System.out.print("이름>");
				nameList[index] = sc.next();
				System.out.print("나이>");
				ageList[index] = sc.nextInt();
				System.out.print("성별>");
				infoList[index] = sc.next();
				if(count == 0) {
					count++;
				}
				break;

			case "6":
				//현재정보 삭제 . 현재 index부터 뒤에 있는 배열요소를 당겨와서 덮어씌운다.

				if ( count <= 0 ) {
					System.out.println("삭제할 정보가 없습니다.");
				} else {
					System.out.println("현재 정보를 삭제합니다.");
					for ( int i = index; i < count-1; i++) {
						nameList[i] = nameList[i+1];
						ageList[i] = ageList[i+1];
						infoList[i] = infoList[i+1];

					}
					count--;
					if( count == index ) {
						index = count - 1;
					}
					if ( index < 0 ) {
						index = 0;
					}
				}
				break;

			case "7":
				// while문 탈출
				System.out.println("프로그램을 종료합니다.");

				break x;


			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}

	}

}
