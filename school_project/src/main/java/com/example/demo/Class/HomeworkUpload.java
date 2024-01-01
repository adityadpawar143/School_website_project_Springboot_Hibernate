package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomeworkUpload 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hid;
	private String homework_board;
	private String homework_class;
	private String homework_batch;
	private String homework_subject;
	private String teacher_name;
	private String homework_link;
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHomework_board() {
		return homework_board;
	}
	public void setHomework_board(String homework_board) {
		this.homework_board = homework_board;
	}
	public String getHomework_class() {
		return homework_class;
	}
	public void setHomework_class(String homework_class) {
		this.homework_class = homework_class;
	}
	public String getHomework_batch() {
		return homework_batch;
	}
	public void setHomework_batch(String homework_batch) {
		this.homework_batch = homework_batch;
	}
	public String getHomework_subject() {
		return homework_subject;
	}
	public void setHomework_subject(String homework_subject) {
		this.homework_subject = homework_subject;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getHomework_link() {
		return homework_link;
	}
	public void setHomework_link(String homework_link) {
		this.homework_link = homework_link;
	}
	
	@Override
	public String toString() {
		return "HomeworkUpload [hid=" + hid + ", homework_board=" + homework_board + ", homework_class="
				+ homework_class + ", homework_batch=" + homework_batch + ", homework_subject=" + homework_subject
				+ ", teacher_name=" + teacher_name + ", homework_link=" + homework_link + "]";
	}
	
	
}
