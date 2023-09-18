package com.student.services.services;

import com.student.services.entity.StudentEntity;

public interface StudentService {

    StudentEntity createStudent(StudentEntity student);

    StudentEntity getStudent(Long id);
}
