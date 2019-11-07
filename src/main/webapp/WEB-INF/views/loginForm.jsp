<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
<form action="/loginPost" method="post">
	아이디: <input type="text" id="user_id" name="id">
	<br>
	비밀번호: <input type="password" id="user_pw" name="password">
	
	<div>
		<button type="submit">login</button>
	</div>
</form>

<script>

</script>
</body>
</html>