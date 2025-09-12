package tech.pinho.poo2.exemplo9.errado;

public class Albatroz implements Ave {
    @Override
    public void voar() {
        System.out.println("Albatroz voa médio!");
    }

    @Override
    public void nadar() {
        throw new UnsupportedOperationException("Quase mas não");

    }

    @Override
    public void andar() {
        System.out.println("Albatroz andando!");
    }
}
