<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String joinId = request.getParameter("joinId");
	String joinPw = request.getParameter("joinPw");
%>
<!DOCTYPE html>
<html>

<% if(joinId.equals("abcd")) {%>

<head>
<meta charset="UTF-8">
<title>회원가입 실패!</title>
</head>
<body>
<b><%= joinId %></b>는 중복된 아이디입니다. 다른 아이디로 다시 가입해주세요.
<a href="req_join_form.jsp">회원가입창으로 돌아가기</a>
</body>

<% }else { %>

<head>
<meta charset="UTF-8">
<title>회원가입 성공!</title>
</head>
<body>
<b><%= joinId %></b>님 회원가입을 축하합니다!<br/>
<a href="req_login_form.jsp">로그인창으로 돌아가기</a>
</body>

<%} %>

</html>




