<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>회원가입</title>
</head>
<body>
	<!-- 아이디, 비밀번호, 이름, 이메일 4개 요소를 users_join.jsp
	로 보내주는 form을 작성해주세요. -->
	
	<div class="container">
			<h2>회원가입</h2>
		<form action="/MyFirstWeb/join.do" method ="post">
		<div class="row">
			<div class="col-md-5">
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text">ID</span>
					</div>
					<input type="text" name="id" required class="form-control">
				</div>
			</div>
		</div>
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text">PW</span>
				</div>
				<input type="text" name="pw" required class="form-control">
			</div>
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text">NAME</span>
				</div>
				<input type="text" name="name" required class="form-control">
			</div>
			<div class="input-group">
				<div class="input-group-prepend">
					<span class="input-group-text">EMAIL</span>
				</div>
				<input type="text" name="email" required class="form-control">
			</div>
		</form>
	</div>
	<h1>회원가입 창입니다</h1>
	<form action="/MyFirstWeb/join.do" method="post"><br/>
		<input type="text" name="id" placeholder="ID" required><br/>
		<input type="password" name="pw" placeholder="PW" required><br/>
		<input type="text" name="name" placeholder="NAME" required><br/>
		<input type="text" name="email" placeholder="EMAIL"><br/>
		<input type="submit" value="가입하기">
	</form>

</body>
</html>