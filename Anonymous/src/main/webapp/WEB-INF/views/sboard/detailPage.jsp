<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<head>
<%@include file="../include/head.jsp"%>
</head>

<body>

	<!--  Body Wrapper -->
	<div class="page-wrapper" id="main-wrapper" data-layout="vertical"
		data-navbarbg="skin6" data-sidebartype="full"
		data-sidebar-position="fixed" data-header-position="fixed">

		<!-- Sidebar Start -->
		<%@include file="../include/sidebar.jsp"%>
		<!--  Sidebar End -->

		<!--  Main wrapper -->
		<div class="body-wrapper">
			<!--  Header Start -->

			<!-- nav -->
			<%@include file="../include/nav.jsp"%>
			<div class="container-fluid">
				<div class="container-fluid">
					<div class="card">
						<div class="card-body">
							<div class="card-body p-4">
								<div
									class="d-sm-flex d-block align-items-center justify-content-between mb-0">
									<span class="k1"> <strong>No. ${boardDTO.ai_id }</strong>
									</span>
								</div>
								<hr>
								<!-- 여기서 부터 작성 -->
								<form role="form" method="post">
									<input type='hidden' name='ai_id' value="${boardDTO.ai_id}">
									<input type='hidden' name='page' value="${cri.page}">
									<input type='hidden' name='perPageNum' value="${cri.perPageNum}">
									<input type='hidden' name='searchType' value="${cri.searchType}">
									<input type='hidden' name='keyword' value="${cri.keyword}">
								</form>
								
								<div
									class="d-sm-flex d-block align-items-center justify-content-between mb-9">
									<span class="k2"> <strong>조회수</strong> | ${boardDTO.viewcount }
									</span> <span class="k2"> <strong>작성일</strong> | ${boardDTO.date }
									</span>
								</div>
								<table class="table table-hover">
									<thead>
										<tr>
											<th scope="col"><h4>
													<strong>${boardDTO.title }</strong>
												</h4></th>
										</tr>

										<tr>
											<td><i class="ti ti-user"></i><strong>${boardDTO.user_ai_id }</strong></td>
										</tr>

										<tr height="1" bgcolor="#f5f5f5">
											<td colspan="4">${boardDTO.content }<br> <br> <br>
												<br></td>
										</tr>
								</table>



								<button type="submit" class="btn btn-outline-primary modifyBtn">
									수정하기
								</button>	
								<button type="button" class="btn btn-outline-primary"
									onclick="history.back()">뒤로가기
								</button>
								<button type="button" class="btn btn-outline-primary"
									onclick="location.href='list?page=${cri.page}&perPageNum=${cri.perPageNum}&searchType=${cri.searchType}&keyword=${cri.keyword}'">목록으로
								</button>
								<button type="submit" class="btn btn-outline-primary deleteBtn">삭제하기
								</button>
									
								<!-- 	
				<c:forEach var="article" items="${article }">
					<thead>
						<div>
							<div class="article">
								<i class="fas fa-fw fa-user"></i><strong>${article.FK_u_number }</strong>
							</div>
							<div>${article.a_context }
								<button class="btn btn-outline btn-sm border-none">
									<a
										href="article_Modify?a_number=${article.a_number}&user=${user}&b_number=${board.b_number}">수정</a>
								</button>
								<button class="btn btn-outline btn-sm border-none">
									<a
										href="article_Remove?a_number=${article.a_number}&user=${user}&b_number=${board.b_number}">삭제</a>
								</button>
							</div>
				</c:forEach> -->
							</div>
							<br>



						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<%@include file="../include/js.jsp"%>
	
</body>

<script type="text/javascript">
	$(document).ready(function(){
		
		var formObj = $("form[role='form']")
		
		console.log(formObj);
		
		$(".btn-warning").on("click", function(){
			formObj.attr("action", "updatePage");
			formObj.attr("method", "get");
			formObj.submit();
		});
		
		$(".btn-danger").on("click", function(){
			formObj.attr("action", "deletePage");
			formObj.submit();
		});
		
		$(".btn-primary").on("click", function(){
			self.location = "list";
		});
		
		$(".deleteBtn").on("click", function(){
			formObj.attr("action", "deletePage");
			formObj.submit();
		});
		
		$(".modifyBtn").on("click", function(){
			formObj.attr("action", "updatePage");
			formObj.attr("method", "get");
			formObj.submit();
		});
		
	});
</script>

</html>