<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	Connection con = null;
    	PreparedStatement pstmt = null;
    	
    	response.setCharacterEncoding("utf-8");
    	request.setCharacterEncoding("utf-8");
    	
    	String uid = request.getParameter("id");
    	String upw = request.getParameter("pw");
    	String uname = request.getParameter("name");
    	String email = request.getParameter("email");
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		String url = "jdbc:mysql://localhost/ict03";
    		con = DriverManager.getConnection(url, "root", "mysql");
    		String sql = "INSERT INTO users VALUES(?, ?, ?, ?)";
    		pstmt = con.prepareStatement(sql);
    		pstmt.setString(1, uid);
    		pstmt.setString(2, upw);
    		pstmt.setString(3, uname);
    		pstmt.setString(4, email);
    		
    		pstmt.executeUpdate();
    		
    	}	catch(ClassNotFoundException e) {
    		System.out.println("드라이버 로딩 실패");
    	}	catch(SQLException e) {
    		System.out.println("에러 : "+ e);
    	} finally {
    		try { 
    			if(con!=null && !con.isClosed()) {
    			con.close();
    		}
    			
    		} catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<h1>회원가입을 축하합니다!</h1>
</body>
</html>