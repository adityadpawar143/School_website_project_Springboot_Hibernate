<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">

<title>School Management System</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Additional CSS Files -->
<link rel="stylesheet" href="Home/assets/css/fontawesome.css">
<link rel="stylesheet" href="Home/assets/css/templatemo-grad-school.css">
<link rel="stylesheet" href="Home/assets/css/owl.css">
<link rel="stylesheet" href="Home/assets/css/lightbox.css">
<link rel="icon" type="image/png" sizes="16x16"
	href="./images/favicon.png">
<link href="./vendor/pg-calendar/css/pignose.calendar.min.css"
	rel="stylesheet">
<link href="./vendor/chartist/css/chartist.min.css" rel="stylesheet">
<link href="./css/style.css" rel="stylesheet">
<!--
    
TemplateMo 557 Grad School

https://templatemo.com/tm-557-grad-school

-->
</head>

<body>




	<!-- ***** Main Banner Area Start ***** -->
	<section class="section main-banner" id="top" data-section="section1">
		<video autoplay muted loop id="bg-video">
			<source src="Home/assets/images/course-video.mp4" type="video/mp4" />
		</video>

		<div class="video-overlay header-text">
			<div class="caption">

				<h2>School Management System</h2>
				<div class="main-button">
					<div class="scroll-to-section">
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#exampleModalCenterStudent">Student Login</button>
						&ensp;
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#exampleModalCenterTeacher">Teacher Login</button>
						&ensp;
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#exampleModalCenterAdmin">Admin Login</button>
					</div>

				</div>
			</div>
		</div>
	</section>


	<!-- ***** Student Login ***** -->
	<form action="student_login" method="post">
		<div class="modal fade" id="exampleModalCenterStudent">
			<div class="modal-dialog modal-dialog-centered" role="document">
				<div class="modal-content">

					<div class="auth-form">
						<h4 class="text-center mb-4">Student Login</h4>

						<div class="form-group">
							<label><strong>Email</strong></label> <input type="email" name="email"
								class="form-control" placeholder="hello@example.com">
						</div>
						<div class="form-group">
							<label><strong>Password</strong></label> <input type="password" name="student_password"
								class="form-control" placeholder="Password">
						</div>

					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<input type="submit" class="btn btn-primary"
							value="Login as Student">
					</div>
				</div>
			</div>
		</div>
	</form>

	<!-- ***** Teacher Login ***** -->

	<form action="teacher_login" method="post">
		<div class="modal fade" id="exampleModalCenterTeacher">
			<div class="modal-dialog modal-dialog-centered" role="document">
				<div class="modal-content">

					<div class="auth-form">
						<h4 class="text-center mb-4">Teacher Login</h4>

						<div class="form-group">
							<label><strong>Email</strong></label> <input type="email" name="email"
								class="form-control" placeholder="hello@example.com">
						</div>
						<div class="form-group">
							<label><strong>Password</strong></label> <input type="password" name="teacher_password"
								class="form-control" placeholder="Password">
						</div>

					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<input type="submit" class="btn btn-primary"
							value="Login as Teacher">
					</div>
				</div>
			</div>
		</div>
	</form>

	<!-- ***** Admin Login ***** -->

	<form action="admin_login" method="post">
		<div class="modal fade" id="exampleModalCenterAdmin">
			<div class="modal-dialog modal-dialog-centered" role="document">
				<div class="modal-content">

					<div class="auth-form">
						<h4 class="text-center mb-4">Admin Login</h4>

						<div class="form-group">
							<label><strong>Username</strong></label> <input type="text" name="admin_email"
								class="form-control" placeholder="Username">
						</div>
						<div class="form-group">
							<label><strong>Password</strong></label> <input type="password" name="admin_pass"
								class="form-control" placeholder="Password">
						</div>

					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<input type="submit" class="btn btn-primary"
							value="Login as Admin">
					</div>
				</div>
			</div>
		</div>
	</form>

	<!-- Scripts -->
	<!-- Bootstrap core JavaScript -->
	<script src="Home/vendor/jquery/jquery.min.js"></script>
	<script src="Home/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<script src="Home/assets/js/isotope.min.js"></script>
	<script src="Home/assets/js/owl-carousel.js"></script>
	<script src="Home/assets/js/lightbox.js"></script>
	<script src="Home/assets/js/tabs.js"></script>
	<script src="Home/assets/js/video.js"></script>
	<script src="Home/assets/js/slick-slider.js"></script>
	<script src="Home/assets/js/custom.js"></script>
	<script src="./vendor/global/global.min.js"></script>
	<script src="./js/quixnav-init.js"></script>
	<script src="./js/custom.min.js"></script>

	<script src="./vendor/chartist/js/chartist.min.js"></script>

	<script src="./vendor/moment/moment.min.js"></script>
	<script src="./vendor/pg-calendar/js/pignose.calendar.min.js"></script>


	<script src="./js/dashboard/dashboard-2.js"></script>
</body>
</html>