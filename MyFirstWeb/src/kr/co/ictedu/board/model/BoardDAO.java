package kr.co.ictedu.board.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;


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
	if(dao == null) {
	dao = new BoardDAO();
	} return dao;
	} 

	public int write(BoardVO board) {
		// Connection, PreparedStatement 객체 선언
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode ;
		//구문 작성
		//bID는 auto_increment가 붙어있으므로 입력 안해도됌
		//bName, bTitle, bContent는 폼에서 날려준걸 넣음
		//bDate는 자동으로 현재 서버시각을 입력함
		// bHit는 자동으로 0을 입력
		String sql = "INSERT INTO jspboard" +
				"(bname, btitle, bcontent, bdate, bhit)" +
				"VALUES (?, ?, ?, now(), 0)";
		try { 
			
		
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, board.getBname());
			pstmt.setString(2, board.getBtitle());
			pstmt.setString(3, board.getBcontent());
			
			pstmt.executeUpdate();
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리회수까지 해주세요.
			resultCode = 1;
		} catch(Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try {
				if(con!=null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	} // write 끝
	
	// 모든 게시글의 정보를 DB로부터 얻어올 메서드 
	public List<BoardVO> getBoardList() {
		// 내부에서 사용할 변수 선언
		List<BoardVO> boardList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null ;
		ResultSet rs = null;
		
		// SQL문 작성
		String sql = "SELECT * FROM jspboard ORDER BY bid desc";
		
		
		
		try {
		con = ds.getConnection();
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		
		while(rs.next()) {
			BoardVO board = new BoardVO();
			board.setBtitle(rs.getString("btitle"));
			board.setBname(rs.getString("bname"));
			board.setBid(rs.getInt("bid"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBdate(rs.getTimestamp("bdate"));
			board.setBhit(rs.getInt("bhit"));
			
			
			boardList.add(board);
		}
				
		} catch (Exception e){
			e.printStackTrace();
		}
	
		finally {
		
		try {
			if(con!=null && !con.isClosed()) {
				con.close();
			}
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
			if(rs !=null && !rs.isClosed()) {
				rs.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
		return boardList;
}// getBoardList 끝
	
	
	// 글 하나에 대한 상세 정보를 가져오는 로직
	public BoardVO getBoardDetail(String bId) {
		// bId에 해당하는 글 정보를 가져와서 리턴하도록 로직 작성해주셍
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO board = new BoardVO();
		
		String sql = "SELECT * FROM jspboard WHERE bid=?";
		
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bId);
			rs=pstmt.executeQuery();
			
			
			if(rs.next()) {
				board.setBid(rs.getInt("bid"));
				board.setBname(rs.getString("bname"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBhit(rs.getInt("bhit"));
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null&&!con.isClosed() ) {
					con.close();
				}
				if(pstmt!=null&&!pstmt.isClosed() ) {
					pstmt.close();
				}
				if(rs!=null&&!rs.isClosed() ) {
					rs.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		} return board;
	}// getBoardDetail 끝
	
	public int delete(String bid) {
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode ;
		
		String sql = "DELETE FROM jspboard WHERE bid=?";
				
		try { 
			
		
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bid);
			
			pstmt.executeUpdate();
			
			resultCode = 1;
		} catch(Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try {
				if(con!=null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	} // delete 끝

	public int update(BoardVO board) {
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode ;
		//구문 작성
		//bID는 auto_increment가 붙어있으므로 입력 안해도됌
		//bName, bTitle, bContent는 폼에서 날려준걸 넣음
		//bDate는 자동으로 현재 서버시각을 입력함
		// bHit는 자동으로 0을 입력
		String sql = 
			"UPDATE jspboard SET btitle=?, bcontent=?, bhit=?, bname=?, bdate=? WHERE bid=?";
		try { 
			
		
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setInt(3, board.getBhit());
			pstmt.setString(4, board.getBname());
			pstmt.setTimestamp(5, board.getBdate());
			pstmt.setInt(6, board.getBid());
			pstmt.executeUpdate();
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리회수까지 해주세요.
			resultCode = 1;
		} catch(Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try {
				if(con!=null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	} // update 끝
	
	public void upHit(String bid) {
		// 필요 변수들을 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// 특정 글의 조회수를 1 올리는 쿼리문
		String sql = "UPDATE jspboard SET bhit = bhit + 1 " +
		"WHERE bid = ?";
		
		
		// DB 연결 후 코드 실행
		try { 
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bid);
			pstmt.executeUpdate();
			
					
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(con!=null&&!con.isClosed()) {
					con.close();
				}
				if(pstmt!=null&&!pstmt.isClosed()) {
					pstmt.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // upHit 끝
	
	public List<BoardVO> getPageList(int pageNum) {
		// 내부에서 사용할 변수 선언
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		String sql = "SELECT * FROM jspboard ORDER BY bid DESC limit ?, 10";
		// 쿼리문(SELECT 구문, 역순, 10개씩 pageNum에 맞춰서);
		
			try {	
				
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, pageNum);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					BoardVO board = new BoardVO();
					board.setBid(rs.getInt("bid"));
					board.setBname(rs.getString("bname"));
					board.setBtitle(rs.getString("btitle"));
					board.setBcontent(rs.getString("bcontent"));
					board.setBdate(rs.getTimestamp("bdate"));
					board.setBhit(rs.getInt("bhit"));
					
					boardList.add(board);
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			
			} finally {
				
				try {
					if(con!=null && !con.isClosed()) {
						con.close();
					}
					if(pstmt != null && !pstmt.isClosed()) {
						pstmt.close();
					}
					if(rs !=null && !rs.isClosed()) {
						rs.close();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
		
	} return boardList;
			
	}// paging 끝
	
	public int getCountBoard() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int countBoard = 0 ;
		
		String sql = "SELECT COUNT(*) FROM jspboard";
		
		try {
			con = ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
			countBoard = rs.getInt(1);
			}
			
					
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null&&!con.isClosed()) {
					con.close();
				}
				if(pstmt!=null&&!pstmt.isClosed()) {
					con.close();
				}
				if(rs!=null&&!rs.isClosed()) {
					rs.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return countBoard;
	}
	
}
	

