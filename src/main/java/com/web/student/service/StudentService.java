package com.web.student.service;

import com.web.student.Entity.Student;
import com.web.student.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> findAllStudent();

    void createStudent(Student student);

    StudentDto findStudentById(Long id);

    void updateStudent(Long id,Student student);

    void deleteStudent(Long id);
}
