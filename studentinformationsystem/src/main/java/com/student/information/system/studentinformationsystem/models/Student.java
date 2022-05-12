package com.student.information.system.studentinformationsystem.models;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@AllArgsConstructor
@Document(collection = "Students")
public class Student {
    @Id
    private String id;
    private String name;
    private long studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", studentNumber=" + studentNumber +
                ", email='" + email + '\'' +
                ", courseList=" + courseList +
                ", gpa=" + gpa +
                '}';
    }
}
