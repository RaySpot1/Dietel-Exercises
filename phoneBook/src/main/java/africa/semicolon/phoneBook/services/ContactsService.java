package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.repositories.ContactsRepository;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.response.ContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;

public interface ContactsService {
    ContactResponse saveContact(AddContactRequest contactForm);
    ContactsRepository getRepository();

//    FindContactResponse findContactByName(String name);

    ContactResponse deleteContact(String name, String mobile);

    FindContactResponse searchByFirstName(String blessing);
}
