<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String travel= request.getParameter("place"); %>
	
	<% switch (travel) {
	
			case "Japan": response.sendRedirect("travel_Japan.jsp");
			break;
			
			case "Phillipin": response.sendRedirect("travel_Phillipin.jsp");
			break;
			
			case "Vietnam": response.sendRedirect("travel_Vietnam.jsp");
			break;
			
			case "Indonsia": response.sendRedirect("travel_Indonesia.jsp");
			break;
	}
	
	 %>
</body>
</html>