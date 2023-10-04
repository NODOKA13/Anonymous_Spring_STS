<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>아작스 테스트</h2>
<ul id="replies">
</ul>

	<!-- js -->
	<%@include file="include/js.jsp"%>
	
<script>
var ai_id = 123239;

$.getJSON("/article/all/" + ai_id, function(data){
	console.log(data.length);
});
</script>
</body>
</html>