package quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		// 지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개
		/*
		 * 1. BufferedReader 사용해서 한줄씩 읽는다
		 * 2. split("," ,5) 를 사용해서 Data 객체에 한줄 단위로 저장
		 * 3. List<Data> 에 하나씩 추가
		 * 4. 람다식을 이용해서 지역 : 서울, 4분기, 분양가격 :2000 이상인 데이터만 새로운 리스트로 변환
		 * 
		 */

		String path = "/Users/uwu/eclipse-workspace/quiz/src/quiz22/sheet.csv";

		List<Data> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"EUC-KR"))) {

			br.readLine();
			String str;
			while ( (str = br.readLine()) != null ) {
				String[] arr;
				Data data = new Data();
				arr = str.split(",",5);
				data.setRegion(arr[0]);
				data.setSize(arr[1]);
				data.setYear(arr[2]);
				data.setMonth(arr[3]);
				arr[4] = arr[4].replace("\"", "").replace(" ","").replace("-", "").replace(",","");
				if ( arr[4].equals("")) {
					data.setPrice("0");
				} else {
					data.setPrice(arr[4]);
				}
				
				list.add(data);
				System.out.println(data.getPrice());
			}
			
			List<Data> list2 = list.stream().filter( a -> a.getRegion().equals("서울"))
					.filter( a -> Integer.parseInt(a.getPrice()) >= 2000 )
					.filter( a -> Integer.parseInt(a.getMonth()) >= 9 && Integer.parseInt(a.getMonth()) <= 12 )
					.collect(Collectors.toList());
			
			for(int i = 0; i < list2.size(); i++ ) {
				System.out.println(list2.get(i).getMonth());
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
