<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   		response.setCharacterEncoding("utf-8");
   		request.setCharacterEncoding("utf-8");
   		
   		String id = request.getParameter("id");
   		String pw = request.getParameter("pw");
   			if(id.equals("shinwr7")&&pw.equals("shin8149")) {
   				response.sendRedirect("users_welcome.jsp");
   			} else {
   				response.sendRedirect("users_login_fail.jsp");
   			}
   
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