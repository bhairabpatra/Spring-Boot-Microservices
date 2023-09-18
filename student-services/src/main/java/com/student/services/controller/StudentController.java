package com.student.services.controller;

import com.student.services.entity.LibraryEntity;
import com.student.services.entity.StudentEntity;
import com.student.services.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin("*")
public class StudentController {

    private StudentService studentService;

    @Autowired
    private RestTemplate restTemplate;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("create")
    public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity studentEntity){
        StudentEntity student = studentService.createStudent(studentEntity);
        return ResponseEntity.ok(student);
    }
    @GetMapping("{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id){
        LibraryEntity lib = restTemplate.getForObject("http://localhost:8083/api/v1/library/" + id, LibraryEntity.class);
        StudentEntity student = studentService.getStudent(id);
        student.setLibraryEntity(lib);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
