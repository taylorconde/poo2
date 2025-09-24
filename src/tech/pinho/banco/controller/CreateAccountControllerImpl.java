package tech.pinho.banco.controller;

import tech.pinho.banco.model.Account;
import tech.pinho.banco.model.AccountType;
import tech.pinho.banco.model.Owner;
import tech.pinho.banco.service.CreateOwner;
import tech.pinho.banco.service.OpenAccountService;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateAccountControllerImpl implements CreateAccountController, MenuAction {

    private final OpenAccountService openAccountService;
    private final CreateOwner createOwner;

    public CreateAccountControllerImpl(OpenAccountService openAccountService, CreateOwner createOwner) {
        this.openAccountService = openAccountService;
        this.createOwner = createOwner;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do usuário");
        String nome = sc.nextLine();

        System.out.print("Digite o CPF do usuário");
        String cpf = sc.nextLine();

        LocalDate nascimento = LocalDate.now();
        Owner owner = createOwner.execute(nome, cpf, nascimento);

        Account account = openAccountService.execute(owner, AccountType.CONTA_CORRENTE);

        System.out.println("A conta " + account + " foi criada com sucesso!");
    }

    @Override
    public String getTitle() {
        return "Abrir Conta";
    }
}
