package tech.pinho.poo2.exemplo10.certo;


public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(10, 200, 300, new CLTista());
        Funcionario funcionario2 = new Funcionario(10, 200, 300, new PessoaJuridica());
        Funcionario funcionario3 = new Funcionario(10, 200, 300, new Terceirizado());

        System.out.println("O salário de F1 recebido foi de " + funcionario1.getTipo().calculaSalario(funcionario1));
        System.out.println("O salário de F2 recebido foi de " + funcionario2.getTipo().calculaSalario(funcionario2));
        System.out.println("O salário de F3 recebido foi de " + funcionario3.getTipo().calculaSalario(funcionario3));

    }
}
