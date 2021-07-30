<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 계산 웹어플리케이션</title>
</head>
<body>
	<h2>BMI 계산 웹 어플리케이션</h2>
<% 
	double height = (Double.parseDouble(request.getParameter("height")))/100;	
	int weight = Integer.parseInt(request.getParameter("weight"));	
	double bmi= weight/(height*height);
%>

<h3>키 : <%=height %>m</h3><br>
<h3>몸무게 : <%=weight %></h3>	<br>
<h2>당신의 bmi 지수</h2><br>


<b><%=bmi %></b><br>
<%if(bmi>23) { %>
당신은 과체중입니다.
<%}else if(bmi<18.5){ %>
당신은 저체중입니다.
<%}else { %>
당신은 표준체중입니다.
<%} %>
</body>
</html>