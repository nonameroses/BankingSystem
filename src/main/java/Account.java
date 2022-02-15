import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Account {
    private String accountNo;
    private String name;
    protected List<Transaction> transactions;
    protected BigDecimal balance;


    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = new BigDecimal(0);
        this.transactions = new ArrayList<>();
    }



    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public abstract boolean withdraw(BigDecimal amount);
    public abstract boolean deposit(BigDecimal amount);

    public void printTransactions(){
        for(Transaction transaction : transactions){
            System.out.println(transaction);
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
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


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNo +
                " || Name: " + this.name + " || Balance: "+
                this.balance + "\n";
    }

}
