<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<head>
<%@include file="include/head.jsp"%>
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
			<div class="col-md-12">
				<!-- general form elements -->
				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">SUCCESS PAGE</h3>
					</div>
					<div class="box-body">SUCCESS!!!</div>
					<!-- /.box-body -->
					<div class="box-footer">Footer</div>
					<!--/.box-footer-->
				</div>
			</div>

		</div>
	</div>

	<!-- js -->
	<%@include file="include/js.jsp"%>
</body>
</html>