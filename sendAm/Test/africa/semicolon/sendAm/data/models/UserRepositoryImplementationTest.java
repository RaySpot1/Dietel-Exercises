package africa.semicolon.sendAm.data.models;

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

        //when i try to save the save;
//            aUser.setEmail("deolaoladeji@gmail.com");
        User savedUser = customer.save(aUser);
        //assert that the return, has an email;
        assertEquals("deolaoladeji@gmail.com",savedUser.getEmail());
        //assert that the count is 1;
        assertEquals(1,customer.count());

    }
    @Test
    void UserSaveTest(){
        //given
        User firstUser = new User();
        User secondUser = new User();
        User ThirdUser = new User();
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
        customer.save(firstUser);
        customer.save(secondUser);
        customer.save(ThirdUser);
    }
    @Test
    void findByIdWorks_AfterDeleteByUser(){
        saveThreeUsers();
        customer.delete("ted@gmail.com");

        User foundUser= customer.findByEmail("ted@gmail.com");
        assertNull(foundUser);

    }
    @Test
    void saveNewEmailAfterADelete_givesCorrectPackageIdTest(){
        //given
        saveThreeUsers();
        customer.delete("del@gmail.com");
        User savedUser=customer.save(new User());
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
        assertNull(customer.findByEmail("rate34@gmail.com"));

    }
    @Test
    void findAllTest(){
        saveThreeUsers();
        List<User> all =customer.findAll();
        assertEquals(3,all.size());
    }


}