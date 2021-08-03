<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
  	Cookie [] Cookies = request.getCookies();
  	// 로그인 창 만든 이후에 이미 로그인한 사람이 로그인창으로 오면
  	// 바로 로그인 완료창으로 보내주기 위해 작성할 부분입니다. 
  	// "user_id" 쿠키 존재 여부를 따져서 리다이렉트 시킵니다. 
  	for(Cookie c : Cookies) {
  		String s = c.getName();
  		if(s.equals("user_id")) {
  			response.sendRedirect("cookie_welcome.jsp");
  		}
  	}
  	
  	// 만약 아이디/비밀번호 기억하기가 체크되어 있는 경우
  	// 처리해주기 위해 쿠키에서 아이디/비밀번호 값을 추출하는 로직
  	//cookie_welcome.jsp 상단의 처리로직을 참고
  	String idMemory = "";
  	String pwMemory = "";
  	
  	if(Cookies ==null) {
  		System.out.println("쿠키가 없습니다.");
  	}else {
  	// cookies 변수에 쿠키가 여러개 들어있음.
  	// 반복문을 이용해 하나하나 c에 번갈아가면서 한번씩 대입해서 코드 진행
  	for(Cookie c : Cookies) {
  		//개별 쿠키의 이름을 s 변수에 저장
  		String s = c.getName();
  		
  		// 저장한 쿠키의 이름이"remember_id"인 경우
  		if(s.equals("remember_id")) {
  			// idMemory 변수에 remember_id 변수에 저장해둔
  			// 로그인 아이디를 저장
  			idMemory = c.getValue();
  			
  			
  			// 패스워드도 마찬가지로.
  		}if(s.equals("remember_pw")){
  			pwMemory = c.getValue();
  			
  		}
  	}
  	// 저장받은 아이디/패스워드가 실제로 들어오는지 확인. 
  	System.out.println(idMemory);
  	System.out.println(pwMemory);
  	}
  %>  
  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 로그인폼에는 checkbox를 이용해 자동로그인 여부까지 체크합니다. -->
	
	<form action="cookie_login_ok.jsp" method="post">
		<input type="text" name="id" placeholder="ID"
			value="<%=idMemory%>"/>
		<input type="checkbox" name="id_check" value="yes"/>
		아이디 기억하기<br/>
		<input type="password" name="pw" placeholder="PW" 
			value="<%=pwMemory%>"/>
		<input type="checkbox" name="pw_check" value="yes"/>
		비밀번호 기억하기<br/>
		<input type="submit" value="로그인"/>
	</form> 

</body>
</html>