<%@page import="java.sql.*"%>
<%@page import="org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <% 
   	//DB 연동을 위한 Connector 설정
   	
   	Connection con = null;
   	Statement stmt = null;
   try {
	   //MySQL 과 연동할것임을 나타냄
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   // 접속 URL은 jdbc:mysql://localhost/db명
	   String url = "jdbc:mysql://localhost/employees";
	   
	   //접속 주소, 계정. 비밀번호를 이용해 접속요청을 넣습니다. 
	   con = DriverManager.getConnection(url, "root", "mysql");
	   
   } catch(ClassNotFoundException e) {
	 System.out.println("드라이버 로딩 실패");  
   } catch(SQLException e){
	 System.out.println("에러 : "+ e);
   } finally {
	   try {
		   if(con!=null && !con.isClosed()){
			   con.close();
		   }
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }
   }
   
   // 회원제 게시판 만들기
   // 1.회원가입
   // 2.회원탈퇴
   // 3.회원조회
   // 4.회원수정
   // 회원 가입한 사람들만 게시판 쓸 수 있도록 처리.
   
   // 테이블 생성 : 아이디, 비밀번호, 이름, 이메일
   // 테이블 명 - users
   %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>