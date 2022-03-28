package africa.semicolon.studentProfile.data.repositories;

import africa.semicolon.studentProfile.data.models.Student;

import java.util.List;

public interface StudentRepository {
    Student saveStudent(Student Student);
    Student findStudentByEmail(String email);
    Student findStudentByMatricNo(int matricNo);
//    Student setPassword(String passWord);
    int generateMatricNo();
    List<Student> getRepository();

    void deleteStudent(Student theStudent);

    int count();

//    boolean duplicateEmail(String email);
}
