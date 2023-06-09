package day15.api.io.readwrite;

import java.io.*;

public class WriterEx {

	public static void main(String[] args) {
		
		
		
		/*
		 * 문자를 써서 저장할 떄는 2바이트 기반 클래스 FileWriter()를 사용한다
		 */


		String path = "/Users/uwu/file/text.txt";
		
		
		try(Writer writer = new FileWriter(path)) {
			
			// \n 줄바꿈
			// \r 캐리지리턴 (맨 앞으로 당기기)
			String s = "그만좀\n자라";
			
			writer.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
