package net.ffab.builder;

import net.ffab.builder.model.BankAccount;
import net.ffab.builder.repository.AccountRepositoryImpl;
import net.ffab.builder.util.JsonSerializer;

import java.util.List;

public class MainMT {
    public static void main(String[] args)  throws Exception{
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();

        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();

        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
            accountRepository.populateData();
            }).start();
        }

        System.err.println("Taper un caractère");
        System.in.read();

       List<BankAccount> bankAccounts = accountRepository.findAll();

        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

        System.out.println("==============================");
        BankAccount bankAccount=accountRepository.findById(1L).orElseThrow(null);
        if(bankAccount!=null)
            System.out.println(bankAccountJsonSerializer.toJson(bankAccount));


    }
}