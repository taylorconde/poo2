package tech.pinho.poo2.exemplo2;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Retangulo retangulo = new Retangulo(10, 5);
        circulo.desenhar();
        System.out.println("A área é de " + circulo.area());
        retangulo.desenhar();
    }
}
