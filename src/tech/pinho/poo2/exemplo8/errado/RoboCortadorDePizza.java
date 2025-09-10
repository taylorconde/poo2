package tech.pinho.poo2.exemplo8.errado;

public class RoboCortadorDePizza {

    private final CortadorDePizza cortadorDePizza;

    public RoboCortadorDePizza(CortadorDePizza cortadorDePizza) {
        this.cortadorDePizza = cortadorDePizza;
    }

    public void cortar(String sabor) {
        System.out.println("Pegar o cortador de pizza");
        cortadorDePizza.cortarComCortador();
        System.out.println("Servir 6 pedaços de pizza de " + sabor);
    }
}
