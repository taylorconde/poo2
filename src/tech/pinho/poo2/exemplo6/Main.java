package tech.pinho.poo2.exemplo6;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 10);
        Quadrado quadrado = new Quadrado(30);

        // Pattern matching com switch (Java 17+)
        switch (retangulo) {
            case Quadrado q -> System.out.println("Área quadrado: " + q.calcularArea());
            case Retangulo r -> System.out.println("Área retângulo: " + r.calcularArea());
        }
    }

}