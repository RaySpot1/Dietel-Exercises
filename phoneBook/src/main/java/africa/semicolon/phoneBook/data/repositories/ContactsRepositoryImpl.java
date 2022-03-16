package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactsRepositoryImpl implements ContactsRepository {
    private final List<Contacts> db = new ArrayList<>();
    private int count=0;


    @Override
    public Contacts save(Contacts aContact) {
        db.add(aContact);
//        count++;
//        System.out.println();


        return aContact;
    }

    @Override
    public void delete(Contacts aContact) {
        db.remove(aContact);
//        count--;
    }



    @Override
    public int count() {
      return   ++count;

    }

    @Override
    public void deleteByMobile(String mobile) {
//        for (Contacts contact: contactsList) {
//            if(mobile.equals(contact.getMobile())){
//                contactsList.remove(contact);
//            }
//        }

        db.removeIf(contact -> mobile.equals(contact.getMobile()));
    }

    @Override
    public Contacts searchContactByFirstName(String firstName) {
        for(Contacts searchByFirstName: db){
            if(firstName.equalsIgnoreCase(searchByFirstName.getFirstName())){
                return searchByFirstName;
            }
        }
        return null;
    }

    @Override
    public Contacts searchContactByMobile(String phoneNumber) {
        for(Contacts searchByPhoneNumber: db){
            if(phoneNumber.equalsIgnoreCase(searchByPhoneNumber.getMobile())){
                return searchByPhoneNumber;
            }
        }
        return null;
    }

    @Override
    public Contacts findByName(String name) {
        for(Contacts contact: db){
            if(contact.getFirstName().equalsIgnoreCase(name) || contact.getLastName().equalsIgnoreCase(name));
            return contact;
        }
        return null;
    }
}
