package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.dtos.responses.RegisterUserRequest;
import africa.semicolon.sendAm.dtos.responses.RegisterUserResponse;
import africa.semicolon.sendAm.exception.RegisterFailureException;
import africa.semicolon.sendAm.exception.SendAmAppException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementationTest {
    private UserServiceImplementation userService;

    @BeforeEach
    public void testSetup(){
        userService = new UserServiceImplementation();
    }

    @Test
    void afterRegister_repositoryContainsOneElement() {
//        given
        RegisterUserRequest registerForm = new RegisterUserRequest();
        registerForm.setFirstName("David");
        registerForm.setLastName("Oludare");
        registerForm.setEmailAddress("seniorDevDevil@Gmail.com");
        registerForm.setAddress("Code Cold Well");
        registerForm.setPhoneNumber("2MillionDollars");
//        when
        userService.register(registerForm);

//        assert
        assertEquals(1, userService.getRepository().count());
    }

    private RegisterUserRequest createRegisterForm(){
        RegisterUserRequest registerForm = new RegisterUserRequest();
        registerForm.setFirstName("David");
        registerForm.setLastName("Oludare");
        registerForm.setEmailAddress("seniorDevDevil@Gmail.com");
        registerForm.setAddress("Code Cold Well");
        registerForm.setPhoneNumber("2MillionDollars");
        return registerForm;
    }

    @Test
    public void duplicateEmail_throwsExceptionTest(){
        RegisterUserRequest daveForm = createRegisterForm();

        userService.register(daveForm);

        assertThrows(SendAmAppException.class, ()-> userService.register(daveForm));
//        or, cause of inheritance
//        assertThrows(RegisterFailureException.class, ()-> userService.register(daveForm));
    }

    @Test
    public void duplicateEmailWithDifferentCase_throwException(){
        RegisterUserRequest daveForm = createRegisterForm();

//        when
        userService.register(daveForm);
        daveForm.setEmailAddress("seniorDevDevil@Gmail.com");

        assertThrows(SendAmAppException.class, () -> userService.register(daveForm));
//        assertThrows((RegisterFailureException.class, () -> userService.register(daveForm));
    }

    @Test
    public void registrationReturnsCorrectResponseTest(){
        RegisterUserRequest daveForm = createRegisterForm();

        RegisterUserResponse response = userService.register(daveForm);
        assertEquals("David Oludare", response.getFullname());
    }


}