import java.sql.*;
import java.util.Arrays;
public class OjdbcSelect {
	
	
	public static void main(String[] args) {
		// Oracle SQL과 연동해서
		// Employees 테이블의 모든 인원에 대한 정보를
		// 콘솔창에 띄워주세요.
		// SELECT * FROM employees;
		// 에 대한 결과물을 콘솔창에 띄워주시면 됩니다. 
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "hr", "hr");
			stmt = con.createStatement();
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, JOB_ID, SALARY FROM employees "
					+ "ORDER BY EMPLOYEE_ID";
			rs=stmt.executeQuery(sql);
			String [] title = {"e_ID", "eName", "H_DATE", "J_ID", "SALARY"};
			System.out.println(Arrays.toString(title));
			
			while(rs.next()) {
				String e_Id = Integer.toString(rs.getInt(1));
				String eName=rs.getString(2);
				Date hd = rs.getDate(3);
				String jId = rs.getString(4);
				String salary = Integer.toString(rs.getInt(5));
				String [] empList = {e_Id, eName, hd.toString(), jId, salary};
				System.out.println(Arrays.toString(empList));
			}
			
			
			
		} catch(ClassNotFoundException e) {
				System.out.println("드라이버 로딩 실패");
			
		} catch(SQLException e){
				System.out.println("예외 : " + e);
		} finally {
			try {
				if(con!=null&&!con.isClosed()) {
					con.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
