package quiz08;

import java.util.Arrays;

public class MyCart extends Cart {


	// 1. 생성자는 money를 전달받고 money값 초기화 / tv = 300, com = 400, radio = 500

	// 2. buy, add, info 메소드 오버라이드

	/*
	 * 상품명 - "tv", "com", "radio"
	 * 
	 * buy(product) 기능
	 * 매개변수가 tv, com, radio라면 금액에서 상품 가격을 차감하고 add 메소드를 실행
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우 적절하게 처리할 것
	 */

	/*
	 * add(product) 기능
	 * 매개변수로 입력된 상품을 cart 배열에 순서대로 담는다
	 * 단, cart 배열이 가득 찼으면 2배 크기의 카트 배열로 옮긴다
	 * 
	 * 마지막에는 info 메소드 호출
	 */

	/*
	 * info() 기능
	 * cart 배열에 담긴 물건 목록만 출력하기 (null 제외)
	 */

	MyCart(int money) {

		this.money = money;
		tv = 300;
		computer = 400;
		radio = 500;

	}

	void buy(String product) {

		if ( product.equals("tv") || product.equals("com") || product.equals("radio")) {
			if ( product.equals("tv")) {
				if( this.money >= tv ) {
					this.money -= tv;
					System.out.println("TV를 구매했습니다. 현재 잔액은 " + money + "원 입니다.");
					add(product);
				}
			}
			if ( product.equals("com")) {
				if( this.money >= computer ) {
					this.money -= computer;
					System.out.println("Computer를 구매했습니다. 현재 잔액은 " + money + "원 입니다.");
					add(product);
				}
			}
			if ( product.equals("radio")) {
				if( this.money >= radio ) {
					this.money -= radio;
					System.out.println("Radio를 구매했습니다. 현재 잔액은 " + money + "원 입니다.");
					add(product);
				}
			}

		} else {
			System.out.println("올바른 상품이 아닙니다.");
			System.out.println("==========================================================");
		}

		if ( this.money < tv || this.money < computer || this.money < radio ) {
			System.out.println("잔액이 부족합니다.");
		}
	}

	void add(String product) {
		cart[i] = product;
		i++;

		if( i == cart.length ) {
			String newCart[] = new String[cart.length*2];
			for ( int j = 0; j < cart.length; j++ ) {
				newCart[j] = cart[j];
			}
			cart = newCart;
			newCart = null;
		}
		info();
	}

	void info() {
		String s = "";
		for ( int i = 0; i < cart.length; i++ ) {
			if (cart[i] != null) {
				s = s+cart[i]+", ";
			}
		}
		System.out.println("구매내역 : " + s );
		System.out.println("==========================================================");

	}


}

