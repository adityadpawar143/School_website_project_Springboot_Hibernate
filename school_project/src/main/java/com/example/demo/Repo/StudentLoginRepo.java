package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.StudentInfo;

@Repository
public interface StudentLoginRepo extends JpaRepository<StudentInfo, Integer>
{
	public StudentInfo findByemail(String email);
}
