package africa.semicolon.phoneBook.dtos.response;

import africa.semicolon.phoneBook.data.models.Contact;
import lombok.*;

@Data
@Getter
@Setter
public class FindContactResponse {
    private String firstName;
    private String lastName;
    private String middleName;
    private String mobile;
    private String office;
    private Contact contact;


//    public FindContactResponse(Contact contact){
//        firstName = contact.getFirstName();
//        lastName = contact.getLastName();
//        middleName = contact.getMiddleName();
//        mobile = contact.getMobile();
//        office = contact.getOffice();
//    }
//
//    public FindContactResponse() {
//
//    }
}
