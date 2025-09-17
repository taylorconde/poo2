package tech.pinho.poo2.exemplo11.certo1;

public class Retangulo {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double area() {
        return base * altura;
    }
}
