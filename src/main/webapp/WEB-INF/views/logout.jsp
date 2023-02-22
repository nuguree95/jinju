<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function main(){
		document.location.href="/main"
	}
</script>
<body>
<h1>로그아웃 </h1>
<% session.removeAttribute("userInfo"); %>
<input type="button" value="메인으로 가기" onclick="main()">

</body>
</html>