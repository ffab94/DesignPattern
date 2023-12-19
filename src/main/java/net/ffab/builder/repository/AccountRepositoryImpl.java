package net.ffab.builder.repository;

import net.ffab.builder.model.AccountStatus;
import net.ffab.builder.model.AccountType;
import net.ffab.builder.model.BankAccount;
import net.ffab.builder.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {
    private long accountCount = 0;
    public synchronized static AccountRepositoryImpl getInstance() {
        if(accountRepository == null){
            System.err.println("Singleton instantiation");
            accountRepository=new AccountRepositoryImpl();
            //accountRepository.populateData();
        }
        return accountRepository;
    }

    //private static final AccountRepositoryImpl accountRepository;
    private static AccountRepositoryImpl accountRepository;
    //static {
        //System.err.println("Singleton instantiation");
        //ccountRepository=new AccountRepositoryImpl();
        //accountRepository.populateData();
    //}


    private AccountRepositoryImpl(){

    }
    private Map<Long, BankAccount> bankAccountMap=new HashMap<>();


    @Override
    //public synchronized BankAccount save(BankAccount bankAccount) {
    public BankAccount save(BankAccount bankAccount) {
        long accountId;
        synchronized (this) {
            accountId = ++accountCount;  // critical zone

        }
        bankAccount.setAccountId(accountId);
        synchronized (this){
            bankAccountMap.put(accountId,bankAccount);
        }
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long accountId) {
        BankAccount account = bankAccountMap.get(accountId);
        if (account == null)
            return Optional.empty();
        return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccount(Predicate<BankAccount> predicate) {
        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.getAccountId(),bankAccount);
        return bankAccount;
    }

    @Override
    public void deleteById(Long accountId) {
        bankAccountMap.remove(accountId);
    }

    public void populateData(){
        for (int i = 0; i <10; i++) {
            BankAccount bankAccount= BankDirector.accountBuilder()
                    .balance(10000*Math.random()*90000)
                    .type(Math.random()>0.5? AccountType.SAVING_ACCOUNT:AccountType.CURRENT_ACCOUNT)
                    .status(Math.random()>0.5? AccountStatus.CREATED:AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.5?"MAD":"USD")
                    .build();

            save(bankAccount);
        }
        System.err.println("********************************************");
        System.err.println(Thread.currentThread().getName());
        System.err.println("Account count = " + accountCount);
        System.err.println("Size = " + bankAccountMap.values().size());
        System.err.println("********************************************");
    }
}
