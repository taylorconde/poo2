package tech.pinho.poo2.exemplo9.certo2;

public class Albatroz implements Ave, Voador {

    @Override
    public void voar() {
        System.out.println("Albatroz voa médio!");
    }

    @Override
    public void andar() {
        System.out.println("Albatroz andando!");
    }
}
