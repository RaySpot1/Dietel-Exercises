package africa.semicolon.phoneBook.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//this is how lombok works

@Data //creates getters and setters implicitly
@NoArgsConstructor
@ToString
@Document("Contacts") //to tell mongodb that it should work on this project
//@AllArgsConstructor // creating a constructor with all the instance variables as arguments
@RequiredArgsConstructor //selected   variables and creates constructors with it.
//@EqualsAndHashCode // create

public class Contact {
    @Id //tells the db url to generate automated id
    private String id;
    @NonNull
    private String firstName;
    private String lastName;
    private String middleName;
//    @NonNull // creates a constructor that includes only mobile as args along required @argsconsctructor
    @NonNull
    private String mobile;
    private String office;





//    model - contact
//    contact repository - save, update, delete
//    services- add contact, delete contact, search contact by firstname, by lastname, contactExist
//    controllers -
}
