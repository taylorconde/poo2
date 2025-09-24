package tech.pinho.banco;

import tech.pinho.banco.controller.*;
import tech.pinho.banco.repository.AccountRepository;
import tech.pinho.banco.service.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final AccountRepository accountRepository;
    public static final AccountRepository accountRepository2;

    public static final OpenAccountService openAccountService;
    public static final CreateOwnerService createOwnerService;
    public static final GenerateTransactionService withdrawalGenerateTransactionService;
    public static final MenuAction createAccountController;
    public static final MenuAction withdrawalController;
    public static final Map<Integer, MenuAction> actions;
    public static final MenuController menuController;

    static {
        accountRepository = AccountRepository.getInstance();
        accountRepository2 = AccountRepository.getInstance();
        openAccountService = new OpenAccountServiceImpl(accountRepository);
        createOwnerService = new CreateOwnerServiceImpl();
        withdrawalGenerateTransactionService = new WithdrawalGenerateTransactionServiceImpl(accountRepository2);
        createAccountController = new CreateAccountControllerImpl(openAccountService, createOwnerService);
        withdrawalController = new WithdrawalControllerImpl((WithdrawalGenerateTransactionServiceImpl) withdrawalGenerateTransactionService);

        actions = new HashMap<>();
        actions.put(1, createAccountController);
        actions.put(2, withdrawalController);
        menuController = new MenuControllerImpl(actions);
    }

    public static void main(String[] args) {
        while (true) {
            try {
                menuController.exibir();
            } catch (Exception e) {
                System.out.println("Erro inesperado, tente novamente!");
                e.printStackTrace();
            }
        }

    }
}
