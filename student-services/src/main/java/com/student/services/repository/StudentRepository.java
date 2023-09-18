package com.student.services.repository;

import com.student.services.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity , Long> {
}
