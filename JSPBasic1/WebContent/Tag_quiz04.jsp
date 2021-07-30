<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String [] party= new String [10]; 
	String [] player={"도적", "사제", "마법사", "전사", "궁수"};
	int loop=0;
	int num = 0;
	int count=0;
%>
<%
	int i = (int)(Math.random()*5);
	count+=1;
%>
<b><h1> 당신의 역할</h1></b><br>
<p>당신에게 부여된 역할은 <%=player[i] %>입니다.</p>
<% for(;loop<=9;) {
		party[loop]=player[i].toString();
		loop++;
		break;
			}
	for(String member:party) {
		if(player[i].equals(member)) {
			num++;
		}
		
	}

	
	%>
	
<p>현재 파티에 당신과 같은 역할을 가진 플레이어는 <%=num %>명입니다.<br></p>
<% num=0; %>
<p>현재 파티 구성<br>
<% out.println(Arrays.toString(party));%>





</body>
</html>