package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ContactRepositoryTest {

    @Autowired
    private ContactRepository contactRepository;

    @Test
    public void saveContactTest(){
        Contact contact = new Contact();
        contact.setFirstName("No");
        contact.setLastName("No");
        contact.setMiddleName("No");
        contact.setOffice("Lagos");
        contact.setMobile("1234");
        Contact savedContact = contactRepository.save(contact);
        assertNotNull(savedContact.getId());
        assertEquals(1, contactRepository.count());
        assertThat(savedContact.getId(), is(notNullValue()));
        assertThat(contactRepository.count(), is(1L));
    }


}