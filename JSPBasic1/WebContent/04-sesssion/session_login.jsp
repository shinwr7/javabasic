<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	Cookie [] cookies = request.getCookies();
    	
    	for(Cookie c : cookies) {
    		String s = c.getName();
    		if(s.equals("log_fail")) {
    			out.println(c.getValue());
    			c.setMaxAge(0);
    			response.addCookie(c);    		
    			}
    		
    		}
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="session_login_ok.jsp" method="post">
		<input type="text" name="id" placeholder="아이디"><br/>
		<input type="password" name="pw" placeholder="비밀번호"><br/>
		<input type="text" name="nickname" placeholder="닉네임"><br/>
		<input type="submit" value="확인">
		
	
	</form>


</body>
</html>