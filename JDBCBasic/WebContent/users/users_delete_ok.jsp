
<%@ page import = "java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 
 <%
 	response.setCharacterEncoding("utf-8");
 	request.setCharacterEncoding("utf-8");
 	
 	String uid = (String)session.getAttribute("session_id");
 	String upw = request.getParameter("pw");
 	String s_pw = (String)session.getAttribute("session_pw");
 	
 	
 	Connection con = null;
 	PreparedStatement pstmt = null;
 	
 	
 	
 	if(upw.equals(s_pw)) {
 		
 		try {
 			
 			
 			Class.forName("com.mysql.jdbc.Driver");
 			String url="jdbc:mysql://localhost/ict03";
 			con=DriverManager.getConnection(url,"root","mysql");
 			String sql="DELETE FROM users WHERE uid=?";
 			pstmt=con.prepareStatement(sql);
 			pstmt.setString(1, uid);
 			pstmt.executeUpdate();
 			
 			
 		} catch(ClassNotFoundException e) {
 			System.out.println("드라이버 로딩 실패");
 		} catch(SQLException e) {
 			System.out.println("에러 : "+e);
 		} finally {
 			try {
 				if(con!=null && !con.isClosed()){
	   				   con.close();
	   			   }
	   			   if(pstmt!=null && !pstmt.isClosed()){
	   				   pstmt.close();
	   			   }
 			} catch(SQLException e) {
 				e.printStackTrace();
 			}
 		}
 		
 		// 세션 파기는 두번 실행할 수 없으므로
 		// 로직당 한 번만 실행되도록 배치한다.
 		session.invalidate();
 		
 	} else {
 		session.invalidate();
 		response.sendRedirect("users_login_form.jsp");
 	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<h3>회원 탈퇴가 완료되었습니다!</h3>
	<a href="users_login_form.jsp">로그인창으로 돌아가기</a>
	
</body>
</html>