package africa.semicolon.studentProfile.data.models;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@ToString
@Data
public class Student {
//    @Id
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
