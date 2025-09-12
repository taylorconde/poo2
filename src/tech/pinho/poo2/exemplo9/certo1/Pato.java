package tech.pinho.poo2.exemplo9.certo1;

public class Pato implements AveCompleta {

    @Override
    public void nadar() {
        System.out.println("Nada mal");
    }

    @Override
    public void voar() {
        System.out.println("Voar mal");
    }

    @Override
    public void andar() {
        System.out.println("Andar mal");
    }
}
