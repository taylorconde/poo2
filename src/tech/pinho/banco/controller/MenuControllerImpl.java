package tech.pinho.banco.controller;

import java.util.Map;
import java.util.Scanner;

public class MenuControllerImpl implements MenuController {

    private final Map<Integer, MenuAction> options;

    public MenuControllerImpl(Map<Integer, MenuAction> options) {
        this.options = options;
    }

    @Override
    public void exibir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        for (Map.Entry<Integer, MenuAction> option : options.entrySet()) {
            System.out.println(option.getKey() + " - " + option.getValue().getTitle());
        }
        int opcao = 0;
        try {
            opcao = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Valor inválido. Digite um número!");
            return;
        }
        MenuAction action = options.get(opcao);

        if (action != null) {
            action.execute();
        } else {
            System.out.println("Opção inválida");
        }

    }

}
