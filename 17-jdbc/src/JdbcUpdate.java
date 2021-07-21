import java.sql.*;
import java.util.Scanner;
public class JdbcUpdate {
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 글 번호를 입력해주세요.");
		int num = sc.nextInt();
		System.out.println("수정할 str 값을 입력해주세요.");
		String str = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/employees";
			con = DriverManager.getConnection(url, "root", "mysql");
			stmt = con.createStatement();
			// 쿼리문이 길다면 아래와 같이 + 로 여러줄 나눠 연결합니다.
			String sql = "UPDATE JDBCInsert SET str = '" + str + "'" + 
						" WHERE num = "+ num;
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