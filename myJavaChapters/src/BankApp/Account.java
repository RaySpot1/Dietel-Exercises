package BankApp;

public class Account {
    private String name;
    private String pin;
    private int balance;

    public Account(String accountName, String accountNeedle) {
        name= accountName;
        pin = accountNeedle;
        balance = 50_000;
    }
    public String getAccountName(){

        return name;
    }

    public int getAccountBalance(String accountNeedle) {
        return balance;
    }
//    public void deposit(int amount){
//        if(account > 0) balance = balance + account;
//    }
}
