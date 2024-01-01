package com.example.demo;

import java.util.List;

import com.example.demo.Class.BatchMaster;
import com.example.demo.Class.BoardMaster;
import com.example.demo.Class.ClassMaster;
import com.example.demo.Class.HomeworkUpload;
import com.example.demo.Class.StudentInfo;
import com.example.demo.Class.SubjectMaster;
import com.example.demo.Class.TeacherInfo;
import com.example.demo.Class.VideoUpload;

public interface BoardMasterService 
{
	
	// =======  BoardMaster  =======
	
	void addboardmaster(BoardMaster BM);
	
	List<BoardMaster> view_boardmaster();
	
	void delboard(int id);
	
	BoardMaster editboardmaster(int id);
	
	long totalboardnumber();
	
	
	// =======  BatchMaster  =======
	
	
	void addbatchmaster(BatchMaster BM);
	
	List<BatchMaster> view_batchmaster();
	
	void delbatch(int id);
	
	BatchMaster editbatchmaster(int id);
	
	long totalbatchnumber();
	
	// =======  ClassMaster  =======
	
	
	void addclassmaster(ClassMaster BM);
	
	List<ClassMaster> view_classmaster();
	
	void delclass(int id);
	
	ClassMaster editclassmaster(int id);

	long totalclassnumber();
	
	// =======  SubjectMaster  =======
	
	
	void addsubjectmaster(SubjectMaster BM);
	
	List<SubjectMaster> view_subjectmaster();
	
	void delsubject(int id);
	
	SubjectMaster editsubjectmaster(int id);
	
	long totalsubjectnumber();
	
	// =======  Teacher info  =======
	
	TeacherInfo teacherlogin(String email, String teacher_password);
	
	void addTeacherinfo(TeacherInfo TI);
	
	List<TeacherInfo> view_teacherinfo();
	
	void delteacher(int id);
	
	TeacherInfo editteachermaster(int id);

	long totalteachernumber();
	
	// =======  Student info  =======
	
	StudentInfo studlogin(String email, String student_password);
	
	void addStudentinfo(StudentInfo SI);
	
	List<StudentInfo> view_studentinfo();

	void delstudent(int id);
	
	StudentInfo editstudentmaster(int id);
	
	long totalstudentnumber();
	
	// =======  Video info  =======
	
	
	void addvideo(VideoUpload VU);
		
	List<VideoUpload> view_video();
	
	void delvideo(int id);
	
	VideoUpload editvideomaster(int id);
	
	long totalvideonumber();
	
	// =======  Homework info  =======
	
	
	void addhomework(HomeworkUpload HU);
			
	List<HomeworkUpload> view_homework();
	
	void delhomework(int id);
	
	HomeworkUpload edithomeworkmaster(int id);
	
	long totalhomeworknumber();
	
	
}
