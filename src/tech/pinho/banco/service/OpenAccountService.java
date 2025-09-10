package tech.pinho.banco.service;

import tech.pinho.banco.model.Account;
import tech.pinho.banco.model.AccountType;
import tech.pinho.banco.model.Owner;

public interface OpenAccountService {

    Account execute(Owner owner, AccountType type);
}
