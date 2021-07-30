<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>

<%
	String loginId = request.getParameter("loginId");
	String loginPw = request.getParameter("loginPw");
	
%>

<% if(loginId.equals("abcd")&&loginPw.equals("1234")){ %>

<html>
<head>
<meta charset="UTF-8">


<title>로그인 성공</title>
</head>
<body>
<h2>로그인 성공!!</h2><br>
<b><h2>abcd님 환영합니다.</h2></b>
</body>
</html>

<%}else if(loginId.equals("abcd")&&!loginPw.equals("1234")){%>

<html>
<head>
<meta charset="UTF-8">

<title>로그인 실패</title>
</head>
<body>
<b><h2>비밀번호가 틀렸습니다!!</h2></b>
<a href="req_login_form.jsp">로그인창으로 돌아가기</a>
</body>
</html>
<%}else { %>

<html>
<head>
<meta charset="UTF-8">

<title>로그인 실패</title>
</head>
<body>
<b><h2>아이디가 존재하지 않습니다!!</h2></b>
<a href="req_login_form.jsp">로그인창으로 돌아가기</a>
</body>
</html>

<%} %>