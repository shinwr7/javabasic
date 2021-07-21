import java.sql.*;
import java.util.Scanner;

public class JdbcSelect2 {

	public static void main(String[] args) {
		// 1. 커넥터 연결을 해주세요. employees DB를 연결합니다.
		// 2. 조회구문은 SELECT emp_no, 
		// SELECT emp_no, first_name * from employees limit 10;
		// 3. 위 조회구문으로 조회한 결과물을  while문을 활용해서
		// 콘솔창에 사번 : emp_no, 성 : first_name 과 같은 형태로 
		// 10 줄을 출력하도록 처리해주세요. 
		// hint ) while(rs.next()) 를 조건식으로 잡으면
		// 정확하게 ResultSet에 저장된 만큼만 반복하고 끝납니다.
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("몇명을 조회하시겠습니까");
		int limitNum = sc.nextInt();
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/employees";
		con = DriverManager.getConnection(url, "root", "mysql");
		stmt=con.createStatement();
		String sql = "SELECT emp_no, first_name, hire_date from employees limit " +limitNum;
		rs=stmt.executeQuery(sql);
		
		
		
	while (rs.next()) {
		int empNo = rs.getInt(1);
		String fName = rs.getString(2);
		Date hdate = rs.getDate(3);
		System.out.println("사번 : "+ empNo +  " 성 : " + fName + 
				" 입사일 : "+hdate);
		
	}
	
	} catch (ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
			
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		}
		  finally {
			try {
				if (con!= null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
			}
	}
	}

}
