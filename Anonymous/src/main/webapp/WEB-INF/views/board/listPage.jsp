<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<head>
<%@include file="include/head.jsp"%>
</head>

<body>
	<link
		href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css"
		rel="stylesheet">

	<!-- 성공처리 알림 스크립트 -->
	<script>
		var result = '${msg}';

		if (result == 'success') {
			alert("저리가 왼료되었습니다.");
		}
	</script>
	<!-- /성공처리 알림 스크립트 -->

	<!--  Body Wrapper -->
	<div class="page-wrapper" id="main-wrapper" data-layout="vertical"
		data-navbarbg="skin6" data-sidebartype="full"
		data-sidebar-position="fixed" data-header-position="fixed">

		<!-- Sidebar Start -->
		<%@include file="include/sidebar.jsp"%>
		<!--  Sidebar End -->

		<!--  Main wrapper -->
		<div class="body-wrapper">
			<!--  Header Start -->

			<!-- nav -->
			<%@include file="include/nav.jsp"%>

			<div class="container">
				<div class="row">

					<!-- 뭉탱이 -->
					<div class="col-lg-9 mb-3">
						<div class="row text-left mb-5">
							<div class="col-lg-6 mb-3 mb-sm-0">
								<div
									class="dropdown bootstrap-select form-control form-control-lg bg-white bg-op-9 text-sm w-lg-50"
									style="width: 100%;">
									<select
										class="form-control form-control-lg bg-white bg-op-9 text-sm w-lg-50"
										data-toggle="select" tabindex="-98">
										<option>Categories</option>
										<option>Learn</option>
										<option>Share</option>
										<option>Build</option>
									</select>
								</div>
							</div>
						</div>

						<!-- 뭉탱이-게시글 -->
						<c:forEach items="${list}" var="BoardDTO">

							<div class="card row-hover pos-relative py-3 px-3 mb-3 border-warning border-top-0 border-right-0 border-bottom-0 rounded-0">
								<div class="row align-items-center">
									<div class="col-md-8 mb-3 mb-sm-0">
										<h5>
											<a href="detail?ai_id=${BoardDTO.ai_id }" class="text-primary">${BoardDTO.title }</a>
										</h5>
										<!-- 댓글 미리보기 예시 -->
										<!-- <div class="text-sm op-5"> <a class="text-black mr-2" href="#">#C++</a></div> -->
									</div>
								</div>
							</div>
						</c:forEach>
						<!-- /뭉탱이-게시글 -->
						
						<!-- 페이징 -->
						<div class="card row-hover pos-relative py-3 px-3 mb-3 border-warning border-top-0 border-right-0 border-bottom-0 rounded-0">
							<div class="row align-items-center">
								<div class="col-md-8 mb-3 mb-sm-0">
								
									<div class="text-center">
										<ul class="pagination">
										
											<c:if test="${pageMaker.prev}">
												<li><a href="listPage?page=${pageMaker.startPage - 1}">&laquo;</a></li>
											</c:if>
	
											<c:forEach begin="${pageMaker.startPage }" 
												end="${pageMaker.endPage }" var="idx">
													<li
														<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
														<a href="listPage?page=${idx}">${idx}</a>
													</li>
											</c:forEach>
											
											<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
												<li><a href="listPage?page=${pageMaker.endPage +1}">&raquo;</a></li>
											</c:if>
											
										</ul>
									</div>
								
								</div>
							</div>
						</div>
						<!-- /페이징 -->
						
					</div>
					<!-- /뭉탱이 -->
					
				</div>
			</div>
		</div>
	</div>
	<%@include file="include/js.jsp"%>
</body>

</html>