<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/kfonts2.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- bootstrap.js -->
<script src="../js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<h1>게시물 목록</h1>
	테이블 형태로 작성
	출력한 자료들은 
	글번호, 글제목, 글쓴이, 글쓴날짜, 조회수 순으로 테이블에 출력

	
		<table class = "table table-bordered">
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
				<td><span class="badge bg-primary">${board.bid }</span></td>
				<td><a href="/MyFirstWeb/boarddetail.do?bid=${board.bid }">${board.btitle }</a></td>
				<td><span class="badge badge-pill bg-primary">${board.bname }</span></td>
				<td>${board.bdate }</td>
				<td>${board.bhit }</td>
			</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<%-- 페이징 버튼 만들기 
			표현할 글이 있는 경우에만 버튼을 표시함--%>
		
		<%-- 뒤로가기 버튼을 표시할지 말지 결정하는 부분 --%>
		<c:if test="${pageDTO.hasboard() }">
			<%--표현할 글이 있다면 부트스트랩 페이징처리 적용 --%>
			<ul class="pagination justify-content-center">
			
				<c:if test="${pageDTO.startPage>10 }">
					<li class="page-item"><a href="/MyFirstWeb/boardselect.do?page=${pageDTO.startPage-10 }">[prev]</a></li>
				</c:if>
			
			<%-- 페이지 번호 10개 묶음을 깔아주는 부분 --%>	
				<c:forEach var="pNo" begin="${pageDTO.startPage }" end="${pageDTO.endPage }">
					<li class="page-item"><a href="/MyFirstWeb/boardselect.do?page=${pNo }">[${pNo}]</a></li>
				</c:forEach>
				
			<%-- 다음으로 가기 버튼을 표시할지 말지 결정하는 부분 --%>	
				<c:if test="${pageDTO.endPage<pageDTO.totalPages }">
					<li class="page-item"><a href="/MyFirstWeb/boardselect.do?page=${pageDTO.startPage + 10 }">[next]</a></li>
				</c:if>
			
			</ul><%--페이지네이션 종료 --%>
		</c:if>
		<br/>
		<%-- 페이징 부분 끝 --%>
		<div class ="text-primary">
	<form><a href="/MyFirstWeb/board/board_write_form.jsp"><button type="button" class="btn btn-primary">글쓰기</button></a>
		<a href="/MyFirstWeb/logout.do"><button type="button" class="btn btn-warning">로그아웃</button></a></form>
		</div>
			
		
			
</body>
</html>