package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.VideoUpload;

@Repository
public interface VideoUploadRepo extends JpaRepository<VideoUpload, Integer>
{

}