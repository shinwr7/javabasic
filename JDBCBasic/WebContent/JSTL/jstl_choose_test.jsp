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
	<c:choose>
		<c:when test="${param.grade >=90 && param.grade <=100}">
			<p>A학점입니다.</p>
		</c:when>
		<c:when test="${param.grade >=80 && param.grade <=100}">
			<p>B학점입니다.</p>
		</c:when>
		<c:when test="${param.grade >=70 && param.grade <=100}">
			<p>C학점입니다.</p>
		</c:when>
		<c:when test="${param.grade >=60 && param.grade <=100}">
			<p>D학점입니다.</p>
		</c:when>
		<c:otherwise> F학점입니다.</c:otherwise>
	</c:choose>
	 
</body>
</html>