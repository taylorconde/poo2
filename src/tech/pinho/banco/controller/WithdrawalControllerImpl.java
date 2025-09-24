package tech.pinho.banco.controller;

import tech.pinho.banco.service.GenerateTransactionService;
import tech.pinho.banco.service.WithdrawalGenerateTransactionServiceImpl;

import java.math.BigDecimal;
import java.util.Scanner;

public class WithdrawalControllerImpl implements WithdrawalController, MenuAction {

    private GenerateTransactionService generateTransactionService;

    public WithdrawalControllerImpl(WithdrawalGenerateTransactionServiceImpl generateTransactionService) {
        this.generateTransactionService = generateTransactionService;
    }

    @Override
    public String getTitle() {
        return "Saque 24h";
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta");
        Integer accountNumber = Integer.valueOf(sc.nextLine());

        System.out.print("Digite o valor do saque");
        BigDecimal amount = new BigDecimal(sc.nextLine());

        System.out.print("Digite a descrição do saque");
        String description = sc.nextLine();

        generateTransactionService.execute(accountNumber, amount, description);
    }
}
