package day16.api.rambda.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		
		/*
		 * 람다 함수의 구현 사용문법
		 * Predicate - 매개변수가 하나 있고, boolean형 반환
		 * Consumer - 매개변수를 하나 받고, void형 (forEatch)
		 * Function - 매개변수 여러개, 반환은 임의의 값
		 */
		
		List<Integer> list = new ArrayList<>();
		
		for ( int i = 0; i < 100; i++ ) {
			Random rn = new Random();
			
			list.add(rn.nextInt(100)+1);
		}
		System.out.println(list.toString());
		
		// 중간처리 함수들
//		Stream<Integer> stream = list.stream();
//		
//		stream = stream.distinct(); // 중복제거
//		stream.forEach( (a) -> System.out.print(a + ", ") );

		list.stream().distinct().forEach((a)->System.out.print(a + ", "));
		
		System.out.println("\n==================================");
		
		// sort() - 정렬
		list.stream().distinct().sorted().forEach((a)->System.out.print(a + ", ")); 
		
		System.out.println("\n==================================");
		
		// filter() - 리턴에 true 값만 남기고 필터링
		list.stream().distinct().filter( (a) -> a%2==0).sorted().forEach(a -> System.out.print(a + ", "));
		
		System.out.println("\n==================================");
		
		// map() - 반환에 정의 된 값으로 완전히 새로운 스트림을 반환
		list.stream().map( (a) -> {
			
			String str;
			if ( a % 2 == 0 ) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			
			return str;
		}).forEach( a -> System.out.print(a + ", "));
		
		// mapToDouble - 반환에 정의된 값을 double타입 스트림으로 반환
		// mapToInt - 정수형 스트림으로 변경
		// mapToLong - long타입 스트림으로 변경
		list.stream().mapToDouble( a->a).forEach(a->System.out.println(a + ", "));
		
	}

}
