<%@page import="java.util.*" %>
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
 	int [] lotto = new int [6];
 	%>
 	
 	<% 
 	for (int i =0;i<=5;i++){
 			lotto[i]=(int)(Math.random()*45+1);
 		for(int loop=0;loop<i;loop++){
 		
 			if(lotto[i]==lotto[loop]){
 			i--;
 			break;
 			}
 			
 		}
 		
 	}
 	Arrays.sort(lotto);
 	%>
 	<p>
 		<b><h2>로또번호 생성 결과</h2></b>
 		이번주 로또는 이 번호다!! <br>
 		
 		<%=Arrays.toString(lotto) %>
 		
 	</p>
 	
 	
 
</body>
</html>