package africa.semicolon.phoneBook.util;

import africa.semicolon.phoneBook.dtos.requests.RegisterContactRequest;

public class CaseUtil {
    public static void filter(RegisterContactRequest registerContactRequest){
        registerContactRequest.setFirstName(registerContactRequest.getFirstName());
        registerContactRequest.setMiddleName(registerContactRequest.getMiddleName());
        registerContactRequest.setLastName(registerContactRequest.getLastName());
    }

    private static String convert(String string){
        return Character.toUpperCase(string.charAt(0)) + (string.substring(1).toLowerCase());
    }
}
