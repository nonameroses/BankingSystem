import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Account {
    protected String accountNo;
    protected String name;
    protected double balance;
    protected List<Transaction> transactions;
    protected CurrencyUnit real;


    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.real = Monetary.getCurrency("GBP");
        this.transactions = new ArrayList<>();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract void transaction();

    public void printTransactions(){
        for(Transaction transaction : transactions){
            System.out.println(transaction);
        }
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account Number: " + accountNo +
                " Name: " + this.name + " Balance: "
                +balance + "\n";
    }
}
