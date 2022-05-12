package com.student.information.system.studentinformationsystem.repository;

import com.student.information.system.studentinformationsystem.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByStudentNumber(long studentNumber);
    Student findByEmail(String email);
    List<Student> findAllByOrderByGpaDesc();
}
