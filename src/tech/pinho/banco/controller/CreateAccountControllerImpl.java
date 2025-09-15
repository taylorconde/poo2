package tech.pinho.banco.controller;

import tech.pinho.banco.model.Account;
import tech.pinho.banco.model.AccountType;
import tech.pinho.banco.model.Owner;
import tech.pinho.banco.service.OpenAccountService;

import java.util.Scanner;

public class CreateAccountControllerImpl implements CreateAccountController, MenuAction {

    private final OpenAccountService openAccountService;

    public CreateAccountControllerImpl(OpenAccountService openAccountService) {
        this.openAccountService = openAccountService;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do usuário");
        String nome = sc.nextLine();

        System.out.print("Digite o CPF do usuário");
        String cpf = sc.nextLine();

        Owner owner = new Owner();
        owner.setCpf(cpf);
        owner.setNome(nome);

        Account account = openAccountService.execute(owner, AccountType.CONTA_CORRENTE);

        System.out.println("A conta " + account + " foi criada com sucesso!");
    }

    @Override
    public String getTitle() {
        return "Abrir Conta";
    }
}
