<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
    	response.setCharacterEncoding("utf-8");
    	request.setCharacterEncoding("utf-8");
    	
    	String uid = request.getParameter("id");
    	String upw = request.getParameter("pw");
    	String uname = request.getParameter("name");
    	String email = request.getParameter("email");
    	
    	// 기존에 있던 회원가입 로직은 DAO클래스로 이관합니다.
    	// DAO 클래스 받아오기
    	UsersDAO dao = UsersDAO.getInstance();
    	
    	// VO 객체 생성 및 uid, upw, uname, uemail setter로 입력해주기
    	UsersVO user = new UsersVO(uid, upw, uname, email);
    	
    	dao.joinUsers(user);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<h1>회원가입을 축하합니다!</h1>
	<a href ="users_login_form.jsp">로그인 하러가기</a>
</body>
</html>