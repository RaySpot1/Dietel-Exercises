package africa.semicolon.phoneBook.exception;

public class ContactNotFoundException extends ContactExistException {
    public ContactNotFoundException(String message){
        super(message);
    }
}
