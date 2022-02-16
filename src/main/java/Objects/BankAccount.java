package Objects;

import java.math.BigDecimal;

public class BankAccount extends Account{



    public BankAccount(String accountNo, String name) {
            super(accountNo,name);
    }


    @Override
    public boolean withdraw(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.valueOf(0)) < 0){
            System.out.println("Cannot withdraw a negative number!");
            return false;
        }
        if(amount.compareTo(balance) > 0){
            System.out.println("Insufficient Funds!");
            return false;
        }

        this.balance = super.balance.subtract(amount);
        super.transaction = new Transaction(super.getAccountNo(),amount, TypeOfTransaction.WITHDRAW);
        super.transactions.add(transaction);
        return true;


    }

    @Override
    public boolean deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.valueOf(0)) < 0){
            System.out.println("Cannot deposit a negative number!");
            return false;
        }

        this.balance = super.balance.add(amount);
        transaction = new Transaction(super.getAccountNo(),amount, TypeOfTransaction.DEPOSIT);
        super.transactions.add(transaction);
        return true;
    }




    public boolean transferTo(Account accountTo, BigDecimal amount) {
        if(amount.compareTo(BigDecimal.valueOf(0)) < 0){
            System.out.println("Cannot transfer a negative number!");
            return false;
        }
        this.balance = this.balance.subtract(amount);
        accountTo.deposit(amount);
        super.transactions.add(new Transaction(super.getAccountNo(),amount, TypeOfTransaction.TRANSFER));
        return true;

    }



}
