package day16.api.io.buffered;
import java.io.*;
public class BufferedWriterEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered 가 붙으면 입출력을 빠르게 하는 성능향상 스트림
		 * 
		 * 보조스트림이라고 부르고 Reader Writer InputStream OutputStream과 같이 사용됨
		 */
		
		String path = "/Users/uwu/file/test.txt";
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
//		Writer w = new FileWriter(path);
//		
//		BufferedWriter bw = new BufferedWriter(w);
		
		// Writer객체의 두번째 매개변수에 true를 넣으면 새로 만드는 대신 기존 파일에 이어서 넣는다
		
		try(BufferedWriter bw = new BufferedWriter( new FileWriter(path , true) )) {
			
			String str = "오늘은 날씨가 맑습니다. \n내일은 쉽니다.\n";
			bw.write(str);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
