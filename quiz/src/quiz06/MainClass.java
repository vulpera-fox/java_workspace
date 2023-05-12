package quiz06;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// 어떤 사람의 은행 계좌
		/*
		 * accountNumber 변수 - 식별번호
		 * password 변수 - 비밀번호
		 * balance 변수 - 잔고
		 * 
		 * 생성자는 3가지를 모두 받아서 초기화하는 생성자
		 * 
		 * 메소드
		 * 
		 * deposit : void - 잔고에 매개변수를 누적하는 기능
		 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
		 * getBalance  int - 잔고를 리턴하는 기능
		 * 
		 * 메인 클래스에서는 각각의 기능을 확인
		 */

		Scanner sc = new Scanner(System.in);
		
		MyAccount myAccount = new MyAccount(sc.nextInt(), sc.next(), sc.nextInt());
		
		System.out.println("입금하실 금액을 입력하세요");
		myAccount.deposit(sc.nextInt());
		System.out.println("현재 잔고는 " + myAccount.balance + "원 입니다.");
		System.out.println("출금하실 금액을 입력하세요");
		myAccount.withDraw(sc.nextInt());
		System.out.println("현재 잔고는 " + myAccount.balance + "원 입니다.");
		System.out.println("고객님의 잔고는 " + myAccount.getBalance() + "원 입니다.");
		
		sc.close();
	}
	
}

