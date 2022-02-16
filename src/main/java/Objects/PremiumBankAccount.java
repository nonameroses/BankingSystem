package Objects;

import java.math.BigDecimal;

public class PremiumBankAccount extends  Account{
    private boolean overdraft = true;
    private float interest,years;


    public PremiumBankAccount(String accountNo, String name) {
        super(accountNo, name);
        this.overdraft = true;
        this.interest = (float) 1.2;
        this.years = 0;
    }

    public PremiumBankAccount(String accountNo) {
        super(accountNo);
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.valueOf(0)) < 0){
            System.out.println("Cannot withdraw a negative number!");
            return false;
        }
        if(overdraft && amount.compareTo(balance) > 0){
            System.out.println("Transaction success, but you entered overdraft!");

            return true;

        }

        this.balance = super.balance.subtract(amount);
        transaction = new Transaction(super.getAccountNo(),amount, TypeOfTransaction.WITHDRAW);
        super.transactions.add(transaction);




        return false;
    }

    @Override
    public boolean deposit(BigDecimal amount) {
        return false;
    }

    @Override
    public boolean transferTo(Account accountTo, BigDecimal amount) {
        return false;
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public float getYears() {
        return years;
    }

    public void setYears(float years) {
        this.years = years;
    }
}
