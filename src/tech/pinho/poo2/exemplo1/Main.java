package tech.pinho.poo2.exemplo1;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 10);
        Quadrado quadrado = new Quadrado(30);
        Retangulo algo = new Quadrado(40);
        Quadrilatero quadrilatero = new Quadrado(40);

        System.out.println(retangulo);
        System.out.println(quadrado);
        System.out.println(algo);

        calculaArea(quadrilatero);
        calculaArea(quadrado);
        calculaArea(retangulo);
        System.out.println(retangulo.lado1);
    }

    public static void calculaArea(Quadrilatero quadrilatero) {
        System.out.println("O valor da área é de " + quadrilatero.calcularArea());
    }

}
