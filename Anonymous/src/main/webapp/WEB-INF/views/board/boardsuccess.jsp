<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!-- p168 -->

<html>
<head>
<title>Home</title>
</head>
<body>
	<!-- header -->
	<%@include file="../include/header.jsp"%>

	<!-- Main content -->
	<!-- left column -->
	<div class="col-md-12">
		<!-- general form elements -->
		<div class="box">
			<div class="box-header with-border">
				<h3 class="box-title">SUCCESS PAGE</h3>
			</div>
			<div class="box-body">SUCCESS!!!</div>
			<!-- /.box-body -->
			<div class="box-footer">Footer</div>
			<!--/.box-footer-->
		</div>
	</div>
	<!--/.col (left) -->
	<!-- footer -->
	<%@include file="../include/footer.jsp"%>

</body>
</html>