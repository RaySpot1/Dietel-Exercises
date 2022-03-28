package africa.semicolon.studentProfile.data.repositories;

import africa.semicolon.studentProfile.data.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private final List<Student> db = new ArrayList<>();
    @Override
    public Student saveStudent(Student student) {
        db.add(student);
//        System.out.println(student);
        return student;
    }

    public List<Student> getRepository(){
        return db;
    }


    @Override
    public Student findStudentByEmail(String email) {
        for (Student theStudent: db) {
            if(theStudent.getEmail().equals(email))
                return theStudent;
        }
        return null;
    }

    @Override
    public Student findStudentByMatricNo(int matricNo) {
        for (Student theStudent: db) {
            if(db.contains(matricNo))
                System.out.println(theStudent);
                return theStudent;

        }

//        for (int i = 0; i == matricNo; i++) {
//            if (db.contains(matricNo[i]))
//        }
        return null;
    }


    @Override
    public void deleteStudent(Student theStudent) {
        db.remove(theStudent);
    }

    @Override
    public int count() {
        return db.size();
    }

    @Override
    public int generateMatricNo() {
        int count = 1;
        for (Student theStudent : db) {
            if(db.contains(theStudent))
                count++;
        }
        return count;
    }

//    @Override
//    public boolean duplicateEmail(String email) {
//        for (Student theStudent : db) {
//            if(!db.contains(email))
//                return db.add(theStudent);
//        }
//        return false;
//    }
}
