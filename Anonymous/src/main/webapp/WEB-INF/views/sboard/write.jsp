<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

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
		
			<!-- nav -->
			<%@include file="../include/nav.jsp"%>
			
			<!-- Main content -->
			<div class="col-lg-8 d-flex align-items-stretch" style="user-select: auto;">
            <div class="card w-100" style="user-select: auto;">
              <div class="card-body p-4" style="user-select: auto;">
                <h5 class="card-title fw-semibold mb-4" style="user-select: auto;">Recent Transactions</h5>
                <div class="table-responsive" style="user-select: auto;">
                  <table class="table text-nowrap mb-0 align-middle" style="user-select: auto;">
                    <tbody style="user-select: auto;">
                      <tr style="user-select: auto;">
                      
                      	<!-- 글쓰기 -->
		             	<form role="form" method="post">
						<div class="box-body">
						
							<div class="form-group">
							<label>제목</label> <input type="text" name='title' class="form-control" placeholder="제목을 입력해 주세요">
							</div>
							
							<div class="form-group">
							<label>내용</label>
							<textarea class="form-control" name="content" rows="3" placeholder="내용을 입력해 주세요"></textarea>
							</div>
							
							<div class="form-group">
							<label>작정자</label> <input type="text" name="user_ai_id" class="form-control" placeholder="작정자 이름 작성">
							</div>
						</div>
                      	<!-- /글쓰기 -->
						
						<!-- 글작성 버튼 -->
						<div class="box-footer">
							<button type="submit" class="btn btn-primary">작성</button>
						</div>
						<!-- /글작성 버튼 -->
						
						</form>
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
	<%@include file="../include/js.jsp"%>
</body>
</html>