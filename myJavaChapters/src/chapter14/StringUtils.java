package chapter14;

import java.util.Locale;

public class StringUtils {
    private String string;
//    private String value;

    public StringUtils(String string){
        this.string = string;
    }

    public int _lastIndexOf(char character){
        int returnIndex = -1;
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) == character){
                returnIndex = i;
            }
        }
        return returnIndex;
    }

    public int _indexOf(char character){
        int returnIndexOf = -1;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == character){
                return i;
            }
        }
        return returnIndexOf;
    }

//    public int _indexOf(char character, boolean ignoreCase) {
//        int returnIndexOf = -1;
//        if (ignoreCase) {
//            string = string.toLowerCase();
//            character = Character.toLowerCase(character);
//            for (int i = 0; i < string.length(); i++) {
//                if (string.charAt(i) == character) {
//                    returnIndexOf = i;
//                }
//            }
//            return returnIndexOf;
//        }


    public int _count(char character){
        int counted = 0;

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == character){
                counted++;
            }
        }
        return counted;
    }


    public static void main(String[] args) {
        StringUtils string =  new StringUtils("Helen");
       int output = string._indexOf('e');
        System.out.println(output);
    }
}
