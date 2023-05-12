package day15.api.io.readwrite;
import java.io.*;
public class ReaderEx {

	public static void main(String[] args) {

		
		/*
		 * 문자기반 파일을 읽어서 사용할 때는 FileReader 클래스를 사용
		 */
		
		String path = "/Users/uwu/file/text.txt";
		
		
		
		try(Reader r = new FileReader(path)){

			int result;
			while ((result = r.read()) != -1 ) {
				
				System.out.print((char)result);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
