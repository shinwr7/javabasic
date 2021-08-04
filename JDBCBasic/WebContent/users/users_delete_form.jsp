<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%String uid= (String)session.getAttribute("session_id");
   
   if(uid== null) {
 		response.sendRedirect("users_login_form.jsp");
 	}
   
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=uid %>님의 회원 탈퇴를 진행합니다.<br/>
	 비밀번호를 한 번 더 입력해주세요.
	 <form action="users_delete_ok.jsp" method="post">
	 	<input type="password" name="pw" placeholder="PASSWORD">
	 	<input type="submit" value ="확인">
	 </form>
	
	
</body>
</html>


