import Objects.Account;

import java.util.ArrayList;

public class BankList {
    private ArrayList<Account> listOfAccounts;

    public BankList() {
        this.listOfAccounts = new ArrayList<>();
    }

    public void printAccounts(){
        for(Account account : listOfAccounts){
            System.out.println(account);
        }
    }
    public void add(Account account){
        listOfAccounts.add(account);
    }
}
