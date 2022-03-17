package africa.semicolon.phoneBook.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
    public boolean isSuccessful;
    private String message;
}
