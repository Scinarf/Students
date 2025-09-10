package com.web.student.mapper;

import com.web.student.Entity.Student;
import com.web.student.dto.StudentDto;


public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student){
        return StudentDto.builder()
                .age(student.getAge())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .studentId(student.getStudentId())
                .build();
    }

    public static Student mapToStudent(StudentDto studentDto){
        return Student.builder()
                .age(studentDto.getAge())
                .firstName(studentDto.getFirstName())
                .lastName(studentDto.getLastName())
                .studentId(studentDto.getStudentId())
                .build();
    }

}
