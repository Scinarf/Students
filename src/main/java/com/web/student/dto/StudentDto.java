package com.web.student.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StudentDto {
    private Long id;
    private String firstName;

    private String lastName;

    private String studentId;

    private int age;
}
