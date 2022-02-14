import java.util.ArrayList;
import java.util.List;

public class BankAccount extends Account{
    private Transaction transaction;


    public BankAccount(String accountNo, String name, double balance) {
            super(accountNo,name,balance);
    }


    @Override
    public void withdraw(double amount) {
        if(this.balance - amount > 0){
            this.balance = this.balance - amount;
            transaction = new Transaction(super.getAccountNo(),amount, TypeOfTransaction.WITHDRAW);
            super.transactions.add(transaction);

        }else if (amount > balance){
            System.out.println("Insufficient Funds!");
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance =+ amount;
    }

    @Override
    public void transaction() {

    }


    public void transfer() {

    }



}
