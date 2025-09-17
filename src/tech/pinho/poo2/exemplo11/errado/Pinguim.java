package tech.pinho.poo2.exemplo11.errado;

public class Pinguim extends Ave {

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Não voa.");
    }
}
