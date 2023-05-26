package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoUpdate01 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "UPDATE DEPTS SET DEPARTMENT_NAME = ? WHERE DEPARTMENT_ID = ?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("부서아이디>");
		String id = sc.nextLine();
		System.out.print("부서이름>");
		String name = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			
			System.out.println(pstmt.executeUpdate());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
