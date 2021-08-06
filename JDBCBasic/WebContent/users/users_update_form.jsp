<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="kr.co.ictedu.UsersVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   
	//1. 세션을 통해 아이디 받아오기
  	// 만약 로그인 상태가 아니면 로그인창으로 리다이렉트 합니다. 
  	
  	//2. dao를 통해서 UsersVO를 가지고 와야 합니다.
  	
  	//3. 들고온 UsersVO를 이용해 아래 html태그의 value 속성에
  	// UsersVO의 아이디, 이름, 이메일을 기입하게 만들어줍니다.
  	response.setCharacterEncoding("utf-8");
  	request.setCharacterEncoding("utf-8");
  	
   String s_id = (String)session.getAttribute("session_id");
	
	UsersDAO dao = UsersDAO.getInstance();
	
	// new 키워드 이용해서 생성했기에, 이 때 user는 데이터를 못받았더라도 ? null이 아님!(주소값이 들어있음)
	UsersVO user = new UsersVO ();
	
	
	if(s_id==null){
		session.invalidate();
		response.sendRedirect("users_login_form.jsp");
		
	}
		user.setUid(s_id);
	 	UsersVO resultData = dao.getUserInfo(user);
	 	
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=resultData.getUid()%>계정 정보 수정</h1>
	<form action="users_update_ok.jsp" method="post">
	<input type="text" name="id" value =<%=resultData.getUid() %> readonly required placeholder ="ID">아이디 수정<br/>
	<input type="text" name="pw" placeholder="PASSWORD" required>비밀번호 수정<br/>
	<input type="text" name="name" value="<%=resultData.getUname() %>" placeholder = "NAME" required>이름 수정<br/>
	<input type="text" name="email" value="<%=resultData.getEmail()%>" placeholder = "EMAIL">이메일 수정<br/>
	<input type="submit" value="계정정보 수정하기"><br/>
	
	</form>
</body>
</html>

