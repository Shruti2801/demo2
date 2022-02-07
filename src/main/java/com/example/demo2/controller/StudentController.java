package com.example.demo2.controller;

import com.example.demo2.model.Student;
import com.example.demo2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return repository.save(student);

    }

    @GetMapping
    public List<Student> getAllStudent(){
        return repository.findAll();
    }
}
