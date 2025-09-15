package tech.pinho.banco;

import tech.pinho.banco.controller.CreateAccountController;
import tech.pinho.banco.controller.CreateAccountControllerImpl;
import tech.pinho.banco.controller.MenuController;
import tech.pinho.banco.controller.MenuControllerImpl;
import tech.pinho.banco.model.Account;
import tech.pinho.banco.repository.AccountRepository;
import tech.pinho.banco.repository.Repository;
import tech.pinho.banco.service.OpenAccountService;
import tech.pinho.banco.service.OpenAccountServiceImpl;

public class Main {

    public static void main(String[] args) {
        Repository<Account, Integer> accountIntegerRepository = new AccountRepository();
        OpenAccountService openAccountService = new OpenAccountServiceImpl(accountIntegerRepository);
        CreateAccountController createAccountController = new CreateAccountControllerImpl(openAccountService);
        MenuController menuController = new MenuControllerImpl();
        while (true) {
            menuController.exibir();
        }

    }
}
