package day13.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		/*
		 * Stack
		 * => 후입선출
		 * => push() , pop()
		 */
		
		
		Stack<String> stack = new Stack<>();
		
		// 값의 추가
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		// 형태를 문자열로 확인
		System.out.println(stack.toString());
		
		String n = stack.pop(); // 값을 제거하고 제거한 값을 반환함
		System.out.println("제거된 값은 : " + n);
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		// Stack이 비었는데 제거하면 에러발생
//		System.out.println(stack.pop());
	
	}

}
