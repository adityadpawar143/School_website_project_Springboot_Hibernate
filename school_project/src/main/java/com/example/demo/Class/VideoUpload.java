package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoUpload 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	private String video_board;
	private String video_class;
	private String video_batch;
	private String video_subject;
	private String teacher_name;
	private String video_link;
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVideo_board() {
		return video_board;
	}
	public void setVideo_board(String video_board) {
		this.video_board = video_board;
	}
	public String getVideo_class() {
		return video_class;
	}
	public void setVideo_class(String video_class) {
		this.video_class = video_class;
	}
	public String getVideo_batch() {
		return video_batch;
	}
	public void setVideo_batch(String video_batch) {
		this.video_batch = video_batch;
	}
	public String getVideo_subject() {
		return video_subject;
	}
	public void setVideo_subject(String video_subject) {
		this.video_subject = video_subject;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getVideo_link() {
		return video_link;
	}
	public void setVideo_link(String video_link) {
		this.video_link = video_link;
	}
	
	@Override
	public String toString() {
		return "VideoUpload [vid=" + vid + ", video_board=" + video_board + ", video_class=" + video_class
				+ ", video_batch=" + video_batch + ", video_subject=" + video_subject + ", teacher_name=" + teacher_name
				+ ", video_link=" + video_link + "]";
	}
	
	
	
	

}
