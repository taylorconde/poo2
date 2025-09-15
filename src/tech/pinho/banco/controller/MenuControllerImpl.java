package tech.pinho.banco.controller;

import java.util.Scanner;

public class MenuControllerImpl implements MenuController {

    @Override
    public void exibir() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Abrir Conta");
        System.out.println("2 - Verificar saldo");
        System.out.println("3 - Criar transação");
        System.out.println("4 - Verificar extrato");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> abrirConta();
            case 2 -> verificarSaldo();
            case 3 -> criarTransacao();
            case 4 -> verificarExtrato();
            default -> invalido();
        }
    }

    private void invalido() {
    }

    private void verificarExtrato() {
    }

    private void criarTransacao() {
    }

    private void verificarSaldo() {
    }

    private void abrirConta() {
    }
}
