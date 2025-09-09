package tech.pinho.poo2.exemplo6;

public non-sealed class Retangulo implements Quadrilatero {

    public final double lado1;
    protected final double lado2;
    protected final double lado3;
    protected final double lado4;


    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado1;
        this.lado4 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getLado4() {
        return lado4;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", lado4=" + lado4 +
                '}';
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

}
