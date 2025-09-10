package tech.pinho.banco.repository;

import tech.pinho.banco.model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements Repository<Account, Integer> {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public Account save(Account account) {
        account.setNumber(accounts.size() + 1);
        accounts.add(account);
        return account;
    }

    @Override
    public Account update(Account obj) {
        accounts.set(obj.getNumber() - 1, obj);
        return obj;
    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public Account findById(Integer id) {
        return accounts.get(id - 1);
    }
}
