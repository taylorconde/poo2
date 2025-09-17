package tech.pinho.poo2.exemplo11.certo2;

public class Quadrado implements FiguraGeometrica {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
