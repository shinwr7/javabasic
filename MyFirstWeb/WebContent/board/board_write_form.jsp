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
				<h1>글쓰기</h1>
			</div>
		<form action="/MyFirstWeb/boardwrite.do" method="post">
			<div class="row text-primary">
				<div class="col-md-1">
					글 제목
				</div>
				<div class="col-md-4">
					<input type ="text" class="form-control" name="title" required>
				</div>
			</div>
			<div class="row text-primary">
				<div class="col-md-1">본문</div>
				<div class="col-md-4">
					<textarea cols="50" rows ="10" class="form-control" name="content" required></textarea>
				</div>
			</div>
			<div class="row text-primary">
				<div class="col-md-1">글쓴이</div>
				<div class="col-md-4">
					<input type ="text" class="form-control" value="${i_s}" required>
				</div>
			</div>
			<div class="row">
				<div class="btn-group col-md-2">
					<input type="submit" class="btn btn-primary" value="글쓰기">
					<input type="reset" class="btn btn-primary" value="초기화">
				</div>
			
			</div>
		</form>
	</div>
	
</body>
</html>