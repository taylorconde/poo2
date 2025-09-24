package tech.pinho.banco;

import tech.pinho.banco.controller.*;
import tech.pinho.banco.model.Account;
import tech.pinho.banco.repository.AccountRepository;
import tech.pinho.banco.repository.Repository;
import tech.pinho.banco.service.GenerateTransactionService;
import tech.pinho.banco.service.OpenAccountService;
import tech.pinho.banco.service.OpenAccountServiceImpl;
import tech.pinho.banco.service.WithdrawalGenerateTransactionServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final AccountRepository accountRepository;
    public static final AccountRepository accountRepository2;

    public static final OpenAccountService openAccountService;
    public static final GenerateTransactionService withdrawalGenerateTransactionService;
    public static final MenuAction createAccountController;
    public static final MenuAction withdrawalController;
    public static final Map<Integer, MenuAction> actions;
    public static final MenuController menuController;

    static {
        accountRepository = AccountRepository.getInstance();
        accountRepository2 = AccountRepository.getInstance();
        openAccountService = new OpenAccountServiceImpl(accountRepository);
        withdrawalGenerateTransactionService = new WithdrawalGenerateTransactionServiceImpl(accountRepository2);
        createAccountController = new CreateAccountControllerImpl(openAccountService);
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
