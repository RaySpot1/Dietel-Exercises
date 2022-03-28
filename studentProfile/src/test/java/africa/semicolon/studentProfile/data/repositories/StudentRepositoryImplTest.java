package africa.semicolon.studentProfile.data.repositories;

import africa.semicolon.studentProfile.data.models.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentRepositoryImplTest {
    StudentRepository studentSaver;
    @BeforeEach
    public void setUp(){
        studentSaver = new StudentRepositoryImpl();
    }

    @Test
public void registerStudentTest(){
        Student firstStudent = new Student();

        firstStudent.setFirstName("Miracle");
        firstStudent.setLastName("Max");
        firstStudent.setMiddleName("D");
        firstStudent.setDOB("1995");
        firstStudent.setEmail("miracle@gmail.com");
        firstStudent.setPhoneNumber("1111");
        firstStudent.setPassWord("firstPass");
        firstStudent.setAddress("PH");
        firstStudent.setMatricNo(studentSaver.generateMatricNo());

        studentSaver.saveStudent(firstStudent);
//        System.out.println(studentSaver.getRepository());

        assertEquals(1, studentSaver.count());
    }

    @Test
    void findStudentByEmail(){
        savedThreeStudents();

        Student studentToFind = studentSaver.findStudentByEmail("miracle@gmail.com");

        assertEquals("Miracle", studentToFind.getFirstName());
        assertEquals("Max", studentToFind.getLastName());
        assertEquals("D", studentToFind.getMiddleName());
        assertEquals("1995", studentToFind.getDOB());
        assertEquals("miracle@gmail.com", studentToFind.getEmail());
        assertEquals("1111", studentToFind.getPhoneNumber());
        assertEquals("pass1", studentToFind.getPassWord());
        assertEquals("PH", studentToFind.getAddress());
        assertEquals(1, studentToFind.getMatricNo());

//        System.out.print(studentSaver.getRepository());


    }

    private void savedThreeStudents() {
        Student firstStudent = new Student();

        firstStudent.setFirstName("Miracle");
        firstStudent.setLastName("Max");
        firstStudent.setMiddleName("D");
        firstStudent.setDOB("1995");
        firstStudent.setEmail("miracle@gmail.com");
        firstStudent.setPassWord("pass1");
        firstStudent.setPhoneNumber("1111");
        firstStudent.setAddress("PH");
        studentSaver.generateMatricNo();
        firstStudent.setMatricNo(studentSaver.generateMatricNo());

        studentSaver.saveStudent(firstStudent);

        Student secondStudent = new Student();

        secondStudent.setFirstName("John");
        secondStudent.setLastName("Doe");
        secondStudent.setMiddleName("Bentley");
        secondStudent.setDOB("1990");
        secondStudent.setEmail("John@gmail.com");
        secondStudent.setPassWord("pass2");
        secondStudent.setPhoneNumber("2222");
        secondStudent.setAddress("Lagos");
        secondStudent.setMatricNo(studentSaver.generateMatricNo());

        studentSaver.saveStudent(secondStudent);

        Student thirdStudent = new Student();

        thirdStudent.setFirstName("Doe");
        thirdStudent.setLastName("Cina");
        thirdStudent.setMiddleName("Bentley");
        thirdStudent.setDOB("1997");
        thirdStudent.setEmail("Doe@gmail.com");
        thirdStudent.setPassWord("pass3");
        thirdStudent.setPhoneNumber("3333");
        thirdStudent.setAddress("Abuja");
        thirdStudent.setMatricNo(studentSaver.generateMatricNo());

        studentSaver.saveStudent(thirdStudent);
    }

    @Test
    void deleteStudentTest(){
        Student firstStudent = new Student();

        firstStudent.setFirstName("Miracle");
        firstStudent.setLastName("Max");
        firstStudent.setMiddleName("D");
        firstStudent.setDOB("1995");
        firstStudent.setEmail("miracle@gmail.com");
        firstStudent.setPassWord("pass1");
        firstStudent.setPhoneNumber("1111");
        firstStudent.setAddress("PH");
        studentSaver.generateMatricNo();
        firstStudent.setMatricNo(studentSaver.generateMatricNo());

        studentSaver.saveStudent(firstStudent);

        Student secondStudent = new Student();

        secondStudent.setFirstName("John");
        secondStudent.setLastName("Doe");
        secondStudent.setMiddleName("Bentley");
        secondStudent.setDOB("1990");
        secondStudent.setEmail("John@gmail.com");
        secondStudent.setPassWord("pass2");
        secondStudent.setPhoneNumber("2222");
        secondStudent.setAddress("Lagos");
        secondStudent.setMatricNo(studentSaver.generateMatricNo());

        studentSaver.saveStudent(secondStudent);

        Student thirdStudent = new Student();

        thirdStudent.setFirstName("Doe");
        thirdStudent.setLastName("Cina");
        thirdStudent.setMiddleName("Bentley");
        thirdStudent.setDOB("1997");
        thirdStudent.setEmail("Doe@gmail.com");
        thirdStudent.setPassWord("pass3");
        thirdStudent.setPhoneNumber("3333");
        thirdStudent.setAddress("Abuja");
        thirdStudent.setMatricNo(studentSaver.generateMatricNo());

        studentSaver.saveStudent(thirdStudent);

        studentSaver.deleteStudent(firstStudent);

        assertEquals(2, studentSaver.count());

        System.out.println(studentSaver.getRepository());
    }

    @Test
    void findStudentByMatricNoTest(){
        savedThreeStudents();

        Student studentToFind = studentSaver.findStudentByMatricNo(2);

        assertEquals("John", studentToFind.getFirstName());
        assertEquals("Doe", studentToFind.getLastName());
        assertEquals("Bentley", studentToFind.getMiddleName());
        assertEquals("1990", studentToFind.getDOB());
        assertEquals("John@gmail.com", studentToFind.getEmail());
        assertEquals("2222", studentToFind.getPhoneNumber());
        assertEquals("pass2", studentToFind.getPassWord());
        assertEquals("Lagos", studentToFind.getAddress());
        assertEquals(2, studentToFind.getMatricNo());

    }

    @Test
    void studentCanAccessProfileWithPasswordTest(){
        savedThreeStudents();


    }

}