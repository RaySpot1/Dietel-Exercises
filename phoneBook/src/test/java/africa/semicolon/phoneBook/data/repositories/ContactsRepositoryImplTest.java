package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contacts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ContactsRepositoryImplTest {
    private ContactsRepository contacts;
    @BeforeEach
    public void setUp(){
        contacts = new ContactsRepositoryImpl();
    }

    @Test
    public void phoneBookCanSaveAContactTest(){
        Contacts firstContact = new Contacts();

        firstContact.setFirstName("Oludare");
        firstContact.setLastName("David");
        firstContact.setMiddleName("D");
        firstContact.setMobile("1111");
        firstContact.setOffice("Lagos Nigeria");

        assertEquals("Oludare", firstContact.getFirstName());
        assertEquals("David", firstContact.getLastName());
        assertEquals("D", firstContact.getMiddleName());
        assertEquals("1111", firstContact.getMobile());
        assertEquals("Lagos Nigeria", firstContact.getOffice());

        contacts.save(firstContact);

        System.out.println(firstContact);

        assertEquals(1, contacts.count());

    }


    @Test
    void phoneBookCanSaveMoreThanOneContactsTest(){
        saveThreeContacts();
        assertEquals(3, contacts.count());
    }


    @Test
    void contactsInPhoneBookCanBeUpdatedTest(){
        //editing first contact
        Contacts firstContact = new Contacts();


        firstContact.setFirstName("Blessing");
        firstContact.setLastName("Friday");
        firstContact.setMiddleName("E");
        firstContact.setMobile("2222");
        firstContact.setOffice("Lagos Nigeria");

        contacts.save(firstContact);
        //edit and update the contact
        firstContact.setFirstName("Chidinma");
        //confirm the contacts is updated
        assertEquals("Chidinma", firstContact.getFirstName());

//        System.out.println(firstContact);
    }

    @Test
    void contactCanBeDeletedTest(){
        //        first contact
        Contacts firstContact = new Contacts();

        firstContact.setFirstName("Oludare");
        firstContact.setLastName("David");
        firstContact.setMiddleName("D");
        firstContact.setMobile("1111");
        firstContact.setOffice("Lagos Nigeria");

        contacts.save(firstContact);

//        System.out.println(firstContact);

//        second Contact

        Contacts secondContact = new Contacts();
        secondContact.setFirstName("Blessing");
        secondContact.setLastName("Friday");
        secondContact.setMiddleName("E");
        secondContact.setMobile("2222");
        secondContact.setOffice("Lagos Nigeria");

        contacts.save(secondContact);

//        System.out.println(secondContact);

//        third Contact

        Contacts thirdContact = new Contacts();
        thirdContact.setFirstName("Nkechi");
        thirdContact.setLastName("Blessing");
        thirdContact.setMiddleName("Brain");
        thirdContact.setMobile("3333");
        thirdContact.setOffice("Ogun-State Nigeria");

        contacts.save(thirdContact);

//        System.out.println(thirdContact);


        contacts.delete(firstContact);
        assertEquals(2, contacts.count());



    }

//    @Test
//    void confirmContactDeleteTest(){
//        //        first contact
//        Contacts firstContact = new Contacts();
//
//        firstContact.setFirstName("Oludare");
//        firstContact.setLastName("David");
//        firstContact.setMiddleName("D");
//        firstContact.setMobile("1111");
//        firstContact.setOffice("Lagos Nigeria");
//
//        contacts.save(firstContact);
//
//        assertNotNull(firstContact);
//    }

    private void saveThreeContacts() {
        //        first contact
        Contacts firstContact = new Contacts();

        firstContact.setFirstName("Oludare");
        firstContact.setLastName("David");
        firstContact.setMiddleName("D");
        firstContact.setMobile("1111");
        firstContact.setOffice("Lagos Nigeria");

        contacts.save(firstContact);
        System.out.println(firstContact);

//        second Contact

        Contacts secondContact = new Contacts();
        secondContact.setFirstName("Blessing");
        secondContact.setLastName("Friday");
        secondContact.setMiddleName("E");
        secondContact.setMobile("2222");
        secondContact.setOffice("Lagos Nigeria");

        contacts.save(secondContact);

        System.out.println(secondContact);

//        third Contact

        Contacts thirdContact = new Contacts();
        thirdContact.setFirstName("Nkechi");
        thirdContact.setLastName("Blessing");
        thirdContact.setMiddleName("Brain");
        thirdContact.setMobile("3333");
        thirdContact.setOffice("Ogun-State Nigeria");

        contacts.save(thirdContact);

        System.out.println(thirdContact);
    }


    @Test
    void deleteContactByMobileTest(){
        saveThreeContacts();



        contacts.deleteByMobile("1111");
        assertEquals(2, contacts.count());
    }


    @Test
    void searchContactByFirstNameTest(){
        saveThreeContacts();

        Contacts contactsByFirstName = contacts.searchContactByFirstName("Oludare");
        assertEquals("Oludare", contactsByFirstName.getFirstName());
    }

    @Test
    void searchContactByPhoneNumber(){
        saveThreeContacts();
        Contacts searchMobile =  contacts.searchContactByMobile("3333");
        assertEquals("3333", searchMobile.getMobile());

    }

}