<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function godelete(){
		document.location.href="/user/godelete"
	}
</script>
<body>
<h1>유저수정</h1>
<%
	session.getAttribute("userInfo");
%>
ID = ${userInfo.id }<br>
PASSWORD = ${userInfo.password }<br>
NAME = ${userInfo.name }<br>
EMAIL = ${userInfo.email }<br>
<br>
<hr>


<form action="/user/update" method = "post">
ID = <input type="text" name="id" value="${userInfo.id }"><br>
PASSWORD <br>
<input type="password" name="password"><br>
NAME<br>
<input type="text" name="name"><br>
EMAIL<br>
<input type="text" name="email"><br>
<br>
<input type="submit" value="수정하기">
</form>
<br>

<input type="button" value="회원탈퇴" onclick="godelete()">

</body>
</html>