package tech.pinho.poo2.exemplo6;

public non-sealed class Quadrado extends Retangulo  implements Quadrilatero {

    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", lado4=" + lado4 +
                '}';
    }

    public void algumMetodo() {
        System.out.println("Alguma coisa");
    }
}
