package tech.pinho.poo2.exemplo11.certo1;


public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);

        System.out.println("A área é de " + retangulo.area());
        System.out.println("A base é " + retangulo.getBase());
        System.out.println("A altura é " + retangulo.getAltura());
    }
}
