package africa.semicolon.sendAm.data.models;

public class User {

    private String User;
    private String email;
    private String fullName;
    private String phoneNumber;
    private String address;

    public User(String user, String email, String fullName, String phoneNumber, String address) {
        User = user;
        this.email = email;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(){
    }


    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){

        this.email = email;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String setPhoneNumber(String phoneNumber){
        return this.phoneNumber;
    }
    public void getPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "User{" +
                "User='" + User + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int count(){
        return 0;
    }
}
