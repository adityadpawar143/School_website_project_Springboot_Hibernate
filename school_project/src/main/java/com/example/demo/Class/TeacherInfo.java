package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TeacherInfo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teacher_id;
	private String teacher_fname;
	private String teacher_lname;
	private String email;
	private String teacher_mobile;
	private String teacher_subject;
	private String teacher_photo;
	private String teacher_address;
	private String teacher_password;
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_fname() {
		return teacher_fname;
	}
	public void setTeacher_fname(String teacher_fname) {
		this.teacher_fname = teacher_fname;
	}
	public String getTeacher_lname() {
		return teacher_lname;
	}
	public void setTeacher_lname(String teacher_lname) {
		this.teacher_lname = teacher_lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeacher_mobile() {
		return teacher_mobile;
	}
	public void setTeacher_mobile(String teacher_mobile) {
		this.teacher_mobile = teacher_mobile;
	}
	public String getTeacher_subject() {
		return teacher_subject;
	}
	public void setTeacher_subject(String teacher_subject) {
		this.teacher_subject = teacher_subject;
	}
	public String getTeacher_photo() {
		return teacher_photo;
	}
	public void setTeacher_photo(String teacher_photo) {
		this.teacher_photo = teacher_photo;
	}
	public String getTeacher_address() {
		return teacher_address;
	}
	public void setTeacher_address(String teacher_address) {
		this.teacher_address = teacher_address;
	}
	public String getTeacher_password() {
		return teacher_password;
	}
	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}
	@Override
	public String toString() {
		return "TeacherInfo [teacher_id=" + teacher_id + ", teacher_fname=" + teacher_fname + ", teacher_lname="
				+ teacher_lname + ", email=" + email + ", teacher_mobile=" + teacher_mobile + ", teacher_subject="
				+ teacher_subject + ", teacher_photo=" + teacher_photo + ", teacher_address=" + teacher_address
				+ ", teacher_password=" + teacher_password + "]";
	}
	
	
	
}
