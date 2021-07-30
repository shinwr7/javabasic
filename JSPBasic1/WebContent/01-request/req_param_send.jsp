<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객체에 파라미터 전달 예제</title>
</head>
<body>
	<!-- form 내부에 input 4개를 만들어주세요
		input 태그의 type 속성은 하나는 text 하나는 password
		name 속성은 하나는 apple 하나는 banana로 해주세요.
		제출 버튼, 리셋버튼도 각각 하나씩 만들어주세요. -->

	<!--form 태그의 action은 데이터가 전달될 목적지입니다.
	현재, req_param_getpost로 날릴 예정입니다.  -->
<form action="req_param_getpost.jsp" method="post">
<!-- 가장 기본이 되는 input태그 -->
	<input type="text" name="id"/>아이디<br>
	<input type="text" name="nick"/>닉네임<br>
	<input type="password" name="pw"/>비밀번호<br>
	
	<!-- 체크박스 -->
	취미 : 
	<input type="checkbox" name="hobby" value="요리">요리&nbsp;
	<input type="checkbox" name="hobby" value="운동">운동&nbsp;
	<br>
	
	특기 :
	<input type="checkbox" name="talent" value="악기연주">악기연주&nbsp;
	<input type="checkbox" name="talent" value="노래">노래&nbsp;
	<input type="checkbox" name="talent" value="축구">축구&nbsp;
	<input type="checkbox" name="talent" value="수영">수영&nbsp;
	<input type="checkbox" name="talent" value="성대모사">성대모사&nbsp;
	<br>
	<!-- 성별은 하나만 골라야 하므로 radio를 사용합니다. -->
	<input type="radio" name="gender" value="male">male&nbsp;
	<input type="radio" name="gender" value="female">female&nbsp;
	<br>
	<input type="radio" name="짜장짬뽕" value="짜장">짜장&nbsp;
	<input type="radio" name="짜장짬뽕" value="짬뽕">짬뽕&nbsp;
	<br>
	<!-- select 태그는 선택지를 드롭박스로 줍니다. -->
	<select name="region">
		<option>서울</option>
		<option>경기</option>
		<option>충청</option>
		<option>전라</option>
		<option>경상</option>
		<option>강원</option>
		<option>제주</option>
	</select><br>
	<input type="submit"/>
	<input type="reset" />
	<br>
</form>

</body>
</html>