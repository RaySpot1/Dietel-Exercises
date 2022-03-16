package africa.semicolon.phoneBook.dtos.response;

import lombok.Data;

@Data
public class FindContactResponse {
    private String firstName;
    private String lastName;
    private String middleName;
    private String mobile;
    private String office;

}
