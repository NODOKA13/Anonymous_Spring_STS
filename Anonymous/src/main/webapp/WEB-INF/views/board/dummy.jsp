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
                      
                      <!-- 더미 -->
                      	이것은 더미 입니다
                      <!-- /더미 -->
                      
                      <!-- 더미칸 -->
                      <!-- 
                      <div class="card row-hover pos-relative py-3 px-3 mb-3 border-warning border-top-0 border-right-0 border-bottom-0 rounded-0">
							<div class="row align-items-center">
								<div class="col-md-8 mb-3 mb-sm-0">
								
								</div>
							</div>
						</div>
                       -->
                      
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