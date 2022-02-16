import Objects.Account;
import Objects.BankAccount;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankList bankList = new BankList();

        Account bankAccount1 = new BankAccount("101", "Lucas");
        Account bankAccount2 = new BankAccount("102", "Tom");



        bankList.add(bankAccount1);
        bankList.add(bankAccount2);
        bankAccount1.deposit(BigDecimal.valueOf(200));
        bankAccount1.transferTo(bankAccount2, BigDecimal.valueOf(100));



        bankList.printAccounts();

        bankAccount1.printTransactions();
        bankAccount2.printTransactions();



    }
}
