<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   <%
   	
   	String idSession=(String)session.getAttribute("session_id");
   if(idSession!=null) {
	   response.sendRedirect("users_login_ok.jsp");
   }
   %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<h1>로그인 창입니다</h1>
	<form action="users_login_ok.jsp" method="post">
		<input type="text" name="id" placeholder="ID"><br/>
		<input type="password" name="pw" placeholder="PASSWORD"><br/>
		<input type="submit" value="로그인">
		<input type="button" onClick="location.href='users_join_form.jsp'"
			value="회원가입">    
	</form>
</body>
</html>