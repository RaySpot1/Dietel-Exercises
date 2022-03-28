package africa.semicolon.studentProfile.services;

import africa.semicolon.studentProfile.data.models.Student;
import africa.semicolon.studentProfile.data.repositories.StudentRepository;
import africa.semicolon.studentProfile.data.repositories.StudentRepositoryImpl;
import africa.semicolon.studentProfile.dtos.reponse.FindStudentResponse;
import africa.semicolon.studentProfile.dtos.reponse.RegisterStudentResponse;
import africa.semicolon.studentProfile.dtos.requests.RegisterStudentRequest;

public class AdminServiceImpl implements AdminService {
    StudentRepository repository = new StudentRepositoryImpl();

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

    @Override
    public void deleteStudent(Student theStudent) {
        repository.deleteStudent(theStudent);
    }

    //impl delete

    //impl getrepository


}
