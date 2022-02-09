package chapterTen;

public abstract class Employee {
    private final String firstName, lastName, SSN;

    public Employee(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSSN(){
        return SSN;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nSocial security number: %s", getFirstName(), getLastName(), getSSN());
    }

    public abstract double earnings();
}
