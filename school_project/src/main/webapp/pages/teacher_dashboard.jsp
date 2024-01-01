
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>School - Teacher Dashboard</title>
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="./images/favicon.png">
<!-- Datatable -->
<link href="./vendor/datatables/css/jquery.dataTables.min.css"
	rel="stylesheet">
<!-- Custom Stylesheet -->
<link href="./css/style.css" rel="stylesheet">

</head>

<body>

	<!--*******************
        Preloader start
    ********************-->
	<div id="preloader">
		<div class="sk-three-bounce">
			<div class="sk-child sk-bounce1"></div>
			<div class="sk-child sk-bounce2"></div>
			<div class="sk-child sk-bounce3"></div>
		</div>
	</div>
	<!--*******************
        Preloader end
    ********************-->


	<!--**********************************
        Main wrapper start
    ***********************************-->
	<div id="main-wrapper">

		<!--**********************************
            Nav header start
        ***********************************-->
		<div class="nav-header" style="background-color: black">
			<a href="dashboard" class="brand-logo"> <img class="brand-title"
				src="images/logo1.png" width="100" alt="">
			</a>

			<div class="nav-control">
				<div class="hamburger">
					<span class="line"></span><span class="line"></span><span
						class="line"></span>
				</div>
			</div>
		</div>
		<!--**********************************
            Nav header end
        ***********************************-->

		<!--**********************************
            Header start
        ***********************************-->
		<div class="header" style="background-color: #3B2F2F">
			<div class="header-content">
				<nav class="navbar navbar-expand">
					<div class="collapse navbar-collapse justify-content-between">
						<div class="header-left"></div>

						<ul class="navbar-nav header-right">

							<li class="nav-item dropdown header-profile"><a
								class="nav-link" href="#" style="color: white;" role="button"
								data-toggle="dropdown"> <i class="mdi mdi-account"></i> <span
									class="ml-2">Teacher </span>
							</a>
								<div class="dropdown-menu dropdown-menu-right">
									<a href="teacher_profile" class="dropdown-item"> <i
										class="icon-user"></i> <span class="ml-2">Profile </span>
									</a> <a href="teacher_logout" class="dropdown-item"> <i
										class="icon-key"></i> <span class="ml-2">Logout </span>
									</a>
								</div></li>
						</ul>
					</div>
				</nav>
			</div>
		</div>
		<!--**********************************
            Header end ti-comment-alt
        ***********************************-->

		<!--**********************************
            Sidebar start
        ***********************************-->
		<div class="quixnav" style="background-color: black">
			<div class="quixnav-scroll">
				<ul class="metismenu" id="menu">
					<li class="nav-label first">Main Menu</li>
					<!-- <li><a href="index.html"><i class="icon icon-single-04"></i><span class="nav-text">Dashboard</span></a>
                    </li> -->
					<li><a class="" href="teacher_dashboard"><i
							class="icon icon-single-04"></i><span class="nav-text">Dashboard</span></a>

					</li>





					<li><a class="has-arrow" href="javascript:void()"
						aria-expanded="false"><i class="icon icon-layout-25"></i><span
							class="nav-text">Uploads</span></a>
						<ul aria-expanded="false">
							<li><a href="teacher_video_upload">Video</a></li>
							<li><a href="teacher_homework_upload">Homework</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!--**********************************
            Sidebar end
        ***********************************-->

		<!--**********************************
            Content body start
        ***********************************-->
		<div class="content-body">
			<div class="container-fluid">



				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-header">

								<h4 class="card-title">Student info</h4>
								<div class="col-sm-0 p-md-0 justify-content-sm-end">
									
								</div>
							</div>

							<div class="card-body">
								<div class="table-responsive">
									<table id="example" class="display" style="min-width: 845px">
										<thead>
											<tr>
												<th>ID</th>
												<th>Student Name</th>
												<th>Email</th>
												<th>Mobile</th>
												<th>Board</th>
												<th>Batch</th>
												<th>Class</th>
												<th>Photo</th>
												<th>password</th>
												<th>Edit</th>
												<th>Delete</th>

											</tr>
										</thead>
										<c:forEach var="s" items="${s}">
											<tbody>
												<tr>
													<td>${s.student_id}</td>
													<td>${s.student_fname}${s.student_lname}</td>
													<td>${s.email}</td>
													<td>${s.student_mobile}</td>
													<td>${s.student_board}</td>
													<td>${s.student_batch}</td>
													<td>${s.student_class}</td>
													<td>${s.student_photo}</td>
													<td>${s.student_password}</td>
													<td><a href="editstudent?id=${s.student_id}"
														class="btn btn-primary">Edit</a></td>
													<td><a href="deletestudent?id=${s.student_id}"
														class="btn btn-danger">Delete</a></td>

												</tr>



											</tbody>
										</c:forEach>

									</table>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
		<!--**********************************
            Content body end
        ***********************************-->


		<!--**********************************
            Footer start
        ***********************************-->
		<div class="footer">
			<div class="copyright">
				<p>
					Copyright © Designed &amp; Developed by <a href="#" target="_blank">Aditya</a>
					2023
				</p>
			</div>
		</div>
		<!--**********************************
            Footer end
        ***********************************-->

		<!--**********************************
           Support ticket button start
        ***********************************-->

		<!--**********************************
           Support ticket button end
        ***********************************-->


	</div>
	<!--**********************************
        Main wrapper end
    ***********************************-->

	<!--**********************************
        Scripts
    ***********************************-->
	<!-- Required vendors -->
	<script src="./vendor/global/global.min.js"></script>
	<script src="./js/quixnav-init.js"></script>
	<script src="./js/custom.min.js"></script>



	<!-- Datatable -->
	<script src="./vendor/datatables/js/jquery.dataTables.min.js"></script>
	<script src="./js/plugins-init/datatables.init.js"></script>

</body>

</html>