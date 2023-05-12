package day16.api.io.buffered;
import java.io.*;
import java.util.Scanner;
public class BufferedWriterEx02 {

	public static void main(String[] args) {
		
		/*
		 * flush() - 중간중간 파일을 즉시 쓰고 싶으면 flush()를 사용한다
		 * 
		 * BufferedWrite가 끝나면 자동으로 flush() 실행됨
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String path = "/Users/uwu/file/test2.txt";
		
		try ( BufferedWriter bw = new BufferedWriter( new FileWriter(path,true))){
			
			String word1 = sc.next();
			bw.write(word1);
			bw.flush(); // 버퍼에 있는 내용을 내보냄
			String word2 = sc.next();
			bw.write(word2);
			System.out.println("파일출력 완료");
			
		} catch (Exception e) {
		}

	}

}
