<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 계산 웹어플리케이션</title>
</head>
<body>
	<form action="req_bmi_result.jsp" method="post">
		신장 : <input type="text" name ="height" size="25px">cm &nbsp;<br>
		체중 : <input type="text" name ="weight" size="25px">kg &nbsp;<br>
		<input type="submit" name ="제출"> &nbsp;
		<input type="reset" name ="초기화"> &nbsp;
		
	
	
	
	</form>
</body>
</html>