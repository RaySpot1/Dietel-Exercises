package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.response.ContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactsServiceImplTest {
    ContactsService contactsService;

    @BeforeEach
    public void setup(){
        contactsService = new ContactsServiceImpl();
    }

    @Test
    public void contactCanBeAddedTest(){
        AddContactRequest request = new AddContactRequest();

        request.setFirstName("Oludare");
        request.setLastName("David");
        request.setMiddleName("D");
        request.setOffice("Lagos Nigeria");
        request.setMobile("1111");
        ContactResponse response = contactsService.saveContact(request);

//        assertEquals(1, contactsService.getRepository().count());
        assertEquals(1, contactsService.getRepository().count());
        assertEquals("Contact saved", response.getMessage());


    }

    @Test
    void findContactByNameTest(){
//        ContactsService contactsService = new ContactsServiceImpl();

        AddContactRequest request = new AddContactRequest();
        request.setFirstName("Oludare");
        request.setLastName("David");
        request.setMiddleName("D");
        request.setOffice("Lagos Nigeria");
        request.setMobile("1111");
        contactsService.saveContact(request);


        AddContactRequest request2 = new AddContactRequest();
        request2.setFirstName("Blessing");
        request2.setLastName("Friday");
        request2.setMiddleName("E");
        request2.setMobile("2222");
        request2.setOffice("Lagos Nigeria");
        contactsService.saveContact(request2);


        AddContactRequest request3 = new AddContactRequest();
        request3.setFirstName("Nkechi");
        request3.setLastName("Blessing");
        request3.setMiddleName("Brain");
        request3.setMobile("3333");
        request3.setOffice("Ogun-State Nigeria");
        contactsService.saveContact((request3));

        FindContactResponse response = contactsService.searchByFirstName("Blessing");
        assertEquals("Blessing", response.getFirstName());
        assertEquals("Lagos Nigeria", response.getOffice());


    }

    @Test
    void deleteContactTest(){
        ContactsService contactsService = new ContactsServiceImpl();

        AddContactRequest request = new AddContactRequest();

        request.setFirstName("Oludare");
        request.setLastName("David");
        request.setMiddleName("D");
        request.setOffice("Lagos Nigeria");
        request.setMobile("1111");
        contactsService.saveContact(request);


        AddContactRequest request2 = new AddContactRequest();
        request2.setFirstName("Blessing");
        request2.setLastName("Friday");
        request2.setMobile("E");
        request2.setMobile("2222");
        request2.setOffice("Lagos Nigeria");
        contactsService.saveContact(request2);


        AddContactRequest request3 = new AddContactRequest();
        request3.setFirstName("Nkechi");
        request3.setLastName("Blessing");
        request3.setMiddleName("Brain");
        request3.setMobile("3333");
        request3.setOffice("Ogun-State Nigeria");

        ContactResponse response = contactsService.deleteContact("Nkechi", "3333");
        assertEquals(2, contactsService.getRepository().count());
        assertEquals("Contact Deleted", response.getMessage());

    }
}