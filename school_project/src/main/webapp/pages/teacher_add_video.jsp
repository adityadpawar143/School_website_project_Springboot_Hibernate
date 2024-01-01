<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
     <title>School - Teacher Dashboard </title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon.png">
    <!-- Datatable -->
    <link href="./vendor/datatables/css/jquery.dataTables.min.css" rel="stylesheet">
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
        <div class="nav-header" style="background-color:black">
            <a href="dashboard" class="brand-logo">
                
                <img class="brand-title" src="images/logo1.png" width="100" alt="">
            </a>

            <div class="nav-control" >
                <div class="hamburger" >
                    <span class="line" ></span><span class="line"></span><span class="line"></span>
                </div>
            </div>
        </div>
        <!--**********************************
            Nav header end
        ***********************************-->

        <!--**********************************
            Header start
        ***********************************-->
        <div class="header" style="background-color:#3B2F2F ">
            <div class="header-content">
                <nav class="navbar navbar-expand">
                    <div class="collapse navbar-collapse justify-content-between">
                        <div class="header-left">
                            
                        </div>

                        <ul class="navbar-nav header-right">
                            
                            <li class="nav-item dropdown header-profile">
                                <a class="nav-link" href="#" style="color:white;" role="button" data-toggle="dropdown">
                                    <i class="mdi mdi-account"></i> <span class="ml-2">Teacher </span>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <a href="./app-profile.html" class="dropdown-item">
                                        <i class="icon-user"></i>
                                        <span class="ml-2">Profile </span>
                                    </a>
                                   
                                    <a href="./page-login.html" class="dropdown-item">
                                        <i class="icon-key"></i>
                                        <span class="ml-2">Logout </span>
                                    </a>
                                </div>
                            </li>
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
       <div class="quixnav" style="background-color:black">
            <div class="quixnav-scroll">
                <ul class="metismenu" id="menu">
                    <li class="nav-label first">Main Menu</li>
                    <!-- <li><a href="index.html"><i class="icon icon-single-04"></i><span class="nav-text">Dashboard</span></a>
                    </li> -->
                    <li><a class="" href="teacher_dashboard"><i class="icon icon-single-04"></i><span class="nav-text">Dashboard</span></a>
                       
                    </li>

                   
                   
                 
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false"><i
                                class="icon icon-layout-25"></i><span class="nav-text">Uploads</span></a>
                        <ul aria-expanded="false">
                            <li><a href="teacher_video_upload">Video</a></li>
                            <li><a href="teacher_homework_upload">Homework</a></li>
                        </ul>
                    </li>
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
                <div class="row page-titles mx-0">
                    <div class="col-sm-6 p-md-0">
                        <div class="welcome-text">
                            <h4>Video</h4>
                        </div>
                    </div>
                    <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="javascript:void(0)">Uploads</a></li>
                            <li class="breadcrumb-item active"><a href="javascript:void(0)">Video</a></li>
                        </ol>
                    </div>
                </div>
                <!-- row -->


                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-header">
                            
                                <h4 class="card-title">New Video</h4>
                              </div>
                            
                            <div class="card-body">
             <form action="teacher_addVideo" method="post">
 
  <div class="form-group">
    <label for="exampleInputPassword1">Board</label>
    <input type="text" class="form-control" name="video_board" id="exampleInputPassword1" placeholder="Board Name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Class </label>
    <input type="text" class="form-control" name="video_class" id="exampleInputPassword1" placeholder="Class Name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Batch</label>
    <input type="text" class="form-control" name="video_batch" id="exampleInputPassword1" placeholder="Batch Name" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">Subject</label>
    <input type="text" class="form-control" name="video_subject" id="exampleInputPassword1" placeholder="Subject Name" required>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">Teacher</label>
    <input type="text" class="form-control" name="teacher_name" id="exampleInputPassword1" placeholder="Teacher Name" required>
  </div>
 <div class="form-group">
    <label for="exampleInputPassword1">Youtube Link</label>
    <input type="text" class="form-control" name="video_link" id="exampleInputPassword1" placeholder="Youtube Link" required>
  </div>
	
  <input type="submit" class="btn btn-primary" value="Add">
   <a href="" style="color:white;" class="btn btn-primary">Reset</a>
    <a href="teacher_video_upload"  style="color:white;" class="btn btn-primary">View Records</a>
</form>
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
                <p>Copyright © Designed &amp; Developed by <a href="#" target="_blank">Aditya</a> 2023</p>
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