<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	// 0. post 방식 받아오기 처리
    	response.setCharacterEncoding("utf-8");
    	// 1. 아이디 비밀번호 확인
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String checkId = request.getParameter("id_check");
    	String checkPw = request.getParameter("pw_check");
    	System.out.println(checkId);
    	System.out.println(checkPw);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	// 아이디는 abc1234, 비밀번호는 aaa1111로 처리합니다. 
	
	// 로그인 성공 시 cookie_welcom.jsp로 보내주고
	
	// 로그인 실패 시 "로그인에 실패했습니다." 라고 브라우저에 띄워주세요.

	if(id.equals("abc1234")&&pw.equals("aaa1111")){
		
		// 로그인 처리를 위한 쿠키 발급 
		// 쿠키 이름 "user_id", 쿠키값은 로그인할때 사용한 id
		// 지속시간은 20초입니다. 
		// 완성 후 쿠키 발송까지 아래에 작성해주세요.
		Cookie idCookie = new Cookie("user_id", id);
		idCookie.setMaxAge(1800);
		response.addCookie(idCookie);
		
		// 체크박스 체크 되어 있을 경우, 아이디 비밀번호 자동입력을 위한
		// 쿠키를 발급하기(20)
		// "rememeber_id", "remember_pw"를 쿠키 이름으로
		// id, pw를 쿠키값으로 가지는 쿠키 2개를 생성해 발송까지 해주세요.
		
		if (checkId!=null && checkId.equals("yes")) { 
		Cookie reIdCookie= new Cookie("remember_id", id);
		reIdCookie.setMaxAge(20);
		response.addCookie(reIdCookie);
		}
		if(checkPw!=null && checkPw.equals("yes")){
		Cookie rePwCookie= new Cookie("remember_pw", pw);
		rePwCookie.setMaxAge(20);
		response.addCookie(rePwCookie);
		}
		
		
		response.sendRedirect("cookie_welcome.jsp");
	}
	else {
		out.println("로그인에 실패했습니다.<br/>");
	}
	// 2. checkbox가 체크되었는지 여부도 받아옵니다.
	

%>
</body>
</html>