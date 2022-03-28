package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.models.Contact;
import africa.semicolon.phoneBook.data.repositories.ContactRepository;
//import africa.semicolon.phoneBook.data.repositories.ContactsRepositoryImpl;
import africa.semicolon.phoneBook.dtos.requests.RegisterContactRequest;
import africa.semicolon.phoneBook.dtos.response.RegisterContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;
import africa.semicolon.phoneBook.util.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository db;

    @Override
    public RegisterContactResponse saveContact(RegisterContactRequest request) {
        Contact contact = ModelMapper.map(request);
        Contact theContact = db.save(contact);
        return ModelMapper.map(theContact);

    }

    @Override
    public ContactRepository getRepository() {
        return db;
    }

    private List<Contact> findContactByFirstNameOrMiddleNameOrLastName(String name){
        List<Contact> contacts = new ArrayList<>();
        contacts.addAll(db.findContactsByFirstName(name));
        contacts.addAll(db.findContactByLastName(name));
        contacts.addAll(db.findContactByMiddleName(name));
        return contacts;
    }

    @Override
    public List<FindContactResponse> findContactByName(String name){
        List<Contact> contacts = findContactByFirstNameOrMiddleNameOrLastName(name);
        if(contacts.isEmpty()) throw new IllegalArgumentException(name + "not found");
        List<FindContactResponse> responses = new ArrayList<>();

        contacts.forEach(contact -> {
            responses.add(ModelMapper.contactToFindContactResponse(contact));
        });
        return responses;
    }


    @Override
    public RegisterContactResponse deleteContact(String name, String mobile) {
        List<Contact> theContact = findContactByFirstNameOrMiddleNameOrLastName(name);
        theContact.forEach(contact -> {
            if(contact.getMobile().equals(mobile))
                db.delete(contact);
        });
            RegisterContactResponse response = new RegisterContactResponse();
            response.setMessage("Contact Deleted");
            return response;
    }


}
