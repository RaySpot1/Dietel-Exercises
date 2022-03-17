package africa.semicolon.phoneBook.dtos.response;


import lombok.Data;

@Data
public class RegisterContactResponse {
    private String firstName;
    private String fullName;
    private String mobile;
    private String message;
}
