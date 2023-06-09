package day16.api.rambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for ( int i = 0; i < 100; i++ ) {
			Random rn = new Random();

			list.add(rn.nextInt(100)+1);
		}
		System.out.println(list.toString());
		
		// 최종처리 함수
		// collect()
		
		List<Integer> newList = list.stream().filter( a-> a % 3 == 0).collect(Collectors.toList());

		System.out.println(newList.toString());
		
		Set<Integer> set = list.stream().filter(a->a%3==0).collect(Collectors.toSet());
		
		System.out.println(set.toString());
		
		System.out.println("==================================");
		
		// sum(), count(), avg(), max(), min() - 숫자를 다루는 스트림에서만 사용
		int i = list.stream().distinct().mapToInt(a -> a).sum();
		System.out.println(i);
		
		long l = list.stream().distinct().mapToInt(a->a).count();
		System.out.println(l);
		
		OptionalDouble od = list.stream().distinct().mapToInt(a->a).average();
		System.out.println(od.getAsDouble());
		
		OptionalInt oi = list.stream().distinct().mapToInt(a->a).max();
		System.out.println(oi.getAsInt());
		
		System.out.println("==================================");
		
		// list 에서 50보다 큰 값만 중복없이 저장하는 새로운 리스트 작성
		
		List<Integer> list2 = list.stream().sorted().distinct().filter(a -> a>50).collect(Collectors.toList());
		System.out.println(list2.toString());
		
		IntStream.range(1, 10).forEach(a->System.out.println(a)); // x이상 y미만
		IntStream.rangeClosed(1, 10).forEach(a->System.out.println(a)); // x이상 y이하 스트림 반환
		
		OptionalInt oioi = IntStream.rangeClosed(1, 100).findFirst();
		System.out.println(oioi.getAsInt());
		
		// 정수스트림 -> 일반스트림 형변환
		Stream<Integer> ssss = IntStream.rangeClosed(1, 100).boxed().filter(a->a>50);
	}

}
