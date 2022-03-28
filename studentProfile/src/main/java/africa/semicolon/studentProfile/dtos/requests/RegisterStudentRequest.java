package africa.semicolon.studentProfile.dtos.requests;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RegisterStudentRequest {
    private int matricNo;
    private String firstName;
    private String lastName;
    private String middleName;
    private String DOB;
    private String email;
    private String phoneNumber;
    private String address;
    private String passWord;
}
