package net.ffab.protype;

import net.ffab.protype.model.AccountStatus;
import net.ffab.protype.model.AccountType;
import net.ffab.protype.model.BankAccount;
import net.ffab.protype.model.Customer;

import java.util.List;

public class Main {
    public static void main(String[] args)  throws Exception{
      BankAccount account1=new BankAccount();
      account1.setAccountId(1L);
      account1.setBalance(1000);
      account1.setCurrency("MAD");
      account1.setType(AccountType.SAVING_ACCOUNT);
      account1.setStatus(AccountStatus.ACTIVATED);
      account1.setCustomer(new Customer(1L, "Mohamed"));

        BankAccount account2=new BankAccount();
        account2.setAccountId(account1.getAccountId());
        account2.setBalance(account1.getBalance());
        account2.setCurrency(account1.getCurrency());
        account2.setType(account1.getType());
        account2.setStatus(account1.getStatus());
        account2.setCustomer(account1.getCustomer());

        BankAccount account3=account1.clone();

      System.err.println(account1);
      System.err.println(account2);
      System.err.println(account3);



    }
}