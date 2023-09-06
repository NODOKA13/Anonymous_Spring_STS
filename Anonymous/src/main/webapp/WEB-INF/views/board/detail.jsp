<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!-- p168 -->

<html>
<head>
<title>detail</title>
</head>
<body>
	<!-- header -->
	<%@include file="../include/header.jsp"%>

	<!-- Main content -->
	<form role="form" method="post">
		<input type="hidden" name="ai_id" value="${boardDTO.ai_id}">
	</form>
	
	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmaill">Title</label> <input type="text"
				name='title' class="form-control" value="${boardDTO.title}"
				readonly="readonly">
		</div>
		<div class="form-group">
			<label for="examplelnputPassword1">Content</label>
			<textarea class="form-control" name="content" rows="3" readonly="readonly">${boardDTO.content}</textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label> <input type="text"
				name="writer" class="form-control" value="${boardDTO.user_ai_id}" readonly="readonly">
		</div>
	</div>
	<!-- /.box-body -->
	<div class="box-footer">
		<button type="submit" class="btn btn-warning">Modify</button>
		<button type="submit" class="btn btn-danger">REMOVE</button>
		<button type="submit" class="btn btn-primary">LIST ALL</button>
	</div>
	<!-- /.content -->

	<!-- footer -->
	<%@include file="../include/footer.jsp"%>

</body>
</html>