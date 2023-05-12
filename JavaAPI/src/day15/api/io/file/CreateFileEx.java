package day15.api.io.file;
import java.io.*;

public class CreateFileEx {

	public static void main(String[] args) {

		/*
		 * File 클래스
		 * 외부경로에 폴더나 단순한 파일을 생성하거나 삭제할 수 있
		 */

		String path = "/Users/uwu/file/20230504";


		try {

			File file = new File(path);
			
			// 생성
			if ( file.exists() == false ) {
				file.mkdir(); // make directory	
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("이미 폴더가 존재합니다");
			}

			// 삭제
			if(file.exists()) {
				file.delete();
				System.out.println("삭제완료");
			} else {
				System.out.println("삭제할파일이없습니다");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
