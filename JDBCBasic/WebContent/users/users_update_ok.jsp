<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    
 <%
 	response.setCharacterEncoding("utf-8");
 	request.setCharacterEncoding("utf-8");
 
 	UsersDAO dao = UsersDAO.getInstance() ;
 	
 	String c_id = request.getParameter("id");
 	String c_pw = request.getParameter("pw");
 	String c_name = request.getParameter("name");
 	String c_email = request.getParameter("email");
 	
 	UsersVO user = new UsersVO(c_id, c_pw, c_name, c_email);
 	
 	int updateResultNum=dao.usersUpdate(user);
 	 if(updateResultNum==0) {
 		 response.sendRedirect("user_update_fail.jsp");
 	 }
 	
 %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 정보가 수정되었습니다!</h1>
	<a href="users_update_form.jsp">수정된 정보 보기</a>
	<a href="users_login_form.jsp">로그인창 돌아가기</a>
</body>
</html>