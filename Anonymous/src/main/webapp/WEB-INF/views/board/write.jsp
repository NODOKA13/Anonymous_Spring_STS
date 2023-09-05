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
			<div class="form-group">
				<label>제목</label> <input type="text" name='title'
					class="form-control" placeholder="제목을 입력해 주세요">
			</div>
			<div class="form-group">
				<label>내용</label>
				<textarea class="form-control" name="content" rows="3"
					placeholder="내용을 입력해 주세요"></textarea>
			</div>
			<div class="form-group">
				<label>작정자</label> <input type="text" name="user_ai_id"
					class="form-control" placeholder="작정자 이름 작성">
			</div>
		</div>
		<!-- /.box-body -->
		<div class="box-footer">
			<button type="submit" class="btn btn-primary">작성</button>
		</div>
	</form>

	<!-- footer -->
	<%@include file="../include/footer.jsp"%>

</body>
</html>