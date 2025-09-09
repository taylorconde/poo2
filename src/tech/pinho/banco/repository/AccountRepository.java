package tech.pinho.banco.repository;

import tech.pinho.banco.model.Account;

import java.util.List;

public class AccountRepository implements Repository<Account, Integer> {

    @Override
    public Account save(Account obj) {
        return null;
    }

    @Override
    public Account update(Account obj) {
        return null;
    }

    @Override
    public void delete(Account obj) {

    }

    @Override
    public List<Account> findAll() {
        return List.of();
    }

    @Override
    public Account findById(Integer id) {
        return null;
    }
}
