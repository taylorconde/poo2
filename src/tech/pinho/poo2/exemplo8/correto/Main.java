package tech.pinho.poo2.exemplo8.correto;

public class Main {

    public static void main(String[] args) {
        ObjetoCortante objetoCortante = new Katana();
        RoboCortadorDePizza roboCortadorDePizza = new RoboCortadorDePizza(objetoCortante);

        roboCortadorDePizza.cortar("mussarela");
    }
}
