package day14.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * 파일을 쓸 때 사용하는 클래스는 FileOutputStream 이다.
		 * 생성자 매개값으로 파일을 쓸 경로가 들어간다.
		 * io패키지의 거의 모든 클래스들은, 생성자에 throws가 있기 때문에
		 * 반드시 예외처리 문장 안에서 사용한다.
		 */
		
		String path = "/Users/uwu/file/example.txt";
		
		try {
			OutputStream out = new FileOutputStream(path);
			
			
			String str = "한글"; // 한글은 1byte형식에서 쓰기엔 적합하지 않다.
			
			byte[] arr = str.getBytes();
			
			out.write(arr);
			
			out.close(); // 자원해제
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
