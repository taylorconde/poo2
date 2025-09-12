package tech.pinho.banco;

import tech.pinho.banco.controller.ContaController;
import tech.pinho.banco.controller.ContaControllerImpl;
import tech.pinho.banco.model.Account;
import tech.pinho.banco.repository.AccountRepository;
import tech.pinho.banco.repository.Repository;
import tech.pinho.banco.service.OpenAccountService;
import tech.pinho.banco.service.OpenAccountServiceImpl;

public class Main {

    public static void main(String[] args) {
        Repository<Account, Integer> accountIntegerRepository = new AccountRepository();
        OpenAccountService openAccountService = new OpenAccountServiceImpl(accountIntegerRepository);
        ContaController contaController = new ContaControllerImpl(openAccountService);

        contaController.createAccount();
        contaController.createAccount();

    }
}
