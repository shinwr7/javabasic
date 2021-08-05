<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    
 <%
 
 	UsersDAO dao = UsersDAO.getInstance() ;
 	
 	response.setCharacterEncoding("utf-8");
 	request.setCharacterEncoding("utf-8");
 	String c_id = request.getParameter("id");
 	String c_pw = request.getParameter("pw");
 	String c_name = request.getParameter("name");
 	String c_email = request.getParameter("email");
 	
 	UsersVO user = new UsersVO(c_id, c_pw, c_name, c_email);
 	if(c_pw!=null&&c_name!=null&&c_email!=null){
 		dao.usersUpdate(user);
 	}else {
 		out.println("입력하지 않은 정보가 있습니다.");
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
</body>
</html>