package chapterTwo;

public class IntegerValueOfACharacter {
    public static void main(String[] args) {
        String unicodeSpecifiers = (int) 'A' + " " + (int)'B' + " " + (int)'C' + " " + (int)'a' + " " + (int)'b' + " " + (int)'c' + " " + (int)'0' + " " + (int)'1' + " " + (int)'2' + " " + (int)'$' + " " + (int)'*' + " " + (int)'+' + " " + (int)'/' + " " + (int)' ';

        System.out.println(unicodeSpecifiers);
    }
}
