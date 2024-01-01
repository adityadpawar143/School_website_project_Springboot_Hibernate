package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Class.BatchMaster;
import com.example.demo.Class.BoardMaster;
import com.example.demo.Class.ClassMaster;
import com.example.demo.Class.HomeworkUpload;
import com.example.demo.Class.StudentInfo;
import com.example.demo.Class.SubjectMaster;
import com.example.demo.Class.TeacherInfo;
import com.example.demo.Class.VideoUpload;
import com.example.demo.Repo.BatchMasterRepo;
import com.example.demo.Repo.BoardMasterRepo;
import com.example.demo.Repo.ClassMasterRepo;
import com.example.demo.Repo.HomeworkUploadRepo;
import com.example.demo.Repo.StudentLoginRepo;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.Repo.SubjectMasterRepo;
import com.example.demo.Repo.TeacherLoginRepo;
import com.example.demo.Repo.TeacherRepo;
import com.example.demo.Repo.VideoUploadRepo;
@Service
public class BoardMasterDao implements BoardMasterService 
{
	@Autowired
	BoardMasterRepo BMR;

	@Autowired
	BatchMasterRepo batchMR;
	
	@Autowired
	ClassMasterRepo CMR;
	
	@Autowired
	SubjectMasterRepo SMR;
	
	@Autowired
	TeacherRepo TR;
	
	@Autowired
	StudentRepo SR;
	
	@Autowired
	VideoUploadRepo VUR;
	
	@Autowired
	HomeworkUploadRepo HUR;
	
	@Autowired
	StudentLoginRepo SLR;
	
	@Autowired
	TeacherLoginRepo TLR;
	
	
	// =========================  Board ==============================================
	
	
	@Override
	public void addboardmaster(BoardMaster BM) 
	{
		BMR.save(BM);
		
	}

	@Override
	public List<BoardMaster> view_boardmaster() {
		return BMR.findAll();
	}
	
	@Override
	public BoardMaster editboardmaster(int id) {
		BoardMaster B = BMR.getById(id);
		return B;
	}
	
	
	@Override
	public void delboard(int id) 
	{
		BMR.deleteById(id);
		
	}
	
	@Override
	public long totalboardnumber() 
	{
		return BMR.count();
	}
	
	// =========================  Batch ==============================================
    
	@Override
	public void addbatchmaster(BatchMaster BM) {
		
		batchMR.save(BM);
	}

	@Override
	public List<BatchMaster> view_batchmaster() {
		return batchMR.findAll();
	}
	
	@Override
	public void delbatch(int id) 
	{
		batchMR.deleteById(id);
	}

	@Override
	public BatchMaster editbatchmaster(int id) {
		BatchMaster B = batchMR.getById(id);
		return B;
	}
	
	@Override
	public long totalbatchnumber() 
	{
		return batchMR.count();
	}
	
	
	// =========================  Class ==============================================
	
	
	@Override
	public void addclassmaster(ClassMaster BM) {
		CMR.save(BM);
		
	}

	@Override
	public List<ClassMaster> view_classmaster() {
		return CMR.findAll();
	}
	
	@Override
	public void delclass(int id) 
	{
		CMR.deleteById(id);
		
	}

	@Override
	public ClassMaster editclassmaster(int id) {
		ClassMaster C = CMR.getById(id);
		return C;
	}

	@Override
	public long totalclassnumber() 
	{
		return CMR.count();
	}
	
	
	// =========================  Subject ==============================================
	
	
	@Override
	public void addsubjectmaster(SubjectMaster BM) {
		SMR.save(BM);
		
	}

	@Override
	public List<SubjectMaster> view_subjectmaster() {
		return SMR.findAll();
	}
	
	@Override
	public void delsubject(int id) 
	{
		SMR.deleteById(id);
		
	}

	@Override
	public SubjectMaster editsubjectmaster(int id) {
		SubjectMaster S = SMR.getById(id);
		return S;
	}

	@Override
	public long totalsubjectnumber() 
	{
		return SMR.count();
	}

	
	
	// =========================  Teacher ==============================================
	
	
	@Override
	public TeacherInfo teacherlogin(String email, String teacher_password) 
	{
		TeacherInfo t = TLR.findByemail(email);
		if(t==null || !t.getTeacher_password().equals(teacher_password))
		{
			throw new IllegalArgumentException("Invalid");
		}
		return t;
	}
	
	@Override
	public void addTeacherinfo(TeacherInfo TI) {
		TR.save(TI);
		
	}

	@Override
	public List<TeacherInfo> view_teacherinfo() {
		return TR.findAll();
	}
	
	@Override
	public void delteacher(int id) 
	{
		TR.deleteById(id);
		
	}

	@Override
	public TeacherInfo editteachermaster(int id) {
		TeacherInfo T = TR.getById(id);
		return T;
	}
	
	@Override
	public long totalteachernumber() 
	{
		return TR.count();
	}

	// =========================  Student ==============================================
	
	
	
	@Override
	public StudentInfo studlogin(String email, String student_password) 
	{
		StudentInfo s = SLR.findByemail(email);
		if(s==null || !s.getStudent_password().equals(student_password))
		{
			throw new IllegalArgumentException("Invalid");
		}
		return s;
	}
	
	
	@Override
	public void addStudentinfo(StudentInfo SI) {
		SR.save(SI);
		
	}

	@Override
	public List<StudentInfo> view_studentinfo() {
		return SR.findAll();
	}

	
	@Override
	public void delstudent(int id) 
	{
		SR.deleteById(id);
		
	}

	@Override
	public StudentInfo editstudentmaster(int id) {
		StudentInfo S = SR.getById(id);
		return S;
	}
	
	@Override
	public long totalstudentnumber() 
	{
		return SR.count();
	}
	
	// =========================  Video ==============================================
	
	@Override
	public void addvideo(VideoUpload VU) {
		VUR.save(VU);
		
	}

	@Override
	public List<VideoUpload> view_video() {
		return VUR.findAll();
	}
	
	@Override
	public void delvideo(int id) 
	{
		VUR.deleteById(id);
		
	}

	@Override
	public VideoUpload editvideomaster(int id) {
		VideoUpload V = VUR.getById(id);
		return V;
	}

	@Override
	public long totalvideonumber() 
	{
		return VUR.count();
	}
	
	
	// =========================  homework ==============================================
	
	
	@Override
	public void addhomework(HomeworkUpload HU) {
		HUR.save(HU);
		
	}

	@Override
	public List<HomeworkUpload> view_homework() {
	
		return HUR.findAll();
	}

	@Override
	public void delhomework(int id) 
	{
		HUR.deleteById(id);
	}

	@Override
	public HomeworkUpload edithomeworkmaster(int id) {
		HomeworkUpload H = HUR.getById(id);
		return H;
	}

	
	@Override
	public long totalhomeworknumber() 
	{
		return HUR.count();
	}

	

}
