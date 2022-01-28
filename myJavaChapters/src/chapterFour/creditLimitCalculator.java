package chapterFour;

public class creditLimitCalculator {
    private int accountNumber, beginningBalance, charges, credits, creditLimit;

    public creditLimitCalculator(int accountNumber, int beginningBalance, int charges, int credits, int creditLimit){
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.charges = charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
    }

    public int getNewBalance(){
        return beginningBalance + charges - credits;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBeginningBalance(int beginningBalance){
        this.beginningBalance = beginningBalance;
    }
    public int getBeginningBalance(){
        return beginningBalance;
    }

    public void setCharges(int charges){
        this.charges = charges;
    }
    public int getCharges(){
        return charges;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }

    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }

}
