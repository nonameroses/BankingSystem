import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankList bankList = new BankList();

        Account bankAccount1 = new BankAccount("101", "Lucas");
        Account bankAccount2 = new BankAccount("102", "Tom");

        bankList.add(bankAccount1);
        bankList.add(bankAccount2);

        bankAccount1.withdraw(BigDecimal.valueOf(-2));

        bankList.printAccounts();



    }
}
