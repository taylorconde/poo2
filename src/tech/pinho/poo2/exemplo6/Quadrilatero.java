package tech.pinho.poo2.exemplo6;

public sealed interface Quadrilatero permits Quadrado, Retangulo {

    public abstract double calcularArea();
}
