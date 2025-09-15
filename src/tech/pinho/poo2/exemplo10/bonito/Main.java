package tech.pinho.poo2.exemplo10.bonito;

public class Main {

    public static void main(String[] args) {
        FuncionarioComCalculo funcionario1 = new FuncionarioComCalculo(10, 200, 300, TipoFuncionario.CLT);
        FuncionarioComCalculo funcionario2 = new FuncionarioComCalculo(10, 200, 300, TipoFuncionario.PJ);
        FuncionarioComCalculo funcionario3 = new FuncionarioComCalculo(10, 200, 300, TipoFuncionario.TERCEIRIZADO);

        System.out.println("O salário de F1 recebido foi de " + funcionario1.calculaSalario());
        System.out.println("O salário de F2 recebido foi de " + funcionario2.calculaSalario());
        System.out.println("O salário de F3 recebido foi de " + funcionario3.calculaSalario());

    }
}
