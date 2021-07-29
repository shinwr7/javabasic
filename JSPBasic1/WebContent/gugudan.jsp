<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

</head>

<body>
<%for(int i =2;i<=9;i++) {
	if(i%2!=0){%>
<h2>구구단 <%out.println(i);%>단</h2>
<hr/>
	<%for(int loop=1;loop<=9;loop++)
	{ out.println("<p>"+i+" * "+loop+" = "+(i*loop)+"</p>");} %>
	
<% }}%>
</body>

</html>