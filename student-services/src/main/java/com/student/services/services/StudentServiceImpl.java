package com.student.services.services;

import com.student.services.entity.StudentEntity;
import com.student.services.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentEntity createStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public StudentEntity getStudent(Long id) {
        Optional<StudentEntity> student = studentRepository.findById(id);
        return student.get();
    }
}
