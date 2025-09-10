package com.web.student.controller;

import com.web.student.Entity.Student;
import com.web.student.dto.StudentDto;
import com.web.student.service.StudentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentServiceImpl studentService;


    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<StudentDto> findAllStudent(){
        return studentService.findAllStudent();
    }

    @PostMapping("/new")
    public void creatNewStudent(@Valid @RequestBody Student student){
        studentService.createStudent(student);
    }

    @PutMapping("/{id}/update")
    public void updateStudent(@Valid @PathVariable("id") Long id, @RequestBody Student student){
        studentService.updateStudent(id,student);
    }

    @GetMapping("/{id}")
    public void findById(@Valid @PathVariable("id") Long id){
        studentService.findStudentById(id);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteStudent(@Valid @PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }

}
