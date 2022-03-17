package africa.semicolon.phoneBook.exception;

public class ContactNotFoundException extends ContactAppException {
    public ContactNotFoundException(String message){
        super(message);
    }
}
