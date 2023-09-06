<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!-- p168 -->

<html>
<head>
<title>detail</title>
<!-- jquery 로딩 -->
<script	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<!-- header -->
	<%@include file="../include/header.jsp"%>

	<!-- Main content -->
	<form role="form" method="post">
		<input type="hidden" name="ai_id" value="${boardDTO.ai_id}">
	</form>
	<script>
	$(document). ready(function(){
		var formObj = $("form[role='form']");
		
		console. log(formObj);
		
		$(".btn-warning").on("click", function(){
			formObj.attr("action", "/board/update");
			formObj.attr("method", "get");
			formObj.submit();
		});
		
		$(".btn-danger").on("click", function(){
			formObj.attr("action", "/board/delete");
			formObj.submit();
		});
		
		$(".btn-primary").on("click", function(){
			self.location = "/board/listAll";
		});
	});
	</script>
	
	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmaill">Title</label> <input type="text"
				name='title' class="form-control" value="${boardDTO.title}"
				readonly="readonly">
		</div>
		<div class="form-group">
			<label for="examplelnputPassword1">Content</label>
			<textarea class="form-control" name="content" rows="3"
				readonly="readonly">${boardDTO.content}</textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label> <input type="text"
				name="writer" class="form-control" value="${boardDTO.user_ai_id}"
				readonly="readonly">
		</div>
	</div>
	<!-- /.box-body -->
	<div class="box-footer">
		<button type="submit" class="btn btn-warning">수정</button>
		<button type="submit" class="btn btn-danger">삭제</button>
		<button type="submit" class="btn btn-primary">목록</button>
	</div>

	<!-- /.content -->

	<!-- footer -->
	<%@include file="../include/footer.jsp"%>

</body>
</html>