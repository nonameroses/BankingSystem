import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
    private String accountNo;
    private Date date;
    private double amount;
    private TypeOfTransaction type;



    public Transaction(String accountNo, double amount, TypeOfTransaction type) {
        this.amount = amount;
        this.type = type;
        this.accountNo = accountNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void add(Transaction transaction){
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction);



    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TypeOfTransaction getType() {
        return type;
    }

    public void setType(TypeOfTransaction type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "account=" + accountNo +
                ", date=" + date +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
