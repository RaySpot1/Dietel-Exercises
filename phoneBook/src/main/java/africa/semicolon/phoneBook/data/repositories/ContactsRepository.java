package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contacts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactsRepository {
    Contacts save(Contacts aContact);
    void delete(Contacts aContact);

    int count();

    void deleteByMobile(String mobile);

    Contacts searchContactByFirstName(String firstName);

    Contacts searchContactByMobile(String phoneNumber);

    Contacts findByName(String name);
}

//public interface ContactsRepository extends MongoRepository<Contacts, String>{
//    Contacts save(Contacts aContact);
////    Contacts edit(Contacts aContact);
//    void searchContactByMobile(String mobile);
//    Contacts searchContactByFirstName(String firstName); //telling mongo db to create itself
//    String searchContactByPhoneNumber(String phoneNumber);
//    void delete(Contacts aContact);
//    void searchByContact(String mobile);
//    int count();
//} //relying on mongodb to create repository instead of the one above smh
