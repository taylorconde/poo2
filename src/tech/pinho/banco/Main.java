package tech.pinho.banco;

import tech.pinho.banco.model.Account;
import tech.pinho.banco.repository.AccountRepository;
import tech.pinho.banco.repository.Repository;
import tech.pinho.banco.service.OpenAccountService;
import tech.pinho.banco.service.OpenAccountServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Repository<Account, Integer> accountIntegerRepository = new AccountRepository();
        OpenAccountService openAccountService = new OpenAccountServiceImpl(accountIntegerRepository);
    }
}
