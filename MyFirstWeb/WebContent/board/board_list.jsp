<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시물 목록</h1>
	테이블 형태로 작성
	출력한 자료들은 
	글번호, 글제목, 글쓴이, 글쓴날짜, 조회수 순으로 테이블에 출력

	
		<table border="1">
			<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>쓴날짜</th>
				<th>조회수</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList }">
			<tr>
				<td>${board.bid }</td>
				<td><a href="/MyFirstWeb/boarddetail.do?bid=${board.bid }">${board.btitle }</a></td>
				<td>${board.bname }</td>
				<td>${board.bdate }</td>
				<td>${board.bhit }</td>
			</tr>
				</c:forEach>
			</tbody>
		</table>
	
	
</body>
</html>