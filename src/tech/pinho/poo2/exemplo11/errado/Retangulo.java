package tech.pinho.poo2.exemplo11.errado;

public class Retangulo {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }
}
