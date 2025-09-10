package com.web.student.service;

import com.web.student.Entity.Student;
import com.web.student.dto.StudentDto;
import com.web.student.mapper.StudentMapper;
import com.web.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{
    StudentRepository repo;

    @Autowired
    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<StudentDto> findAllStudent() {
        List<Student> student= repo.findAll();

        return student.stream()
                .map(StudentMapper::mapToStudentDto)
                .collect(Collectors.toList());
    }


    @Override
    public void createStudent(Student student){
        repo.save(student);

    }


    @Override
    public StudentDto findStudentById(Long id) {
        Student student = repo.findById(id).get();
        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public void updateStudent(Long id,Student student) {
        repo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}
