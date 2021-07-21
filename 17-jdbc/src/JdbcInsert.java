import java.sql.*;
import java.util.Scanner;
public class JdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Connection con = null;
	Statement stmt = null;
	// ResultSet은 SELECT 구문에 대한 결과만 처리함. 이외 구문에는 불필요.
	Scanner sc= new Scanner(System.in);
	System.out.println("num컬럼값을 입력하세요.");
	int num = sc.nextInt();
	
	System.out.println("str컬럼값을 입력하세요.");
	String str = sc.next();
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/employees";
		con = DriverManager.getConnection(url, "root", "mysql");
		stmt = con.createStatement();
		// 쿼리문이 길다면 아래와 같이 + 로 여러줄 나눠 연결합니다.
		String sql = "INSERT INTO JDBCInsert (num, str)" + 
					"VALUES ("+num+", '"+str+"')";
		// 소따옴표 빼먹지마 ..
		// 잘 돌아가고 있나 알아보려면
		System.out.println(sql); //해보면 암
		// SELECT 문은 executeQuery(sql구문); 형식으로 호출하지만
		// 이외 구문은 executeUpdate(sql구문); 으로 호출합니다. 
		stmt.executeUpdate(sql);
		
		
		
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패");
	} catch (SQLException e) {
		System.out.println("에러 : " + e);
	} finally {
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
