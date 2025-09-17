package tech.pinho.poo2.exemplo11.certo2;

public class Retangulo implements  FiguraGeometrica{

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
