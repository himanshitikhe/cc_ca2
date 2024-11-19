package com.example.CA2ActivityCloudComputing31.Repo;

import com.example.CA2ActivityCloudComputing31.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
}