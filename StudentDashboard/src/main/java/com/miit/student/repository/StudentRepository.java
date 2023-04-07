package com.miit.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miit.student.model.Student;

//This is a Data Access Object (DAO) that accesses the database directly.

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
