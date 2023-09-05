<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!-- p168 -->

<html>
<head>
<title>listAll</title>
</head>
<body>
	<script>
		var result = '${msg}';

		if (result == 'success') {
			alert("저리가 왼료되었습니다.");
		}
	</script>


	<!-- header -->
	<%@include file="../include/header.jsp"%>

	<!-- Main content -->
	<table class="table table-bordered">
		<tr>
			<th style="width: 10px">글번호</th>
			<th>제목</th>
			<th>작정자</th>
			<th>작성일</th>
			<th style="width: 40px">조회수</th>
		</tr>
	</table>
	<!-- /.content -->

	<!-- footer -->
	<%@include file="../include/footer.jsp"%>

</body>
</html>