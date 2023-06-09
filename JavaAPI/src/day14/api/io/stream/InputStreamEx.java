package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
		 * 	파일을 읽는데 사용하는 클래스 FileInputStream 
		 *	생성자 매개변수에 읽을 파일의 경로가 들어간
		 */

		String path = "/Users/uwu/file/example.txt";



		try {
			InputStream in = new FileInputStream(path);

			// System.out.println(in.read());

			// 1st
			// read() 는 하나씩 데이터를 읽고, 더 읽을 값이 없다면 -1을 반환
			// while (true) {
			// int result = in.read();
			//if(result == -1) {
			//break;
			//}
			//System.out.println((char)result);

			// 2nd
			// read(배열)
			byte[] arr = new byte[100];
			int result = in.read(arr); // 읽은 크기만큼 반환
			int i = 0;
			
			while(true) {
				if ( arr[i] == 0 ) {
					break;
				}
				System.out.println((char)arr[i]);
				i++;
			}
			
			int result2 = in.read(arr); // 더 읽을 값이 없다면 -1 반환
			System.out.println(result2);
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}





	}

}
