package tech.pinho.poo2.exemplo11.errado;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(5);
        retangulo.setBase(10);

        System.out.println("A área é de " + retangulo.area());
        System.out.println("A base é " + retangulo.getBase());
        System.out.println("A altura é " + retangulo.getAltura());
    }
}
