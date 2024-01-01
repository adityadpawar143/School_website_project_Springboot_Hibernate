package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoardMaster 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int board_id;
	private String board_name;
	
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	

	@Override
	public String toString() {
		return "BoardMaster [board_id=" + board_id + ", board_name=" + board_name + "]";
	}

}
