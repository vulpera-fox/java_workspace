package jdbc.demo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptsDAO {



	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;


	// 생성자
	public DeptsDAO() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("CLASS FOR NAME ERROR");
		}
	}

	// 메소드 (데이터베이스 결과가 1행 => VO를 반환
	//		 데이터베이스 결과가 여러행 => List<VO> 반환
	public List<DeptsVO> getDepts(String name) {
		List<DeptsVO> list = new ArrayList<>();
		String sql = "SELECT * FROM DEPTS WHERE DEPARTMENT_NAME = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int department_id = rs.getInt("department_id");
				String department_name = rs.getString("departemnt_name");
				int manager_id = rs.getInt("manager_id");
				int location_id = rs.getInt("location_id");
				DeptsVO vo = new DeptsVO(department_id, department_name, manager_id, location_id);
				list.add(vo);
			}

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
		return list;
	}

	
	// insert메소
	public int /* void */ insertDepts(DeptsVO vo) {
		
		int result = 0; // 0반환 = 실패, 1반환 = 성공
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			String sql = "INSERT INTO DEPTS(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) \n"
					+ "            VALUES(DEPTS_SEQ.NEXTVAL, ?, ?, ?)";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getDepartment_name());
			pstmt.setInt(2, vo.getManager_id());
			pstmt.setInt(3, vo.getLocation_id());
			
			result = pstmt.executeUpdate();
			
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
		return result;
	}



}
