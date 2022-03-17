package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.dtos.requests.RegisterContactRequest;
import africa.semicolon.phoneBook.dtos.response.RegisterContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;

import java.util.List;

public interface ContactService {

    RegisterContactResponse saveContact(RegisterContactRequest contactForm);
    ContactRepository getRepository();

    FindContactResponse findContactByName(String name);

    RegisterContactResponse deleteContact(String name, String mobile);
}
