<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
	int total =0;
	
%>



<%
	int random = (int)((Math.random()*8)+2);
	total++;
	out.println("페이지 누적 요청 수 : "+ total+"<br>");
	out.println("매 10번째 방문자에겐 기프티콘 드립니다."+"<br>");
	if(total==10) {
		out.println("당첨!!"+"<br>");
	}
%>
<hr>
<h2><b>랜덤 구구단(<%=random%>단)</b></h2><br>

이번에 나온 구구단은 <%=random%>단입니다.
<br>
<% 
	for(int num=1;num<=9;num++){
		out.println(random+" X "+num + " = "+ random*num+"<br>");
	}
%>


</body>
</html>