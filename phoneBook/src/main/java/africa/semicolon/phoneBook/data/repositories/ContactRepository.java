package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
    List<Contact> findContactsByFirstName(String firstName);
    List<Contact> findContactByLastName(String lastName);
    List<Contact> findContactByMiddleName(String middleName);
    Contact findContactByFirstNameAndLastName(String firstName, String lastName);
    List<Contact> findContactByFirstNameOrLastName(String firstName, String lastName);

}
