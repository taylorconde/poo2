package tech.pinho.poo2.exemplo8.errado;

public class Main {

    public static void main(String[] args) {
        CortadorDePizza cortadorDePizza = new CortadorDePizza();
        RoboCortadorDePizza roboCortadorDePizza = new RoboCortadorDePizza(cortadorDePizza);

        roboCortadorDePizza.cortar("mussarela");
    }
}
