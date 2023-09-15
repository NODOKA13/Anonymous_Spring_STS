<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<head>
<%@include file="include/head.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>

<body>
<script>
$(document).ready(function() {
	var formObj = $("form[role='form']")
	
	console.log(formObj);
	
	$(".btn-warning").on("click", function() {
		self.location = "listAll";
	});
	
	$(".btn-primary").on("click", function() {
		formObj.submit();
	});
});
</script>
	<!--  Body Wrapper -->
	<div class="page-wrapper" id="main-wrapper" data-layout="vertical"
		data-navbarbg="skin6" data-sidebartype="full"
		data-sidebar-position="fixed" data-header-position="fixed">

		<!-- Sidebar Start -->
		<%@include file="include/sidebar.jsp"%>
		<!--  Sidebar End -->

		<!--  Main wrapper -->
		<div class="body-wrapper">
		
			<!-- nav -->
			<%@include file="include/nav.jsp"%>
			
			<!-- Main content -->
			<div class="col-lg-8 d-flex align-items-stretch" style="user-select: auto;">
            <div class="card w-100" style="user-select: auto;">
              <div class="card-body p-4" style="user-select: auto;">
                <h5 class="card-title fw-semibold mb-4" style="user-select: auto;">Recent Transactions</h5>
                <div class="table-responsive" style="user-select: auto;">
                  <table class="table text-nowrap mb-0 align-middle" style="user-select: auto;">
                    <tbody style="user-select: auto;">
                      <tr style="user-select: auto;">
                      	<form role="form" method="post">
                      	<!-- 수정폼 -->
                      	<div class="box-doby">
                      	
                      		<div class="form-group">
                      		<label for="exampleInputEmail1">제목</label> 
                      		<input type="text" name="title" class="form-control" value="${boardDTO.title }">
                      		</div>
                      	
                      		<div class="form-group">
                      		<label for="exampleInputPassword1">내용</label>
                      		<textarea class="form-control" name="content" rows="3">${boardDTO.content }</textarea>
                      		</div>
                      		
                      		<div class="form-group">
                      		<label for="exampleInputEmail1">작정자</label> <input type="text" name="user_ai_id"
                      		class="form-control" value="${boardDTO.user_ai_id }" readonly>
                      		</div>
                      		
                      	</div>
                      	<!-- /수정폼 -->
                      	<!-- 보내지 않은 남은 데이터도 전송 -->
                      	<input type="hidden" name="ai_id" value= "${boardDTO.ai_id }">                      	
                      	<input type="hidden" name="viewcount" value= "${boardDTO.viewcount}">                      	
                      	<input type="hidden" name="date" value= "${boardDTO.date}">                      	
                      	<input type="hidden" name="hitcount" value= "${boardDTO.hitcount }">                      	
                      	</form>
                      	
                      	<!-- 버튼 -->
                      	<div class="box-footer">
                      		<button type="submit" class="btn btn-primary">수정하기</button>
                      		<button type="submit" class="btn btn-warning">취소하기</button>
                      	</div>
                      	<!-- /버튼 -->
                      </tr>                       
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
			
			
		</div>
	</div>

	<!-- js -->
	<%@include file="include/js.jsp"%>
</body>
</html>