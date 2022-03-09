import africa.semicolon.phoneBook.data.models.Contacts;

public class Main {
    public static void main(String[] args) {
        Contacts contact = new Contacts("RaySpot", "2000");

        System.out.printf("%s%n%s", contact.getFirstName(), contact.getMobile());
    }
}
