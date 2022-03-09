package africa.semicolon.phoneBook.data.models;

import lombok.*;
//this is how lombok works

@Data //creates getters and setters implicitly
//@NoArgsConstructor
//@AllArgsConstructor // creating a constructor with all the instance variables as arguments
@RequiredArgsConstructor //selected   variables and creates constructors with it.
//@EqualsAndHashCode // create

public class Contacts {
    private String firstName;
    private String lastName;
    private String middleName;
    @NonNull // creates a constructor that includes only mobile as args
    private String mobile;
    private String office;

//    model - contact
//    contact repository - save, update, delete
//    services- add contact, delete contact, search contact by firstname, by lastname
//    controllers -
}
