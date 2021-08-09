package kr.co.ictedu.board.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	// 싱글턴 패턴과 커넥션 풀을 적용해서
	// DAO의 연결부(생성자, getInstance())까지 작성해주세요.
	private static final String URL = "jdbc:mysql://localhost:3306/ict03";
	private static final String DBID = "root";
	private static final String DBPW = "mysql";
	
	private DataSource ds;

private BoardDAO() {
	try {
		
		Context ct = new InitialContext();
		ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}

private static BoardDAO dao = new BoardDAO() ;

public static BoardDAO getInstance() {
	return dao;
}
	
	
}
