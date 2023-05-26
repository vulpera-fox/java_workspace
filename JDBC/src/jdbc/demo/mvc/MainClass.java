package jdbc.demo.mvc;

import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DeptsDAO deptsDAO = new DeptsDAO();
		
		while(true) {
			System.out.println("[1.조회, 2.추가, 3.수정]");
			System.out.print("메뉴>");
			
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				// 부서명으로 조회
				List<DeptsVO> list = deptsDAO.getDepts("TEST");
				break;
				
			case 2:
				System.out.print("부서명>");
				String department_name = sc.next();
				System.out.print("매니저아이디>");
				int manager_id = sc.nextInt();
				System.out.print("로케이션아이디>");
				int location_id = sc.nextInt();
				
				DeptsVO vo = new DeptsVO(0, department_name, manager_id, location_id);
				int result = deptsDAO.insertDepts(vo);
				
				System.out.println(result);
				
				break;
			case 3:
				
				break;

			default:
				break;
			}
		}

	}

}
