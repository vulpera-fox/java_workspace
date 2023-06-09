package quiz21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {

		/*
		 *  1. 스캐너를 통해 파일명을 입력받는다
		 *  2. 입력받은 파일을 filecopy 폴더로 복사해서 옮겨준다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("파일명을 입력하세요>");
		String name = sc.next();

		String readPath = "/Users/uwu/file/" + name;
		String writePath = "/Users/uwu/filecopy/" + name;


		try(InputStream in = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)) {
			
			byte[] arr = new byte[2048];
			int result = 0;
			while((result = in.read(arr)) != -1) {
				out.write(arr, 0, result);
			}

		} catch (Exception e) {


		}
		sc.close();
	}

}
