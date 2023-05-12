package quiz06;

public class Account {

	int accountNumber;
	String password;
	int balance;

	Account(){

	}
	Account(int acNum, String pw, int bal) {

		accountNumber = acNum;
		password = pw;
		balance = bal;


	}


	void deposit(int a) {
		if( a >= 0 ) {
			balance += a;
		} else {
			System.out.println("0 이상의 금액을 입력해주세요.");
		}
	}
	void withDraw(int a) {
		if ( balance >= 0 && balance > a ) {
			balance -= a;
		} else {
			System.out.println("잔고를 확인해 주세요.");
		}
	}
	int getBalance() {



		return balance;
	}






}
