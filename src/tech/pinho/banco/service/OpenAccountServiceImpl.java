package tech.pinho.banco.service;

import tech.pinho.banco.model.Account;
import tech.pinho.banco.model.AccountStatus;
import tech.pinho.banco.model.AccountType;
import tech.pinho.banco.model.Owner;
import tech.pinho.banco.repository.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;

public class OpenAccountServiceImpl implements OpenAccountService {

    private final Repository<Account, Integer> accountRepository;

    public OpenAccountServiceImpl(Repository<Account, Integer> accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account execute(Owner owner, AccountType type) {
        Account account = new Account();
        account.setBalance(BigDecimal.ZERO);
        account.setAgency((short) 1);
        account.setEntries(new ArrayList<>());
        account.setStatus(AccountStatus.OPEN);
        account.setOwner(owner);
        account.setType(type);

        return accountRepository.save(account);
    }

}
