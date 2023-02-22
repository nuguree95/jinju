<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<input type="button" onclick="goCreate()" value="작성하기">
<table border="1" width="600px">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	<c:forEach var="row" items="${boardlist}" varStatus="count">
	<tr class="listHover" onclick="goBoardInfo(${row.board_number})">
		<td>${count.index+1}</td>
		<td>${row.subject }</td>
		<td>${row.content }</td>
		<td>${row.user_name }</td>
		<td>${row.created_date }</td>
		<td>${row.read_count }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>