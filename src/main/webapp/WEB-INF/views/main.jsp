<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function login(){
		document.location.href="/login"
	}
	function signUp(){
		document.location.href="/user/signup"
	}
	function userInfo(){
		document.location.href="/main/userInfo"
	}
	function logOut(){
		document.location.href="/main/logout"
	}
	function goBoard(){
		document.location.href="/board"
	}
	
	
</script>
<body>
<H1>MAIN</H1>
<%if (session.getAttribute("userInfo")==null){ %>
<input type="button" value="로그인" onclick="login()">
<input type="button" value="회원가입" onclick="signUp()">
<%} else if(session.getAttribute("userInfo") != null){ %>
${userInfo.id }님 환영합니다
<input type="button" value="로그아웃" onclick="logOut()">
<input type="button" value="상세정보" onclick="userInfo()">
<input type="button" value="게시판" onclick="goBoard()">
<%}; %>	


</body>
</html>