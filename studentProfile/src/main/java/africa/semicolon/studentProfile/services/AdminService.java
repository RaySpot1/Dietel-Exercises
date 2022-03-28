package africa.semicolon.studentProfile.services;

import africa.semicolon.studentProfile.data.models.Student;

public interface AdminService extends StudentService {
    void deleteStudent(Student theStudent);
}
