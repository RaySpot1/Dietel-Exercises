package africa.semicolon.phoneBook.util;

import africa.semicolon.phoneBook.data.models.Contact;
import africa.semicolon.phoneBook.dtos.requests.RegisterContactRequest;
import africa.semicolon.phoneBook.dtos.response.RegisterContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;

public class ModelMapper {
    public static Contact map(RegisterContactRequest request) {
        Contact theContact = new Contact();
        theContact.setFirstName(request.getFirstName());
        theContact.setMiddleName(request.getMiddleName());
        theContact.setLastName(request.getLastName());
        theContact.setMobile(request.getMobile());
        theContact.setOffice(request.getOffice());
        return theContact;
    }
    public static RegisterContactResponse map (Contact theContact){
        RegisterContactResponse response = new RegisterContactResponse();
        response.setFullName(theContact.getFirstName() + " " + theContact.getMiddleName() + " " + theContact.getLastName());
        response.setMobile(theContact.getMobile());
        response.setMessage("Contact Saved");
        return response;
    }

    public static FindContactResponse contactToFindContactResponse(Contact contact) {
        FindContactResponse response = new FindContactResponse();
        response.setFirstName(contact.getFirstName());
        response.setMiddleName(contact.getMiddleName());
        response.setLastName(contact.getLastName());
        response.setMobile(contact.getMobile());
        response.setOffice(contact.getOffice());
        return response;
    }
}