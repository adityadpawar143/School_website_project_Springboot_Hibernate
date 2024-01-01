package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.HomeworkUpload;

@Repository
public interface HomeworkUploadRepo extends JpaRepository<HomeworkUpload, Integer>
{

}
