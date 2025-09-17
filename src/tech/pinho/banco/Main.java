package tech.pinho.banco;

import tech.pinho.banco.controller.CreateAccountControllerImpl;
import tech.pinho.banco.controller.MenuAction;
import tech.pinho.banco.controller.MenuController;
import tech.pinho.banco.controller.MenuControllerImpl;
import tech.pinho.banco.model.Account;
import tech.pinho.banco.repository.AccountRepository;
import tech.pinho.banco.repository.Repository;
import tech.pinho.banco.service.OpenAccountService;
import tech.pinho.banco.service.OpenAccountServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final Repository<Account, Integer> accountIntegerRepository;
    public static final OpenAccountService openAccountService;
    public static final MenuAction createAccountController;
    public static final Map<Integer, MenuAction> actions;
    public static final MenuController menuController;

    static {
        accountIntegerRepository = new AccountRepository();
        openAccountService = new OpenAccountServiceImpl(accountIntegerRepository);
        createAccountController = new CreateAccountControllerImpl(openAccountService);
        actions = new HashMap<>();
        actions.put(1, createAccountController);
        actions.put(2, createAccountController);
        menuController = new MenuControllerImpl(actions);
    }

    public static void main(String[] args) {
        while (true) {
            menuController.exibir();
        }

    }
}
