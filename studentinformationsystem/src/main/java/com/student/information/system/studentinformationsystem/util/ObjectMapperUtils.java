package com.student.information.system.studentinformationsystem.util;

import com.student.information.system.studentinformationsystem.dto.StudentDTO;
import com.student.information.system.studentinformationsystem.models.Student;
import org.springframework.stereotype.Component;

@Component
public class ObjectMapperUtils {
    public static StudentDTO mapAll(Student student){
        String name = student.getName();

        return new StudentDTO(name);
    }
}
