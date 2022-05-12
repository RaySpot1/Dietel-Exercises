package com.student.information.system.studentinformationsystem.controller;

import com.student.information.system.studentinformationsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/")
    public List<StudentDTO> getAllStudents(){
        return ObjectMapperUtils.mapAll(studentService.findAll(), StudentDTO.class);
    }

}
