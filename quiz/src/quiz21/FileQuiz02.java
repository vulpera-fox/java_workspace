package quiz21;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class FileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Scanner sc = new Scanner(System.in);
		String path = "/Users/uwu/file/" + sdf.format(date) + "file";
		File file = new File(path);
		if(!file.exists()) {
			file.mkdir();
		}
		System.out.print("생성할 file의 이름을 입력하세요>");
		path = "/Users/uwu/file/" + sdf.format(date) + "file/" + sc.next() + ".txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			BufferedReader br = new BufferedReader(new FileReader(path))) {


			while (true) {
				String op = sc.next();

				if(op.equals("그만")) {
					break;
				}
				bw.write(op + "\n");
				bw.flush();
			}

			String result;
			while ( (result = br.readLine()) != null ) {
				System.out.println(result);
			}

			bw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
