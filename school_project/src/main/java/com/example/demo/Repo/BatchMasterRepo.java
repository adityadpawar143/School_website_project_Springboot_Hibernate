package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.BatchMaster;

@Repository
public interface BatchMasterRepo extends JpaRepository<BatchMaster, Integer>
{

}
