package tech.pinho.poo2.exemplo9.certo1;

public class Pinguim implements AveNadadora {

    @Override
    public void nadar() {
        System.out.println("Mergulha e nada!");
    }

    @Override
    public void andar() {
        System.out.println("Anda meio pinguim.");
    }
}
