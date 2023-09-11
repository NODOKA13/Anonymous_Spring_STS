<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<head>
<%@include file="include/head.jsp"%>
<script>
$(document).ready(function() {
  var formObj = $("form[role='form']");
  
  $(".btn-warning").on("click", function() {
    formObj.attr("action", "update");
    formObj.attr("method", "get");
    formObj.submit();
  });
  
  $(".btn-danger").on("click", function() {
    formObj.attr("action", "delete");
    formObj.submit();
  });
  
  $(".btn-primary").on("click", function() {
    self.location = "listPage";
  });
});
</script>
</head>

<body>
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
                      
                      	<!-- 게시글 상세 -->
                      	<form role="form" method="post">
						<input type="hidden" name="ai_id" value="${boardDTO.ai_id}">
						</form>

						<div class="box-body">
						<div class="form-group">
						<label for="exampleInputEmaill">Title</label> <input type="text" name='title' class="form-control" value="${boardDTO.title}" readonly="readonly">
						</div>
						<div class="form-group">
							<label for="examplelnputPassword1">Content</label>
							<textarea class="form-control" name="content" rows="3" readonly="readonly">${boardDTO.content}</textarea>
						</div>
						<div class="form-group">
						<label for="exampleInputEmail1">Writer</label> <input type="text" name="writer" class="form-control" value="${boardDTO.user_ai_id}" readonly="readonly">
						</div>
						</div>
						<!-- /.box-body -->
                      	<!-- /게시글 상세 -->
			
						<!-- 버튼 -->
						<div class="box-footer">
							<button type="submit" class="btn btn-warning updateBtn">수정</button>
							<button type="submit" class="btn btn-danger deleteBtn">삭제</button>
							<button type="submit" class="btn btn-primary goListBtn">목록</button>
						</div>
						
						<form role="form" action="updatePage" method="post">
							<input type="hidden" name="ai_id" value="${boardDTO.ai_id }">
							<input type="hidden" name="page" value="${cri.page }">
							<input type="hidden" name="perPageNum" value="${cri.perPageNum}">
						</form>
						
						<script>
							$(".goListBtn").on("click", function()){
								formObj.attr("method", "get");
								formObj.attr("action", "/board/listPage");
								formObj.submit();
							}
							
							$(".deleteBtn").on("click", function()){
								formObj.attr("action","/board/deletePage");
								formObj.submit();
							}
							
							$(".updateBtn").on("click",function()){
								formObj.attr("action", "/board/updatePage");
								formObj.attr("method", "get");
								formObj.submit();
							}
						</script>
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