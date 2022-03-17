package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.dtos.requests.RegisterContactRequest;
import africa.semicolon.phoneBook.dtos.response.RegisterContactResponse;
import africa.semicolon.phoneBook.dtos.response.FindContactResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceImplTest {
    ContactService contactService;

    @BeforeEach
    void setUp(){
        contactService = new ContactServiceImpl();
    }

    @Test
    void contactCanBeAddedToRepositoryTest(){
        RegisterContactRequest registerForm = new RegisterContactRequest();
        registerForm.setFirstName("Blessing");
        registerForm.setLastName("Friday");
        registerForm.setMobile("2222");

        contactService.saveContact(registerForm);
        assertEquals(1, contactService.getRepository().count());
    }

    @Test
    void duplicateNumberThrowExceptionTest(){
        createRegisterForm();

        RegisterContactRequest registerForm = new RegisterContactRequest();

        registerForm.setFirstName("Blessing");
        registerForm.setLastName("Friday");
        registerForm.setMobile("2222");
        contactService.saveContact(registerForm);
        assertThrows(RegisterFailureException.class, () -> contactService.register(registerForm));

    }

    private RegisterContactRequest createRegisterForm(){
        RegisterContactRequest registerForm = new RegisterContactRequest();
        registerForm.setFirstName("Blessing");
        registerForm.setLastName("Wavy");
        registerForm.setMobile("3333");

        return registerForm;
    }

    @Test
    void registrationReturnsCorrectResponseTest(){
        RegisterContactRequest registerForm = createRegisterForm();
        RegisterContactResponse response = contactService.saveContact(registerForm);
        assertEquals("Blessing Wavy", response.getFullName());
        assertEquals("3333", response.getMobile());
    }

    @Test
    void findContactByFirstNameTest(){
        RegisterContactRequest registerForm = createRegisterForm();
        contactService.saveContact(registerForm);

        FindContactResponse response =  contactService.findContactByName(registerForm.getFirstName());
        assertEquals("Blessing", response.getFirstName());
        assertEquals("3333", response.getMobile());
    }


}