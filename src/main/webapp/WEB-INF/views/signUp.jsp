<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Sign UP</h1>

<form action="/user/add" method="post">
	ID<br>
	<input type="text" name="id"><br>
	PASSWORD<br>
	<input type="password" name="password"><br>
	NAME<br>
	<input type="text" name="name"><br>
	EMAIL<br>
	<input type="text" name="email"><br>
	<br>
	<input type="submit" value="가입하기">
</form>


</body>
</html>