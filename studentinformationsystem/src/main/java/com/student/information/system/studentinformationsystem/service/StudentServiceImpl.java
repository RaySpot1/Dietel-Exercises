package com.student.information.system.studentinformationsystem.service;

import com.student.information.system.studentinformationsystem.models.Student;
import com.student.information.system.studentinformationsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByStudentNumber(long studentNumber) {
        return studentRepository.findByStudentNumber(studentNumber);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<Student> findAllByOrderByGpaDesc() {
        return studentRepository.findAllByOrderByGpaDesc();
    }

    @Override
    public Student SaveOrUpdateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
