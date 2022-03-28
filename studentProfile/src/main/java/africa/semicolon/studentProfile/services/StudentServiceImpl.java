package africa.semicolon.studentProfile.services;

import africa.semicolon.studentProfile.data.repositories.StudentRepository;
import africa.semicolon.studentProfile.dtos.reponse.FindStudentResponse;
import africa.semicolon.studentProfile.dtos.reponse.RegisterStudentResponse;
import africa.semicolon.studentProfile.dtos.requests.RegisterStudentRequest;

public class StudentServiceImpl implements StudentService {

    @Override
    public RegisterStudentResponse registerStudent(RegisterStudentRequest studentForm) {
        return null;
    }

    @Override
    public StudentRepository getRepository() {
        return null;
    }

    @Override
    public FindStudentResponse findByMatricNo(int matricNo) {
        return null;
    }
}
