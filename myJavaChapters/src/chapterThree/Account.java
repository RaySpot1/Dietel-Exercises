package chapterThree;
//Modified Account class with withdraw method
public class Account {
    private String name;
    private double balance;
    private double withdraw;

    public Account(String name, double balance){
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    public double withdrawal(double withdrawalAmount){
        if (withdrawalAmount > balance){
            System.out.println("Withdrawal amount exceeds account balance");
            return balance;
        } else if(withdrawalAmount < balance || withdrawalAmount == balance){
            withdraw = balance - withdrawalAmount;
        }
        return withdraw;
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance += depositAmount;
        }else if(depositAmount < 0.0){
            System.out.println("\nDeposit not possible");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance(){
        return balance;
    }
//    public void setBalance(double balance){
//        this.balance = balance;
//    }
}
