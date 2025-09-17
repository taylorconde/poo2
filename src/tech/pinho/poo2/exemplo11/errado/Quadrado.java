package tech.pinho.poo2.exemplo11.errado;

public class Quadrado extends Retangulo {

    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
        super.setBase(altura);
    }

    @Override
    public void setBase(double base) {
        super.setBase(base);
        super.setAltura(base);
    }
}
