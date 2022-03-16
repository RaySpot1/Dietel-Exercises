package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.models.Contacts;
import africa.semicolon.phoneBook.data.repositories.ContactsRepository;
import africa.semicolon.phoneBook.data.repositories.ContactsRepositoryImpl;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.response.ContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;
import africa.semicolon.phoneBook.exception.ContactNotFoundException;

public class ContactsServiceImpl implements ContactsService {
     ContactsRepository contactsRepository = new ContactsRepositoryImpl();

    @Override
    public ContactResponse saveContact(AddContactRequest contactRequestForm) {
//        Contacts newContact = new Contacts();

        contactRequestForm.setFirstName(contactRequestForm.getFirstName());
        contactRequestForm.setLastName(contactRequestForm.getLastName());
        contactRequestForm.setMiddleName(contactRequestForm.getMiddleName());
        contactRequestForm.setMobile(contactRequestForm.getMobile());
        contactRequestForm.setOffice(contactRequestForm.getOffice());


        ContactResponse response = new ContactResponse();
        response.setFullName(contactRequestForm.getFirstName() + " " + contactRequestForm.getLastName() + " " + contactRequestForm.getMiddleName());
        response.setMobile(contactRequestForm.getMobile());
        response.setMessage("Contact saved");
        System.out.println(response);

        return response;
    }

    @Override
    public ContactsRepository getRepository() {
        return contactsRepository;
    }

//    @Override
//    public FindContactResponse findContactByName(String name) {
//        name = name.toLowerCase();
//
//        Contacts theContact = contactsRepository.findByName(name);
//        if(theContact == null) throw new ContactNotFoundException(name + " not found");
//        FindContactResponse response = new FindContactResponse();
//        response.setFirstName(theContact.getFirstName());
//        response.setLastName(theContact.getLastName());
//        response.setMiddleName(theContact.getMiddleName());
//        response.setMobile(theContact.getMobile());
//        response.setOffice(theContact.getOffice());
//
//
//        return response;
//    }

    @Override
    public ContactResponse deleteContact(String name, String mobile) {
        Contacts theContact = contactsRepository.findByName(name);
        if(theContact.getFirstName().equalsIgnoreCase(name) && theContact.getMobile().equalsIgnoreCase(mobile))
            contactsRepository.delete(theContact);
            ContactResponse response = new ContactResponse();
            response.setMessage("Contact Deleted");
            return response;
    }

    @Override
    public FindContactResponse searchByFirstName(String name) {
//        name = name.toLowerCase();

        Contacts theContact = contactsRepository.searchContactByFirstName(name);
        if(theContact == null) throw new ContactNotFoundException(name + " not found");
        FindContactResponse response = new FindContactResponse();
        response.setFirstName(theContact.getFirstName());
        response.setLastName(theContact.getLastName());
        response.setMiddleName(theContact.getMiddleName());
        response.setMobile(theContact.getMobile());
        response.setOffice(theContact.getOffice());


        return response;
    }


}
