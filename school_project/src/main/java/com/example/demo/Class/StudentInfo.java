package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class StudentInfo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student_id;
	private String student_fname;
	private String student_lname;
	private String email;
	private String student_mobile;
	private String student_class;
	private String student_batch;
	private String student_board;
	private String student_password;
	private String student_photo;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_fname() {
		return student_fname;
	}
	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}
	public String getStudent_lname() {
		return student_lname;
	}
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudent_mobile() {
		return student_mobile;
	}
	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	public String getStudent_batch() {
		return student_batch;
	}
	public void setStudent_batch(String student_batch) {
		this.student_batch = student_batch;
	}
	public String getStudent_board() {
		return student_board;
	}
	public void setStudent_board(String student_board) {
		this.student_board = student_board;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getStudent_photo() {
		return student_photo;
	}
	public void setStudent_photo(String student_photo) {
		this.student_photo = student_photo;
	}
	@Override
	public String toString() {
		return "StudentInfo [student_id=" + student_id + ", student_fname=" + student_fname + ", student_lname="
				+ student_lname + ", email=" + email + ", student_mobile=" + student_mobile + ", student_class="
				+ student_class + ", student_batch=" + student_batch + ", student_board=" + student_board
				+ ", student_password=" + student_password + ", student_photo=" + student_photo + "]";
	}
	
	
	
}
