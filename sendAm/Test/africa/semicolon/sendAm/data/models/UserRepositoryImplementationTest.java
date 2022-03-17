package africa.semicolon.sendAm.data.models;

import africa.semicolon.sendAm.data.repositories.UserRepository;
import africa.semicolon.sendAm.data.repositories.UserRepositoryImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplementationTest {
    private UserRepository customer;
    @BeforeEach
    public void setUp(){
        customer = new UserRepositoryImplementation();

    }
    @Test
    public void UserSavesTest(){
        //given
        User aUser = new User();
//        User newUser = new User();
        aUser.setEmail("deolaoladeji@gmail.com");
        User savedUser = customer.save(aUser);
        //assert that the return, has an email;
        assertEquals("deolaoladeji@gmail.com",savedUser.getEmail());
        //assert that the count is 1;
        assertEquals(1,customer.count());

    }
    @Test
    void UsersSaveTest(){
        //given
        User firstUser = new User();
        User secondUser = new User();
        User ThirdUser = new User();

        firstUser.setEmail("tee@gmail.com");
        secondUser.setEmail("ted@gmail.com");
        ThirdUser.setEmail("tea@gmail.com");
        //when
        customer.save(firstUser);
        customer.save(secondUser);
        customer.save(ThirdUser);
        //assert

        User foundUser= customer.findByEmail("ted@gmail.com");
        assertEquals(secondUser,foundUser);
        assertEquals("ted@gmail.com",foundUser.getEmail());


    }
    @Test
    void deleteUserByEmailTest(){
        //given
        User firstUser = new User();
        User secondUser = new User();
        User ThirdUser = new User();
        //when
        firstUser.setEmail("tee@gmail.com");
        secondUser.setEmail("ted@gmail.com");
        ThirdUser.setEmail("tea@gmail.com");
        customer.save(firstUser);
        customer.save(secondUser);
        customer.save(ThirdUser);
        //assert
        customer.delete("ted@gmail.com");
        assertEquals(2,customer.count());
    }

    private void saveThreeUsers(){
        //given
        User firstUser = new User();
        User secondUser = new User();
        User ThirdUser = new User();
        //when
        firstUser.setEmail("tee@gmail.com");
        secondUser.setEmail("ted@gmail.com");
        ThirdUser.setEmail("tea@gmail.com");
        customer.save(firstUser);
        customer.save(secondUser);
        customer.save(ThirdUser);
    }
    @Test
    void confirmUserDeletionTest(){
        saveThreeUsers();
        customer.delete("ted@gmail.com");

        User foundUser= customer.findByEmail("ted@gmail.com");
        assertNull(foundUser);

    }
    @Test
    void saveANewUserEmailAfterDelete_givesCorrectPackageIdTest(){
        //given
        saveThreeUsers();
       User fourthUser= new User();
        fourthUser.setEmail("del@gmail.com");
        User savedUser = customer.save(fourthUser);
        assertEquals("del@gmail.com",savedUser.getEmail());
    }
    @Test
    void deleteByUserTest(){
        //given
        User firstUser = new User();
        User secondUser = new User();
        User ThirdUser = new User();

        customer.save(firstUser);
        customer.save(secondUser);
        customer.save(ThirdUser);

        customer.delete(ThirdUser);
        assertEquals(2,customer.count());
//        assertNull(customer.findByEmail("tea@gmail.com"));

    }

    @Test
    void findAllTest(){
        saveThreeUsers();
        List<User> all =customer.findAll();
        assertEquals(3,all.size());
    }


}