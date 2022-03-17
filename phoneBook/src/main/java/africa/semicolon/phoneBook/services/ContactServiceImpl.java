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
    private ContactRepository contactRepository;

    @Override
    public RegisterContactResponse saveContact(RegisterContactRequest request) {
        Contact contact = ModelMapper.map(request);
        Contact theContact = contactRepository.save(contact);
        return ModelMapper.map(theContact);

    }

    @Override
    public ContactRepository getRepository() {
        return contactRepository;
    }

    private List<Contact> findContactByFirstNameOrMiddleNameOrLastName(String name){
        List<Contact> contacts = new ArrayList<>();
        contacts.addAll(contactRepository.findContactsByFirstName(name));
        contacts.addAll(contactRepository.findContactByLastName(name));
        contacts.addAll(contactRepository.findContactByMiddleName(name));
        return contacts;
    }

    @Override
    public FindContactResponse findContactByName(String name){
        List<Contact> contacts = findContactByFirstNameOrMiddleNameOrLastName(name);
        if(contacts.isEmpty()) throw new IllegalArgumentException(name + "not found");
        List<FindContactResponse> responses = new ArrayList<>();

        contacts.forEach(contact -> {
            responses.add(new FindContactResponse(contact));
        });
        return responses;
    }


    @Override
    public RegisterContactResponse deleteContact(String name, String mobile) {
        List<Contact> theContact = findContactByFirstNameOrMiddleNameOrLastName(name);
        theContact.forEach(contact -> {
            if(contact.getMobile().equals(mobile))
                contactRepository.delete(contact);
        });
            RegisterContactResponse response = new RegisterContactResponse();
            response.setMessage("Contact Deleted");
            return response;
    }


}
