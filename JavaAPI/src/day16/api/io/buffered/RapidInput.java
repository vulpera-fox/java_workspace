package day16.api.io.buffered;
import java.io.*;
public class RapidInput {

	public static void main(String[] args) {
		
		/*
		 * InputStreamReader는
		 * 
		 * 1바이트 데이터를 2바이트 기반으로 변경
		 */
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.println(br.readLine());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
