package africa.semicolon.studentProfile.services;

import africa.semicolon.studentProfile.dtos.requests.RegisterStudentRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {
    StudentService studentService;

    @BeforeEach
    void setUp(){
        studentService = new StudentServiceImpl();
    }

    @Test
    void addingStudentToRepositoryTest(){
        RegisterStudentRequest registerForm = new RegisterStudentRequest();

        registerForm.setFirstName("Miss");
        registerForm.setLastName("Kay");
        registerForm.setMiddleName("Brown");
    }
}