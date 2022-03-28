package africa.semicolon.studentProfile.services;

import africa.semicolon.studentProfile.data.repositories.StudentRepository;
import africa.semicolon.studentProfile.dtos.reponse.FindStudentResponse;
import africa.semicolon.studentProfile.dtos.reponse.RegisterStudentResponse;
import africa.semicolon.studentProfile.dtos.requests.RegisterStudentRequest;

public interface StudentService {
    RegisterStudentResponse registerStudent(RegisterStudentRequest studentForm);

    StudentRepository getRepository();

    FindStudentResponse findByMatricNo(int matricNo);

}
