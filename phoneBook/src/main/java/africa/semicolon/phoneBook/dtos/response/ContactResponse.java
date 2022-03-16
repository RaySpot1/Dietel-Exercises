package africa.semicolon.phoneBook.dtos.response;


import lombok.Data;

@Data
public class ContactResponse {
    private String fullName;
    private String mobile;
    private String message;
}
