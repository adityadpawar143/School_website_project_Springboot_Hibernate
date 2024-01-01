package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Class.BatchMaster;
import com.example.demo.Class.BoardMaster;
import com.example.demo.Class.ClassMaster;
import com.example.demo.Class.HomeworkUpload;
import com.example.demo.Class.StudentInfo;
import com.example.demo.Class.SubjectMaster;
import com.example.demo.Class.TeacherInfo;
import com.example.demo.Class.VideoUpload;

@Controller
public class SchoolController 
{
	@Autowired
	BoardMasterService BMS;
	
	
	// =========================  Home page   ===================================================
	
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	
	// =========================  Student Dashbaord ==============================================
	

	@PostMapping("/student_login")
	public String student_login(@RequestParam ("email")String email,@RequestParam ("student_password")String student_password)
	{
		try
		{
			StudentInfo S = BMS.studlogin(email, student_password);
			if(S!=null)
			{
				return "redirect:/student_dashboard";
			}
		}
		catch(Exception e)
		{
			// TODO : handle exception
			
		}
		return "redirect:/";

	}
	
	
	@GetMapping("/student_dashboard")
	public String student_dashboard(Model m)
	{
		List<VideoUpload> s = BMS.view_video();
		m.addAttribute("v", s);
		return "student_dashboard";
	}
	
	@GetMapping("/student_logout")
	public String student_logout()
	{
		return "redirect:/";
	}
	
	// =========================  teacher  ==============================================
	
	// =========================  teacher Dashbaord ==============================================
	
	
	@PostMapping("/teacher_login")
	public String teacher_login(@RequestParam ("email")String email,@RequestParam ("teacher_password")String teacher_password)
	{
		try
		{
			TeacherInfo T = BMS.teacherlogin(email, teacher_password);
			if(T!=null)
			{
				return "redirect:/teacher_dashboard";
			}
		}
		catch(Exception e)
		{
			// TODO : handle exception
			
		}
		return "redirect:/";
		
	}
	
	@GetMapping("/teacher_dashboard")
	public String teacher_dashboard(Model m)
	{
		List<StudentInfo> s = BMS.view_studentinfo();
		m.addAttribute("s", s);
		return "teacher_dashboard";
	}
	
	
	@GetMapping("/teacher_video_upload")
	public String teacher_video_upload(Model m)
	{
		List<VideoUpload> s = BMS.view_video();
		m.addAttribute("v", s);
		return "teacher_video_upload";
	}
	
	
	@GetMapping("/teacher_add_video")
	public String teacher_add_video()
	{
		return "teacher_add_video";
	}
	
	
	@GetMapping("/teacher_editvideo")
	public String teacher_editvideo(@RequestParam("id") int id, ModelMap m)
	{
		VideoUpload V = BMS.editvideomaster(id);
		m.addAttribute("V", V);
		return "teacher_editvideo";
	}
	
	
	@GetMapping("/teacher_deletevideo")
	public String teacher_deletevideo(@RequestParam("id") int id)
	{
		BMS.delvideo(id);
		return "redirect:/teacher_video_upload";
	}
	
	
	@PostMapping("/teacher_addVideo")
	public String teacher_addVideo(@ModelAttribute("V") VideoUpload V )
	{
		BMS.addvideo(V);
		return "redirect:/teacher_video_upload";
	}
	
	
	@GetMapping("/teacher_homework_upload")
	public String teacher_homework_upload(Model m)
	{
		List<HomeworkUpload> s = BMS.view_homework();
		m.addAttribute("h", s);
		return "teacher_homework_upload";
	}
	
	@GetMapping("/teacher_add_homework")
	public String teacher_add_homework()
	{
		return "teacher_add_homework";
	}
	
	@PostMapping("/teacher_addHomework")
	public String teacher_addHomework(@ModelAttribute("H") HomeworkUpload H)
	{
		BMS.addhomework(H);
		return "redirect:/teacher_homework_upload";
	}
	
	@GetMapping("/teacher_edithomework")
	public String teacher_edithomework(@RequestParam("id") int id, ModelMap m)
	{
		HomeworkUpload H = BMS.edithomeworkmaster(id);
		m.addAttribute("H", H);
		return "teacher_edithomework";
	}
	
	
	@GetMapping("/teacher_deletehomework")
	public String teacher_deletehomework(@RequestParam("id") int id)
	{
		BMS.delhomework(id);
		return "redirect:/teacher_homework_upload";
	}
	
	
	// =========================  Admin Dashbaord ==============================================
	
	
	// =========================  Master ==============================================
	
	// =========================  Board Master ==============================================
	
	
	@PostMapping("/admin_login")
	public String admin_login(ModelMap m,@RequestParam String admin_email, @RequestParam String admin_pass)
	{
		if(admin_email.equals("admin") && admin_pass.equals("aditya"))
		{
			m.put("admin_email", admin_email);
			return "redirect:/dashboard";
		}
		else
		{
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/admin_logout")
	public String admin_logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/";
	}
	
	
	@GetMapping("/dashboard")
	public String dashboard(ModelMap m, HttpSession session)
	{
		
		  
		long totalboard = BMS.totalboardnumber();
		long totalbatch = BMS.totalbatchnumber();
		long totalclass = BMS.totalclassnumber();
		long totalsubject = BMS.totalsubjectnumber();
		long totalteacher = BMS.totalteachernumber();
		long totalstudent = BMS.totalstudentnumber();
		long totalvideo = BMS.totalvideonumber();
		long totalhomework = BMS.totalhomeworknumber();
		
		m.addAttribute("totalboard", totalboard);
		m.addAttribute("totalbatch", totalbatch);
		m.addAttribute("totalclass", totalclass);
		m.addAttribute("totalsubject", totalsubject);
		m.addAttribute("totalteacher", totalteacher);
		m.addAttribute("totalstudents", totalstudent);
		m.addAttribute("totalvideos", totalvideo);
		m.addAttribute("totalhomework", totalhomework);
		
		return "dashboard";
	}
	
	@GetMapping("/board_master")
	public String board_master(Model m)
	{
		List<BoardMaster> b = BMS.view_boardmaster();
		m.addAttribute("b", b);
		return "board_master";
	}
	
	@GetMapping("/add_board_master")
	public String add_board_master()
	{
		return "add_board_master";
	}
	
	@PostMapping("/addBoard")
	public String addBoard(@ModelAttribute("B") BoardMaster B)
	{
		BMS.addboardmaster(B);
		return "redirect:/board_master";
	}
	
	@GetMapping("/editboard")
	public String editboard(@RequestParam("id") int id, ModelMap m)
	{
		BoardMaster BB = BMS.editboardmaster(id);
		m.addAttribute("BB", BB);
		return "editboard";
	}
	
	@PostMapping("/editBoard")
	public String editBoard(@ModelAttribute("B") BoardMaster B)
	{
		BMS.addboardmaster(B);
		return "redirect:/board_master";
	}
	
	@GetMapping("/deleteboard")
	public String deleteboard(@RequestParam("id") int id)
	{
		BMS.delboard(id);
		return "redirect:/board_master";
	}
	
	
	// =========================  Batch Master ==============================================
	
	
	@GetMapping("/batch_master")
	public String batch_master(Model m)
	{
		List<BatchMaster> b = BMS.view_batchmaster();
		m.addAttribute("b", b);
		return "batch_master";
	}
	
	@GetMapping("/add_batch_master")
	public String add_batch_master()
	{
		return "add_batch_master";
	}
	
	@PostMapping("/addBatch")
	public String addBatch(@ModelAttribute("B") BatchMaster B)
	{
		BMS.addbatchmaster(B);
		return "redirect:/batch_master";
	}
	
	@GetMapping("/editbatch")
	public String editbatch(@RequestParam("id") int id, ModelMap m)
	{
		BatchMaster BB = BMS.editbatchmaster(id);
		m.addAttribute("BB", BB);
		return "editbatch";
	}
	
	
	@GetMapping("/deletebatch")
	public String deletebatch(@RequestParam("id") int id)
	{
		BMS.delbatch(id);
		return "redirect:/batch_master";
	}
	
	
	// =========================  Class Master ==============================================
	
	
	@GetMapping("/class_master")
	public String class_master(Model m)
	{
		List<ClassMaster> b = BMS.view_classmaster();
		m.addAttribute("b", b);
		return "class_master";
	}
	
	@GetMapping("/add_class_master")
	public String add_class_master()
	{
		return "add_class_master";
	}
	
	@PostMapping("/addClass")
	public String addClass(@ModelAttribute("B") ClassMaster B)
	{
		BMS.addclassmaster(B);
		return "redirect:/class_master";
	}
	
	@GetMapping("/editclass")
	public String editclass(@RequestParam("id") int id, ModelMap m)
	{
		ClassMaster C = BMS.editclassmaster(id);
		m.addAttribute("CC", C);
		return "editclass";
	}
	
	
	@GetMapping("/deleteclass")
	public String deleteclass(@RequestParam("id") int id)
	{
		BMS.delclass(id);
		return "redirect:/class_master";
	}
	
	
	// =========================  Subject Master ============================================== 
	
	
	@GetMapping("/subject_master")
	public String subject_master(Model m)
	{
		List<SubjectMaster> b = BMS.view_subjectmaster();
		m.addAttribute("b", b);
		return "subject_master";
	}
	
	@GetMapping("/add_subject_master")
	public String add_subject_master()
	{
		return "add_subject_master";
	}
	
	@PostMapping("/addSubject")
	public String addsubject(@ModelAttribute("B") SubjectMaster B)
	{
		BMS.addsubjectmaster(B);
		return "redirect:/subject_master";
	}
	
	@GetMapping("/editsubject")
	public String editsubject(@RequestParam("id") int id, ModelMap m)
	{
		SubjectMaster C = BMS.editsubjectmaster(id);
		m.addAttribute("S", C);
		return "editsubject";
	}
	
	
	@GetMapping("/deletesubject")
	public String deletesubject(@RequestParam("id") int id)
	{
		BMS.delsubject(id);
		return "redirect:/subject_master";
	}
	
	// =========================  Information ==============================================
	
	// =========================  Teacher Information ==============================================
	
	
	@GetMapping("/teacher_info")
	public String teacher_info(Model m)
	{
		List<TeacherInfo> t = BMS.view_teacherinfo();
		m.addAttribute("t", t);
		return "teacher_info";
	}
	
	@GetMapping("/add_teacher")
	public String add_teacher()
	{
		return "add_teacher";
	}
	
	
	@PostMapping("/addTeacher")
	public String addTeacher(@ModelAttribute("B") TeacherInfo TI)
	{
		
		BMS.addTeacherinfo(TI);
		return "redirect:/teacher_info";
	}
	
	@GetMapping("/editteacher")
	public String editteacher(@RequestParam("id") int id, ModelMap m)
	{
		TeacherInfo T = BMS.editteachermaster(id);
		m.addAttribute("T", T);
		return "editteacher";
	}
	
	
	@GetMapping("/deleteteacher")
	public String deleteteacher(@RequestParam("id") int id)
	{
		BMS.delteacher(id);
		return "redirect:/teacher_info";
	}
	
	
	// =========================  Teacher Information ==============================================
	
	
	@GetMapping("/student_info")
	public String student_info(Model m)
	{
		List<StudentInfo> s = BMS.view_studentinfo();
		m.addAttribute("s", s);
		return "student_info";
	}
	
	@GetMapping("/add_student")
	public String add_student()
	{
		return "add_student";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("B") StudentInfo SI)
	{
		BMS.addStudentinfo(SI);
		return "redirect:/student_info";
	}
	
	@GetMapping("/editstudent")
	public String editstudent(@RequestParam("id") int id, ModelMap m)
	{
		StudentInfo S = BMS.editstudentmaster(id);
		m.addAttribute("S", S);
		return "editstudent";
	}
	
	
	@GetMapping("/deletestudent")
	public String deletestudent(@RequestParam("id") int id)
	{
		BMS.delstudent(id);
		return "redirect:/student_info";
	}
	
	
	
	// =========================  Uploads  ==============================================
	
	// ========================= Video Uploads  ==============================================
	
	
	@GetMapping("/video_upload")
	public String video_upload(Model m)
	{
		List<VideoUpload> s = BMS.view_video();
		m.addAttribute("v", s);
		return "video_upload";
	}

	@GetMapping("/add_video")
	public String add_video()
	{
		return "add_video";
	}
	
	@PostMapping("/addVideo")
	public String addVideo(@ModelAttribute("V") VideoUpload V)
	{
		BMS.addvideo(V);
		return "redirect:/video_upload";
	}
	
	@GetMapping("/editvideo")
	public String editvideo(@RequestParam("id") int id, ModelMap m)
	{
		VideoUpload V = BMS.editvideomaster(id);
		m.addAttribute("V", V);
		return "editvideo";
	}
	
	
	@GetMapping("/deletevideo")
	public String deletevideo(@RequestParam("id") int id)
	{
		BMS.delvideo(id);
		return "redirect:/video_upload";
	}
	
	
	// =========================  Homework Uploads  ==============================================
	
	
	@GetMapping("/homework_upload")
	public String homework_upload(Model m)
	{
		List<HomeworkUpload> s = BMS.view_homework();
		m.addAttribute("h", s);
		return "homework_upload";
	}
	
	
	@GetMapping("/add_homework")
	public String add_homework()
	{
		return "add_homework";
	}
	
	@PostMapping("/addHomework")
	public String addHomework(@ModelAttribute("H") HomeworkUpload H)
	{
		BMS.addhomework(H);
		return "redirect:/homework_upload";
	}
	
	@GetMapping("/edithomework")
	public String edithomework(@RequestParam("id") int id, ModelMap m)
	{
		HomeworkUpload H = BMS.edithomeworkmaster(id);
		m.addAttribute("H", H);
		return "edithomework";
	}
	
	
	@GetMapping("/deletehomework")
	public String deletehomework(@RequestParam("id") int id)
	{
		BMS.delhomework(id);
		return "redirect:/homework_upload";
	}

}
