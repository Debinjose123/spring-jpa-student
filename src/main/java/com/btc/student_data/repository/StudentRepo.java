package com.btc.student_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btc.student_data.model.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
