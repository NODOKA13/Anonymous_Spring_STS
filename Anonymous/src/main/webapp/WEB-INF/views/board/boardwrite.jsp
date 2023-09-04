<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<html>
<head>
<title>Home</title>
</head>
<body>
	<!-- header -->
	<%@include file="../include/header.jsp"%>

	<!-- Main content -->
	<form role="form" method="post">
		<div class="box-body">
			<div class="form-group" >
				<label for="exampleInputEmaill">Title</label> <input type="text"
					name='title' class="form-control" placeholder="Enter Title">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Content</label>
				<textarea class="form-control" name="content" rows="3"
					placeholder="Enter ..."></textarea>
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Writer</label> <input type="text"
					name="user_ai_id" class="form-control" placeholder="Enter Writer">
			</div>
		</div>
		<!-- /.box-body -->
		<div class="box-footer">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>

	<!-- footer -->
	<%@include file="../include/footer.jsp"%>

</body>
</html>