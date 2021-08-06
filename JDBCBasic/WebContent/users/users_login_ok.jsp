<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   		response.setCharacterEncoding("utf-8");
   		request.setCharacterEncoding("utf-8");
   		
   		String uid = request.getParameter("id");
   		String upw = request.getParameter("pw");
   		
   		String idSession=(String)session.getAttribute("session_id");
   		
   	   if(idSession!=null) {
   		   uid = idSession;
   	   } else{
   		
		UsersVO user = new UsersVO();
   		UsersDAO dao = UsersDAO.getInstance();
 	 	int loginResultNum=dao.usersLogin(user, uid, upw);
 	 	
		if(loginResultNum==1) {
		session.setAttribute("session_id", uid);
		session.setAttribute("session_pw", upw);
		
		System.out.println("로그인 세션 아이디 : "+ (String)session.getAttribute("session_id"));
		System.out.println("로그인 세션 비밀번호 : "+ (String)session.getAttribute("session_pw"));
		
		}else {
			response.sendRedirect("users_login_fail.jsp");
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
		<a href ="users_logout.jsp">로그아웃</a><br/>
		<a href ="users_delete_form.jsp">회원탈퇴</a><br/>
		<a href ="users_update_form.jsp">회원정보 수정</a><br/>
		<a href ="users_get_all.jsp">회원 전체 목록 보기</a>
	</body>
	</html>
   