package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {

	public static void main(String[] args) {

		/*
		 *  FileInputStream, FileOutputStream은
		 *  동영상, 이미지 파일을 읽거나 쓸 때 사용한
		 */
		String readPath = "/Users/uwu/file/메서드1.mp4";
		String writePath = "/Users/uwu/filecopy/메서드1_copy.mp4";

		
		// 향상된 try ~ catch
		// Closable 인터페이스를 상속받는 클래스만 사용 가능
		// close 작업을 대신 해줌

		try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)) {


			byte[] arr= new byte[2048];

			int result;
			while((result = is.read(arr)) != -1) { // 읽은 값이 -1이 아닐떄 까지
				out.write(arr, 0, result); // arr 데이터를 0에서 byte 배열의 result 까지만 쓰기
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}


}


