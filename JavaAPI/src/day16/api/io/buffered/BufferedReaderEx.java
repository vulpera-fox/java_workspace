package day16.api.io.buffered;
import java.io.*;
public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능향상보조스트림
		 * Reader클래스와 같이 사용됨
		 * 
		 */
		
		String path = "/Users/uwu/file/test2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String result;
			while ( (result = br.readLine()) != null) {
				System.out.println(result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
