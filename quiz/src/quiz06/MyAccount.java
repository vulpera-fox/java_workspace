package quiz06;
import java.util.Scanner;

public class MyAccount extends Account {


		

	MyAccount(int acNum, String pw, int bal) {
		accountNumber = acNum;
		password = pw;
		balance = bal;
	}

	/*
	   철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	   기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.

	   Account를 상속받고
	   withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	   금액을 감소시키려고 한다.
	   또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	   withDraw() 메서드를 오버라이딩 해주세요.

	 */



	void withDraw(int a) {
		System.out.println("비밀번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		if ( sc.next().equals(password) ) {
			if ( a <= balance ) {
				balance -= a;
				System.out.println(a + "원을 출금했습니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		sc.close();
	}
}