package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.TeacherInfo;

@Repository
public interface TeacherLoginRepo extends JpaRepository<TeacherInfo, Integer>
{
	public TeacherInfo findByemail(String email);
}
