package com.student.information.system.studentinformationsystem.dto;

import com.student.information.system.studentinformationsystem.models.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentDTO {
    private String name;
    private long studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

}
