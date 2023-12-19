package net.ffab.singleton.repository;

import net.ffab.singleton.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {
    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(Long accountId);
    List<BankAccount> searchAccount(Predicate<BankAccount> predicate);

    BankAccount update(BankAccount bankAccount);
    void deleteById(Long accountId);


}
