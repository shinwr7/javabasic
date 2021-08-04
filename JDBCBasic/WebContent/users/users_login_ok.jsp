<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   		response.setCharacterEncoding("utf-8");
   		request.setCharacterEncoding("utf-8");
   		
   		String uid = request.getParameter("id");
   		String upw = request.getParameter("pw");
   		
   		String idSession = (String)session.getAttribute("session_id");
   		
   		Connection con = null;
   		PreparedStatement pstmt = null;
   		ResultSet rs = null;
   		
   		if(idSession!=null){
   			uid = idSession;
   		}else {
	   		try {
	   			Class.forName("com.mysql.jdbc.Driver");
	   			String url="jdbc:mysql://localhost/ict03";
	   			con=DriverManager.getConnection(url, "root", "mysql");
	   			String sql = "SELECT * FROM users WHERE uid=?";
	   			pstmt=con.prepareStatement(sql);
	   			pstmt.setString(1, uid);
	   			rs=pstmt.executeQuery();
	   			
	   			
	   			if(rs.next()){
	   				String db_id = rs.getString("uid");
	   				String db_pw = rs.getString("upw");
	   			
	   			System.out.println("조회된 아이디" + db_id);
	   			System.out.println("조회된 비밀번호" + db_pw);
	   			
	   				if(upw.equals(db_pw)) {
	   				session.setAttribute("session_id", uid);
	   				session.setAttribute("session_pw", upw);
	   				
	
	   				
	   				
	   				
	   				}else {
	   					response.sendRedirect("users_login_fail.jsp");
	   				}
	   			
	   			}
	   			else {
	   				response.sendRedirect("users_login_fail.jsp");
	   			}
	   			
	
	   			
	   			
	   			
	   			
	   
	   	 } catch(ClassNotFoundException e) {
	   		 System.out.println("드라이버 로딩 실패");  
	   	   } catch(SQLException e){
	   		 System.out.println("에러 : "+ e);
	   	   } finally {
	   		   try {
	   			   if(con!=null && !con.isClosed()){
	   				   con.close();
	   			   }
	   			   if(pstmt!=null && !pstmt.isClosed()){
	   				   pstmt.close();
	   			   }
	   			   if(rs!=null && !rs.isClosed()) {
	   				   rs.close();
	   			   }
	   		   }catch(SQLException e) {
	   			   e.printStackTrace();
	   		   }
	   	   }
   		}
   		
   		
   		
   %>
    <!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>로그인 성공</title>
	</head>
	<body>
		<h1><%=uid %>님 환영합니다!</h1><br/>
		<a href ="users_logout.jsp">로그아웃</a>
		<a href ="users_delete_form.jsp">회원탈퇴</a>
	</body>
	</html>
   