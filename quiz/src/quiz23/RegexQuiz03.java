package quiz23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.smartcardio.ResponseAPDU;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegexQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽는다
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 패턴분석해 Product객체에 저장하고 그걸 list에 저장
		 * 3. 외부 라이브러리 (POI) - 자바에서 엑셀파일 xlsx 형식으로 파일을 쓸 수 있도록 하는 기능
		 * 4. 한개의 시트에 각 행마다 데이터를 넣어서 출력
		 */

		XSSFWorkbook nwb = new XSSFWorkbook();
		XSSFSheet ns = nwb.createSheet("건담");
		int rowNo = 0;
		CellStyle defaultStyle = nwb.createCellStyle();
		String readPath = "/Users/uwu/file/건담.txt";
		String writePath = "/Users/uwu/eclipse-workspace/quiz/src/quiz23/gd.xlsx";
		defaultStyle.setAlignment(HorizontalAlignment.CENTER);
		defaultStyle.setVerticalAlignment(VerticalAlignment.CENTER);

		String p1 = "[0-9]{8}";
		String p2 = "[가-힣]+점";
		String p3 = "\\[[A-Z가-힣]+\\]";
		String p4 = "[0-9,]+원";

		String pp = "[0-9]+-[0-9]+-[0-9]+";
		String ppp = "건담?[가-힣]+\s[가-힣]+";
		String pppp = "\s+";

		List<Product> list = new ArrayList<>();
		File file = new File(writePath);
		try (BufferedReader br = new BufferedReader(new FileReader(readPath));){
			String s;
			while ( (s = br.readLine()) != null) {
				Matcher m1 = Pattern.compile(pp).matcher(s);
				Matcher m2 = Pattern.compile(ppp).matcher(s);
				Matcher m3 = Pattern.compile(p2).matcher(s);
				Matcher m4 = Pattern.compile(p3).matcher(s);
				Matcher m5 = Pattern.compile(p4).matcher(s);
				Matcher m6 = Pattern.compile(pppp).matcher(s);
				Matcher m7 = Pattern.compile(p1).matcher(s);
				if ( m1.find() && m2.find() && m3.find() && m4.find() && m5.find() && m6.find() && m7.find() ) {
					String p5 = s.substring(m4.end()+1,m5.start()-1);
					Product pro = new Product(m7.group(),m2.group(),m4.group(),p5,m5.group());

					list.add(pro);

				}



			}
			
			Row headerRow = ns.createRow(rowNo++);
			headerRow.createCell(0).setCellValue("날짜");
			headerRow.createCell(1).setCellValue("지점");
			headerRow.createCell(2).setCellValue("등급");
			headerRow.createCell(3).setCellValue("내용");
			headerRow.createCell(4).setCellValue("가격");

			for( Product pro : list ) {
				Row row = ns.createRow(rowNo++);
				row.createCell(0).setCellValue(pro.getDay());
				row.createCell(1).setCellValue(pro.getStore());
				row.createCell(2).setCellValue(pro.getGrade());
				row.createCell(3).setCellValue(pro.getEx());
				row.createCell(4).setCellValue(pro.getPrice());
				ns.setColumnWidth(5, 3000);
			}

			try {
				OutputStream fos = new FileOutputStream(file);
				nwb.write(fos);

			} catch (Exception e) {
			}finally {
				nwb.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
