<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row text-primary">
			<h1>로그인 창</h1>
		</div>
		<form action="/MyFirstWeb/login.do" method="post">
			<div class="row">
					<div class="col-md-2">
						<h4>아이디</h4>
					</div>
					<div class="col-md-4">
						<input type="text" name="uid" placeholder="ID" required><br/>
					</div>	
			</div>	
			<div class="row">
					<div class="col-md-2">
						<h4>비밀번호</h4>
					</div>
					<div class="col-md-4">
						<input type="password" name="upw" placeholder="PASSWORD" required><br/>
					</div>	
			</div>	
			
			<div class="row">
				<div class="col-md-1">
					<button type="submit" class="btn btn-primary">log in</button>
				</div>
				<div class="col-md-1">
					<a href ="http://localhost:8181/MyFirstWeb/users/user_join.jsp" class="btn btn-primary" role="button">sign in</a>
				</div>
			</div>
		</form>
	</div>
			
</body>
</html>