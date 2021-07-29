<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Web프로그래밍</h2>
<%! 
	int count = 0;
	int i = (int)(Math.random()*2)+1;
	public String color() {
		double num = Math.random();
		if(num>=0.66) {
			return "빨강";
		} else if(num>=0.33) {
			return "노랑";
		} else return "파랑";
	}
		
%>
	<% 
	 int each=0;
	each++; 
	 count ++;
	 
	 %>
페이지 누적 요청 수 : <%= count %>
페이지 개별 요청 수 : <%= each %>
<h3>오늘의 행운의 숫자와 행운의 색깔</h3>
	행운의 숫자 :<b><%= (int)(Math.random()*10) +1 %></b><br>
	행운의 색깔 : <%= color() %>
	
	
	
</body>
</html>