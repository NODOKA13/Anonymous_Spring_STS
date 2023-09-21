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
						
						<!-- 검색기능 -->
						<div class="card row-hover pos-relative py-3 px-3 mb-3 border-warning border-top-0 border-right-0 border-bottom-0 rounded-0">
							<div class="row align-items-center">
								<div class="col-md-8 mb-3 mb-sm-0">
								
								<div class="box-body">
									<select data-toggle="select">
										<option value="n"
										<c:out value="${cri.searchType == null?'selected':''}"/>>
										---</option>
										<option value="t"
										<c:out value="${cri.searchType eq 't'?'selected':''}"/>>
										제목</option>
										<option value="c"
										<c:out value="${cri.searchType eq 'c'?'selected':''}"/>>
										내용</option>
										<option value="w"
										<c:out value="${cri.searchType eq 'w'?'selected':''}"/>>
										글쓴이</option>
										<option value="tc"
										<c:out value="${cri.searchType eq 'tc'?'selected':''}"/>>
										제목 OR 내용</option>
										<option value="cw"
										<c:out value="${cri.searchType eq 'cw'?'selected':''}"/>>
										내용 OR 글쓴이</option>
										<option value="tcw"
										<c:out value="${cri.searchType eq 'tcw'?'selected':''}"/>>
										제목 OR 내용 OR 글쓴이</option>
									</select>
								</div>
								<input type="text" name='keyword' id="keywordInput"
								value='${cri.keyword }'>
								<button class="btn btn-outline-primary" id='searchBtn'>Search</button>
								<button class="btn btn-outline-primary" id='newBtn'>New Board</button>
								
								</div>
							</div>
						</div>
						<!-- /검색기능 -->
						
						<!-- 뭉탱이-게시글 -->
						<c:forEach items="${list}" var="boardDTO">

							<div class="card row-hover pos-relative py-3 px-3 mb-3 border-warning border-top-0 border-right-0 border-bottom-0 rounded-0">
								<div class="row align-items-center">
									<div class="col-md-8 mb-3 mb-sm-0">
									
										<h3>
											<a href="${contextPath}/board/detailPage${pageMaker.makeSearch(pageMaker.cri.page)}&ai_id=${boardDTO.ai_id }" class="text-primary">${boardDTO.title }</a>
										</h3>
										<h6>
											작성자: 익명 / 작성일: ${boardDTO.date}
										</h6>
										
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
								
								<nav aria-label="Page navigation example">
										<ul class="pagination">
										
											<c:if test="${pageMaker.prev}">
												<li class="page-item"><a class="page-link" href="list${pageMaker.makeSearch(pageMaker.startPage - 1)}">&laquo;</a></li>
											</c:if>
	
											<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
											  <li class="page-item">
											    <c:set var="activeClass" value="${pageMaker.cri.page == idx ? 'active' : ''}"/>
											    <a class="page-link ${activeClass}" href="list${pageMaker.makeSearch(idx)}">${idx}</a>
											  </li>
											</c:forEach>

											
											<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
												<li class="page-item"><a class="page-link" href="list${pageMaker.makeSearch(pageMaker.endPage +1)}">&raquo;</a></li>
											</c:if>
											
										</ul>
								</nav>
								
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
	<%@include file="../include/js.jsp"%>
	<script>
	<!-- 성공처리 알림 스크립트 -->
		var result = '${msg}';

		if (result == 'success') {
			alert("처리가 완료되었습니다.");
		}
	<!-- /성공처리 알림 스크립트 -->
	
	<!-- 검색버튼 처리 스크립트 -->	
		$(document).ready(
			function() {
				
				$('#searchBtn').on(
					"click",
					function(event) {
						self.location = "list"
						+ '${pageMaker.makeQuery(1)}'
						+ "&searchType="
						+ $("select option:selected").val()
						+ "&keyword=" + encodeURIComponent($('#keywordInput').val());
					});
				
				$('#newBtn').on("click", function(evt) {
					self.location = "${contextPath}/board/write";
				});
			});
	</script>
	<!-- /검색버튼 처리 스크립트 -->	
</body>

</html>