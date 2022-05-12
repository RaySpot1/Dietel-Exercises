package com.student.information.system.studentinformationsystem.service;

import com.student.information.system.studentinformationsystem.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findByStudentNumber(long StudentNumber);
    Student findByEmail(String email);
    List<Student> findAllByOrderByGpaDesc();
    Student SaveOrUpdateStudent();
    void deleteStudent();
}
