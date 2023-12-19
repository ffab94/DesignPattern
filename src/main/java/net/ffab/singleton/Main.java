package net.ffab.singleton;

import net.ffab.singleton.model.AccountStatus;
import net.ffab.singleton.model.BankAccount;
import net.ffab.singleton.repository.AccountRepositoryImpl;
import net.ffab.singleton.util.JsonSerializer;

import java.util.List;

public class Main {
    public static void main(String[] args)  throws Exception{
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        /* BankAccount account = BankDirector.accountBuilder()
                .accountId(1L)
                .currency("MAD")
                .status(AccountStatus.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .build();
        System.out.println(account);
         */

        //AccountRepositoryImpl accountRepository=new AccountRepositoryImpl();
        AccountRepositoryImpl accountRepository= AccountRepositoryImpl.getInstance();

        //List<BankAccount> bankAccounts = accountRepository.findAll();
        List<BankAccount> bankAccounts = accountRepository.searchAccount(bankAccount ->
                bankAccount.getStatus().equals(AccountStatus.ACTIVATED) && bankAccount.getBalance()>1000);
        //bankAccounts.forEach(System.out::println);
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

        System.out.println("==============================");
        BankAccount bankAccount=accountRepository.findById(1L).orElseThrow(null);

        if(bankAccount!=null)
            System.out.println(bankAccountJsonSerializer.toJson(bankAccount));


    }
}