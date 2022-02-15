import java.math.BigDecimal;

public class BankAccount extends Account{
    private Transaction transaction;


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
        transaction = new Transaction(super.getAccountNo(),amount, TypeOfTransaction.WITHDRAW);
        super.transactions.add(transaction);
        return true;


    }

    @Override
    public boolean deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.valueOf(0)) < 0){
            System.out.println("Cannot deposit a negative number!");
            return false;
        }
        if(amount.compareTo(balance) > 0){
            System.out.println("Insufficient Funds!");
            return false;
        }



        this.balance = super.balance.add(amount);
        transaction = new Transaction(super.getAccountNo(),amount, TypeOfTransaction.DEPOSIT);
        super.transactions.add(transaction);
        return true;
    }




    public void transfer() {

    }



}
