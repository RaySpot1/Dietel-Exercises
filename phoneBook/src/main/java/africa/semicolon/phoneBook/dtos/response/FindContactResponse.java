package africa.semicolon.phoneBook.dtos.response;

import africa.semicolon.phoneBook.data.models.Contact;
import lombok.*;

@Data
@NoArgsConstructor

public class FindContactResponse {
    private String firstName;
    private String lastName;
    private String middleName;
    private String mobile;
    private String office;
    private Contact contact;


//    public FindContactResponse() {
//        firstName = contact.getFirstName();
//        lastName = contact.getLastName();
//        middleName = contact.getMiddleName();
//        mobile = contact.getMobile();
//        office = contact.getOffice();
//    }
}
