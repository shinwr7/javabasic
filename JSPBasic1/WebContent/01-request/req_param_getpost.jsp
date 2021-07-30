<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	// 한글 데이터가 POST 전송시 깨지지 않도록 처리.
	request.setCharacterEncoding("utf-8");
	// 폼에서 던진 데이터를 받기 위해서는 request.getParameter("name값")
	// 을 활용합니다. 
	// name="apple" 에서 던져진 데이터를 받기 위해서는
	String id = request.getParameter("id");
	// name="banana" 에서 던져진 데이터를 받기 위해서는
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	String [] hobby = request.getParameterValues("hobby");
	String [] talent = request.getParameterValues("talent");
	String gender = request.getParameter("gender");
	String food = request.getParameter("짜장짬뽕");
	String region = request.getParameter("region");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <b><%=id %></b><br/>
	닉네임 : <b><%= nick %></b><br/>
	비밀번호 : <b><%= pw %></b><br/>
	취미 : 
	<% for(String name : hobby) {%>
	<b><%= name %></b>
	<%} %>&nbsp;
	<br>
	특기 : <%=Arrays.toString(talent) %>
	<br>
	성별 : <b><%= gender %></b>
	<br>
	짜장짬뽕 : <b><%= food %></b>
	<br>
	지역 : <b><%= region %></b>
	

</body>
</html>