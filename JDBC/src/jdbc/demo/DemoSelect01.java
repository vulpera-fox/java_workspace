package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class DemoSelect01 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		String sql = "SELECT * FROM EMPLOYEES WHERE SALARY >= ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			// 1. 드라이버 클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 커넥션 개체 생성
			conn = DriverManager.getConnection(url, uid, upw);
			// 3. 커넥션 개체에서 statement 객체 생성
			pstmt = conn.prepareStatement(sql);
			// 3-2. SQL문에 전달할 값이 있다면 ?로 처리하고 순서대로 1번부터 시작한다
			pstmt.setInt(1, 20000); // 첫번째 물음표, 5000(원)
			
			
			// 4. sql문의 실행
			// select문은 executeQuery()
			// update, insert, delete문은 executeUpdate()
			rs = pstmt.executeQuery();
			
			// 5. rs.next() 다음행이 있다면 그 행으로 접근
			while(rs.next()){ // 한 행에서 처리할 작업을 while문 안에 넣는
				int salary = rs.getInt("salary"); // getString, getInt, getDouble, getDate, getTimestamp
				System.out.println(salary);
				double comm = rs.getDouble("commission_pct");
				System.out.println(comm);
				String first_name = rs.getString("first_name");
				System.out.println(first_name);
				Date hire_date = rs.getDate("hire_date");
				System.out.println(hire_date);
				Timestamp date2 = rs.getTimestamp("hire_date");
				System.out.println(date2);
				System.out.println("----------------------------");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				conn.close();
				rs.close();
				pstmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
