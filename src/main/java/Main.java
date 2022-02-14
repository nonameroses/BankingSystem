import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

public class Main {

    public static void main(String[] args) {
        Account bankAccount = new BankAccount("101", "Lucas", 100);
        CurrencyUnit real = Monetary.getCurrency("GBP");




    }
}
