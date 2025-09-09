package tech.pinho.poo2.exemplo2;

public class Retangulo extends Forma implements Desenhavel {

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("********");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("********");

    }

    @Override
    double area() {
        return altura * largura;
    }
}
