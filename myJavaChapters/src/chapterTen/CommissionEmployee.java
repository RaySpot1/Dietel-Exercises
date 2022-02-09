package chapterTen;

public class CommissionEmployee extends Employee {
    public CommissionEmployee(String firstName, String lastName, String SSN) {
        super(firstName, lastName, SSN);
    }

    public double earnings(){
        return 0;
    }
}
