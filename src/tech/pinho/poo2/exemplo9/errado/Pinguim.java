package tech.pinho.poo2.exemplo9.errado;

public class Pinguim implements Ave {

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Não voa.");
    }

    @Override
    public void nadar() {
        System.out.println("Mergulha e nada!");
    }

    @Override
    public void andar() {
        System.out.println("Anda meio pinguim.");
    }
}
